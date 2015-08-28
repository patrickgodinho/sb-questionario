package controllers;


import java.util.ArrayList;
import java.util.List;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.Option;
import models.Question;
import models.Quiz;
import models.User;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class OptionController extends Controller {
	
	public static Result upsert(){
		ObjectNode response = Json.newObject();
		JsonNode json = request().body().asJson();
		if(json==null){
			return badRequest("Expecting Json data");
		}
		else{
			Option o = new Option();
			o.setValue(json.findPath("value").asText());
			o.setQuestion(Question.find.byId(json.findPath("question").asLong()));
			
			o.save();
			
			response.put("Id", o.getId());
			
			
		}
		return ok(response);
	}
	
	public static Result list(){
		List<Option> objects = Ebean.find(Option.class).findList();
	 	return ok(Json.toJson(objects));
	 }
	
	public static Result findByQuestion(Long id){
		List<Option> options = Option.find.where().eq("question_id", id).findList();
		return ok(Json.toJson(options));
	}
	
	public static Result findById(Long Id){
		return ok(Json.toJson(Option.find.byId(Id)));
	}
	
	
}

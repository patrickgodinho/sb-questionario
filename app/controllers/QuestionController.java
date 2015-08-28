package controllers;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

public class QuestionController extends Controller {
	
	public static Result upsert(){
		ObjectNode response = Json.newObject();
		JsonNode json = request().body().asJson();
		if(json==null){
			return badRequest("Expecting Json data");
		}
		else{
			Question q = new Question();
			System.out.println("teste"+json);
			q.setQuestion(json.findPath("questiontxt").asText());
			q.setQuiz(Quiz.find.byId(json.findPath("quiz").asLong()));
			q.setType(json.findPath("type").asText());
			
			q.save();
	
			//Read the option values in 
			List<JsonNode> options = json.findValues("value");
			for (int i = 0; i < options.size(); i++) {
				Option o = new Option();
				o.setQuestion(q);
				o.setValue(options.get(i).asText());
				o.save();
			}
			
			response.put("Id", q.getId());
			
			
		}
		return ok(response);
	}
	
	public static Result list(){
		List<Question> objects = Ebean.find(Question.class).findList();
	 	return ok(Json.toJson(objects));
	 }
	
	public static Result findByQuiz(Long id){
		List<Question> objects = Question.find.where().eq("quiz_id", id).findList();
		return ok(Json.toJson(objects));
	}
	
	public static Result findById(Long Id){
		return ok(Json.toJson(Question.find.byId(Id)));
	}
	
	
}

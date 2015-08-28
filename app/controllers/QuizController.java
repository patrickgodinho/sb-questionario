package controllers;


import java.util.List;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.Quiz;
import models.User;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class QuizController extends Controller {
	
	public static Result upsert(){
		ObjectNode response = Json.newObject();
		JsonNode json = request().body().asJson();
		if(json==null){
			return badRequest("Expecting Json data");
		}
		else{
			
			String email = json.findPath("user").asText();
			User u = User.find.where().eq("email", email).findUnique();
			
			Quiz q = new Quiz();
			q.setDescription(json.findPath("description").asText());
			q.setTitle(json.findPath("title").asText());
			q.setUser(u);
			
			q.save();
			
			response.put("Id", q.getId());
			
			
		}
		return ok(response);
	}
	
	public static Result list(){
		List<Quiz> objects = Ebean.find(Quiz.class).findList();
	 	return ok(Json.toJson(objects));
	 }
	
	public static Result findByEmail(String property, String value){
		Quiz object = (Quiz) Quiz.find.where().ilike(property, value);
		return ok(Json.toJson(object));
	}
	
	public static Result findById(Long Id){
		return ok(Json.toJson(Quiz.find.byId(Id)));
	}
	
	
}

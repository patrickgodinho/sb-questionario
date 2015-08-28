package controllers;


import java.util.List;
import java.util.Optional;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.Quiz;
import models.User;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class UserController extends Controller {
	
	public static Result main(String any){
		return ok(main.render());
	}
	
	public static Result upsert(){
		ObjectNode response = Json.newObject();
		JsonNode json = request().body().asJson();
		if(json==null){
			return badRequest("Expecting Json data");
		}
		else{
			
			User u = new User();
			u.setEmail(json.findPath("email").asText());
			u.setName(json.findPath("name").asText());
			u.setPassword(json.findPath("password").asText());
			u.save();
			
			System.out.println(u.getEmail());
			response.put("Id", u.getId());
			
			
		}
		return ok();
	}
	
	public static Result list(){
	 	List<Quiz> objects = Ebean.find(Quiz.class).findList();
		return ok(Json.toJson(objects));
	 }
	
	public static Result authenticate() {
		ObjectNode response = Json.newObject();
		JsonNode json = request().body().asJson();
		String email = json.findPath("email").asText();
		String password = json.findPath("password").asText();
	    User u = User.find.where().eq("email", email).eq("password", password).findUnique();
	    if (u == null){
	    	return unauthorized();
	    }else{
	    	session().clear();
	    	session("email", u.getEmail());
	    	response.put("email", u.getEmail());
	    	response.put("idUser", u.getId());
	    	return ok(response);
	    }
	 }
	
	public static Result logoff(){
		session().clear();
		return ok();
	}
}

package controllers;


import java.util.List;

import com.avaje.ebean.Ebean;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import models.Answer;
import models.Question;
import models.Quiz;
import models.User;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

public class AnswerController extends Controller {
	
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
			String email = json.findPath("email").asText();
			System.out.println(email);
			Long questionId = json.findPath("question").asLong();
			
			//Questionario poderá ser respondido apenas por 1 email por vez.
			int verify = Answer.find.where().eq("email", email).eq("question_id", questionId).findRowCount();
			System.out.println(verify);
			if(verify==0){
				Answer a = new Answer();
				a.setAnswer(json.findPath("answer").asText());
				a.setQuestion(Question.find.byId(questionId));
				a.setEmail(email);
				a.save();
				
				response.put("Id", a.getId());
			}
			else{
				response.put("error", "uniqueEmail");
			}
		}
		return ok(response);
	}
	
	public static Result list(){
	 	List<Quiz> objects = Ebean.find(Quiz.class).findList();
		return ok(Json.toJson(objects));
	 }
}

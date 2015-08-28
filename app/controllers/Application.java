package controllers;


import play.db.ebean.Model;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	public static Result main(String any){
		return ok(main.render());
	}
	
	public static Result restService(String model, String operation){
		
		return TODO;
		
	}
}

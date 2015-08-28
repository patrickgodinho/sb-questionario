package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.db.ebean.Model;

@Entity
public class Question extends Model{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	public Long Id;
	
	@ManyToOne
	public Quiz quiz;
	
	public String question;
	public String type;
	
	
    public static Model.Finder<Long,Question> find = new Model.Finder<Long,Question>(Long.class, Question.class);


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public Quiz getQuiz() {
		return quiz;
	}


	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
    
	
	
}

package com.javatpoint;  
import java.util.Iterator;  
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 

public class Question {  
	private int id;  
	private String name;  
	private Map<Answer, User> answers;

	public void displayInfo(){
		System.out.println("question id:"+id);  
	    System.out.println("question name:"+name);  
	    System.out.println("Answers....");
	    
	    Set<Entry<Answer, User>> set=answers.entrySet();
	    Iterator<Entry<Answer, User>> itr=set.iterator();
	    
	    while(itr.hasNext()){
	        Entry<Answer, User> entry = itr.next();
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());
	    }  
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Answer, User> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Answer, User> answers) {
		this.answers = answers;
	}  

}
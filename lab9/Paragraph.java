package lab9;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element {
	  private String text;
		private String Value;
		private String oldValue;
		private String newValue;
		  private List<Observer> observers = new ArrayList<Observer>();

	  public Paragraph(String text) {
	    this.text = text;
	  }

	  @Override
	  public void print() {
	    System.out.println(text);
	  }

	  @Override
	  public void add(Element element) {
	    System.out.println("ERORR");
	  }

	  @Override
	  public void remove(Element element) {
	    System.out.println("ERORR");

	  }

	  @Override
	  public Element getElement(int index) {
	    System.out.println("ERORR");
	    return null;
	  }

	  @Override
	  public void accept(Visitor visitor) {
	    visitor.visit(this);
	  }

	  public void setNewValue(String newValue) {
			this.newValue=newValue;
	  }
	  public int  addObserver(Observer obs) {
		  observers.add(obs);
		  return observers.indexOf(obs);
	  }
	  public void removeObserver(Observer obs) {
		  observers.remove(obs);

	  }
	  public void notifyObservers() {
	  	
	  }
	  
	  
	}
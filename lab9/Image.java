package lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Image implements Element,Observable {
	private String oldNume;
	private String nume;
	private ArrayList<Observer> observersList = new ArrayList<Observer>();
	public Image() {
		
	}
	public Image(String nume)
	{
		this.nume = nume;
		addObserver(DocumentManager.getInstance().getFirstOberver());
		addObserver(DocumentManager.getInstance().getSecondOberver());
		try {
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	public void print() {
		System.out.println("Imagine: " + nume );
	}
	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visit(this);
	}
	@Override
	public void addObserver(Observer obs) {
		// TODO Auto-generated method stub
		this.observersList.add(obs);
		
	}
	@Override
	public void removeObserver(Observer obs) {
		// TODO Auto-generated method stub
		this.observersList.remove(obs);
		
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer obs : this.observersList)
		{
			obs.update(this.oldNume,this.nume);
		}
		
	}
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		this.oldNume = this.nume;
		this.nume = newValue;
		notifyObservers();
	}
	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Element getElement(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
package lab5;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
	  private String imageName;

	  public Image(String imageName) {
	    this.imageName = imageName;
	    
	    try {
			  TimeUnit.SECONDS.sleep(5);
			  } catch (InterruptedException e) {
			  e.printStackTrace();
			  }
	  }
	  
	
	  
	  

	  @Override
	  public void print() {
	    System.out.println(imageName);
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
	}
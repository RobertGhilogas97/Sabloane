package lab5;

public class CenterStrategy implements AlignStrategy {

	  @Override
	  public void print(String text) {
	    System.out.println("+++" + text + "+++");
	  }

	}
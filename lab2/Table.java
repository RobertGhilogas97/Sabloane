package lab2;

public class Table extends Element {
	  private String title;

	  public Table(String title) {
	    this.title = title;
	  }

	  @Override
	  public void print() {
	    System.out.println(title);
	  }

	}
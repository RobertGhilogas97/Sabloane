package lab2;

public class Paragraph extends Element {
	  private String text;

	  public Paragraph(String text) {
	    this.text = text;
	  }

	  @Override
	  public void print() {
	    System.out.println(text);
	  }

}
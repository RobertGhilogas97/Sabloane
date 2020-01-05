package lab6;

public class Paragraph implements Element {
	  private String text;

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

	}
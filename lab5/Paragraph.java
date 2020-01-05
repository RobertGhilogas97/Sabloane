package lab5;

public class Paragraph implements Element {
	  private String text;
	  private AlignStrategy align;

	  public AlignStrategy getAlignStrategy() {
	    return align;
	  }

	  public void setAlignStrategy(AlignStrategy alignStrategy) {
	    this.align = alignStrategy;
	  }

	  public Paragraph(String text) {
	    this.text = text;
	  }

	  @Override
	  public void print() {
	    if (align != null) {
	      align.print(text);
	    } else {
	      System.out.println(text);
	    }
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
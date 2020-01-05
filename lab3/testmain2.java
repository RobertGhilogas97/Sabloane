package lab3;

public class testmain2 {



	  public static void main(String[] args) {
	    Book noapteBuna = new Book("Noapte buna copii.!");
	    Section cap1 = new Section("Capitolul 1.");
	    cap1.add(new Paragraph("Text 1"));
	    cap1.add(new Paragraph("Text 2"));
	    cap1.add(new Image("Image 1"));
	    noapteBuna.add(cap1);
	    noapteBuna.add(new Paragraph("Multumesc"));
	    noapteBuna.print();
	  }

	}
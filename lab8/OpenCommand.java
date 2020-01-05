package lab8;


	public class OpenCommand implements Command {

	  @Override
	  public void execute() {
	    JSONBuilder jsonBuilder = new JSONBuilder("C:\\Users\\roby\\Desktop\\SPlab3\\lab3\\src\\lab8\\book.json");
	    jsonBuilder.build();
	    Book book = new Book("carte1");
	    book.add(jsonBuilder.getResult());
	    DocumentManager.getInstance().setBook(book);
	    book.print();
	  }
	}
	
	
	
	
	
	
	
	
package lab10_1;
public class OpenCommand implements Command{

	public String fileName;
	public OpenCommand(String filename) {
		this.fileName = filename;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		Builder jsonBuilder = new JSONBuilder(fileName);
		jsonBuilder.build();
		Element myBook = jsonBuilder.getResult();
		Book c = new Book("Carte");
		c.addContent(myBook);
		DocumentManager.getInstance().setBook(c);
	}
	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}

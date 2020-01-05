package lab9;

public class DocumentManager {
	private static DocumentManager doc;
	private Book book;
	private Observer firstObserver = new FirstObserver();
	private Observer secondObserver = new SecondObserver();
	private DocumentManager() {
		
	}
	public static DocumentManager getInstance()
	{
		if(doc == null) {
		doc = new DocumentManager();
		}
		return doc;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Observer getFirstOberver()
	{
		return this.firstObserver;
	}
	public Observer getSecondOberver()
	{
		return this.secondObserver;
	}
}
	
package lab10_1;
import java.util.Stack;

public class DocumentManager {
	private static DocumentManager doc;
	private Book book;
	private Section sectiune;
	private Observer firstObserver = new FirstObserver();
	private Observer secondObserver = new SecondObserver();
	private Stack<Command> history = new Stack<Command>();
	public Command getHistory() {
		Command c = this.history.peek();
		this.history.pop();
		return c;
	}
	public void setHistory(Command history) {
		this.history.push(history);
	}
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
	public void setSectiune(Section sectiune)
	{
		this.sectiune = sectiune;
	}
	public Section getSectiune()
	{
		return this.sectiune;
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

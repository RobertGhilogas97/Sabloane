package lab10_1;
public class main11 {
	public static void main(String []args) throws Exception
	{

		Section cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraf("Moto capitol"));
		cap1.add(new Paragraf("Another One"));
		cap1.add(new Paragraf("Another Two"));
		cap1.add(new Paragraf("Another Three"));
		
		DocumentManager.getInstance().setSectiune(cap1);
		System.out.println("Book Content: ");
		DocumentManager.getInstance().getSectiune().print();

		new DeleteCommand().execute();
		System.out.println("Book Content after the first delete: ");
		DocumentManager.getInstance().getSectiune().print();
		new DeleteCommand().execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.getInstance().getSectiune().print();
		Command undoCommand = new UndoCommand();
		undoCommand.execute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.getInstance().getSectiune().print();
		undoCommand.execute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.getInstance().getSectiune().print();
	}
}

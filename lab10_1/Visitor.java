package lab10_1;
public interface Visitor {
	public void visit(Image img);
	public void visit(ImagineProxy imgProxy);
	public void visit(Paragraf paragraf);
	public void visit(Table tabel);
}

package lab6;







public class testmain11 {

  public static void main(String[] args) {
    Section cap1 = new Section("Capitolul 1");
    Paragraph p1 = new Paragraph("Paragraph 1");
    cap1.add(p1);
    Paragraph p2 = new Paragraph("Paragraph 2");
    cap1.add(p2);
    Paragraph p3 = new Paragraph("Paragraph 3");
    cap1.add(p3);
    Paragraph p4 = new Paragraph("Paragraph 4");
    cap1.add(p4);
    cap1.add(new ImageProxy("ImageOne"));
    cap1.add(new Image("ImageTwo"));
    cap1.add(new Paragraph("Some text"));
    cap1.add(new Table("Table 1"));

    Section cap2 = new Section("Capitolul 1");
    Paragraph p12 = new Paragraph("Paragraph 1");
    cap2.add(p12);
    Book book = new Book("Cartea mea");
    book.add(cap1);
    book.add(cap2);

    BookStatistics stats = new BookStatistics();
    book.accept(stats);
    stats.printStatistics();
    financialBook stats1 = new financialBook();
    book.accept(stats1);
    stats1.printStatistics();
    Display display = new Display();
    cap1.accept(display);
  }

}
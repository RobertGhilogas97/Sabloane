package lab3;

public class testmain {


public static void main(String[] args) throws Exception {
Book noapteBuna = new Book("Noapte buna, copii!");

Author rpGheo = new Author("Radu Pavel Gheo");
noapteBuna.setAuthor(rpGheo);
Section cap1 = new Section("Capitolul 1");
Section cap11 = new Section("Capitolul 1.1");
Section cap111 = new Section("Capitolul 1.1.1");
Section cap1111 = new Section("Subchapter 1.1.1.1");

cap1.print();

noapteBuna.add(new Paragraph("Multumesc celor care au facut posibila......"));
noapteBuna.add(cap1);
cap1.add(new Paragraph("Moto capitol"));
cap1.add(cap11);
cap11.add(new Paragraph("Text from subchapter 1.1"));
cap11.add(cap111);
cap111.add(new Paragraph("Text from subchapter 1.1.1"));
cap111.add(cap1111);
cap1111.add(new Image("Image subchapter 1.1.1.1"));


noapteBuna.print2();
System.out.println("Authors: ");
rpGheo.print();
System.out.println("-------------------------- ");
noapteBuna.print();


//System.out.println("Capitole  ");
//cap1.print2();
//cap11.print2();
//cap111.print2();
//cap1111.print2();

}}
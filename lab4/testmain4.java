package lab4;

public class testmain4 {


public static void main(String[] args) throws Exception {
long startTime = System.currentTimeMillis();
Image img1 = new Image("Pamela Anderson");
Image img2 = new Image("Kim Kardashian");
Image img3 = new Image("Kirby Griffin");
Section playboyS1 = new Section("Front Cover");
playboyS1.add(img1);
Section playboyS2 = new Section("Summer Girls");
playboyS2.add(img2);
playboyS2.add(img3);
Book playboy = new Book("Playboy");

playboy.add(playboyS1);
playboy.add(playboyS2);
long endTime = System.currentTimeMillis();
System.out.println("Creation of the content took " + (endTime -
startTime) + " milliseconds");
startTime = System.currentTimeMillis();
playboyS1.print();
endTime = System.currentTimeMillis();
System.out.println("Printing of the section 1 took " + (endTime -
startTime) + " milliseconds");
startTime = System.currentTimeMillis();
playboyS1.print();
endTime = System.currentTimeMillis();
System.out.println("Printing again the section 1 took " + (endTime -
startTime) + " milliseconds");
}}
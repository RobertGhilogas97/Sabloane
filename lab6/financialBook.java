package lab6;

public class financialBook extends BookStatistics {
	  
private int x=5,y=3,z=4,q=6,r=7;
	  

	  
	  public void printStatistics() {
	    System.out.println("Book Statistics:");
	    System.out.println("*** Number of images: " + numberOfImages+", cost total ="+numberOfImages*x+" cost pentru una ="+x);
	    System.out.println("*** Number of tables: " + numberOfTables+" , cost total ="+numberOfTables*y+" cost pentru una ="+y);
	    System.out.println("*** Number of paragraphs: " + numberOfParagraphs+" , cost total ="+numberOfParagraphs*z+" cost pentru una ="+z);
	    System.out.println("*** Number of proxy images: " + numberOfImageProxy+" , cost total ="+numberOfImageProxy*q+" cost pentru una ="+q);
	    System.out.println("*** Number of sections: " + numberOfSections+", cost total ="+numberOfSections*r+" cost pentru una ="+r);
	  }

	  
	}
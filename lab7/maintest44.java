package lab7;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class maintest44 {
	  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
	    JSONBuilder jsonBuilder = new JSONBuilder("C:\\Users\\roby\\Desktop\\SPlab3\\lab3\\src\\lab7\\book.json");
	    jsonBuilder.build();

	    Element myBook = jsonBuilder.getResult();
	    myBook.print();
	  }
	}
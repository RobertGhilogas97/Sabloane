package lab2;
import java.util.ArrayList;
import java.util.List;
public class Chapter {
	  private String name;
	  private List<SubChapter> subChapters = new ArrayList<>();

	  public Chapter(String chapterName) {
	    name = chapterName;
	  }

	  public int createSubChapter(String subChapterName) {
	    subChapters.add(new SubChapter(subChapterName));
	    return subChapters.size() - 1;
	  }

	  public SubChapter getSubChapter(int indexOfSubChapter) {
	    return subChapters.get(indexOfSubChapter);
	  }

	  public void print() {
	    System.out.println("Chapter: " + name);
	    for (SubChapter subChapter : subChapters) {
	      subChapter.print();
	    }
	  }

	}
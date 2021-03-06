package lab7;


import java.util.ArrayList;
import java.util.List;

public class Book implements Element {
  private Author author;
  private List<Element> content = new ArrayList<Element>();
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book(String name) {
    this.name = name;
  }

  @Override
  public void add(Element element) {
    this.content.add(element);
  }

  @Override
  public void remove(Element element) {
    this.content.remove(element);
  }

  @Override
  public Element getElement(int index) {
    return this.content.get(index);
  }

  @Override
  public void print() {
    for (Element element : content) {
      element.print();
    }
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  @Override
  public void accept(Visitor visitor) {
    for (Element element : content) {
      element.accept(visitor);
    }
    visitor.visit(this);
  }
}
package myPackage;

public class EncapsulationEx {
//Encapsulation: bir sınıfa ait değişkenlerin değerlerinin sadece o sınıfa ait kalması ve bunun meyodlarla erişilebilir hale getirilmesi
// getter,setter methodları gibi 
	public String name,author,publisher;
	private int numberOfPage;
	
	public EncapsulationEx(String name, int numberOfPage, String author, String publisher) { //Constructor
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		if(numberOfPage<1) {
			this.numberOfPage=10; //default
		}else {
			this.numberOfPage=numberOfPage;
		}
	}
public int getNumberOfPage() {
	
	return this.numberOfPage;
	
}
public void setNumberOfPage(int page) {
	if (page<=0) {
		System.out.println("Number of page dont zero or negative number");
		this.numberOfPage=10;
	}else {
	this.numberOfPage=page; 
	}
}
public String getName(){
	return this.name;
}
public void setName(String name) {
	this.name=name;
}

public String getAuthor() {
	return this.author;
}
public void setAuthor(String author) {
	this.author=author;
}


public String getPublisher() {
	return this.publisher;
}
public void setPublisher(String publisher) {
	this.publisher= publisher;
}
public String toString()
{
	return "Book: "+
           "name='" + name + '\'' +
           ", author='"+ author + '\'' +
           ", publisher='"+ publisher + '\'' +
           ", number of page='"+ numberOfPage + '\'' ; 

}
	
	public static void main(String[] args) {

		EncapsulationEx Book1= new EncapsulationEx("Harry Potter", 400, "Rowling", "Martı");
		// System.out.println(Book1); override edilmediğinden console bize sınıf adını ve adresini verir
		Book1.getNumberOfPage();
		System.out.println("Old Page: "+Book1.getNumberOfPage()); //400 
		Book1.setNumberOfPage(500);
		int newPage= Book1.getNumberOfPage();//500 
		System.out.println("New page: "+newPage);
		System.out.println("publisher: "+Book1.getPublisher());
		System.out.println("Author: "+Book1.getAuthor());
		System.out.println(Book1.toString());
		
		}
}

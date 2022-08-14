package Constructors;

public class DefaultConstructors {
	int id;
	String name;
	//passing the null values//
	void display(){
	System.out.println(id+" "+name);
	}
public static  void main(String[]args) {
	DefaultConstructors student1 = new DefaultConstructors();
	DefaultConstructors student2 = new DefaultConstructors();
		student1.display();
		student2.display();
	}
}


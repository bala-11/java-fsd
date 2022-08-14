package Constructors;

public class Student {
	Student(){
		@SuppressWarnings("unused")
		int id;
		@SuppressWarnings("unused")
		String name;
	}
	void Display(int id,String name) {
		System.out.println("["+"Id="+id+"  Name:"+name+"]");
	}

	public static void main(String[] args) {
		Student std1 =new Student();
		Student std2 =new Student();
		std1.Display(001, "Ram");
		std2.Display(002, "Krishna");
	}

}

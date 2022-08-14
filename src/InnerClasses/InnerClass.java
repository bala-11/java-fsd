package InnerClasses;

public class InnerClass {
	private String text="Welcome to Java";
	 class Inner {
		void Display() {
			System.out.println(text+" "+"Fundamentals");
		}

	}
	public static void main(String[] args) {
		InnerClass in = new InnerClass();
		InnerClass.Inner in1 = in.new Inner();
		in1.Display();
	}

}


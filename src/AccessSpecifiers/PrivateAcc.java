package AccessSpecifiers;
public class PrivateAcc {
		private void Display(){
		System.out.println("We are private");	
		}

public static void main(String[] args) {
PrivateAcc op = new PrivateAcc();
System.out.println("We are calling private ");
op.Display();

			}
}

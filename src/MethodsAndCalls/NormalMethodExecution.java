package MethodsAndCalls;

class NormalMethodExecution{
	double Multiple(double a, double b) {
		return  a*b;
	}

	public static void main(String[] args) {

	NormalMethodExecution yp = new NormalMethodExecution();
	double ans= yp.Multiple(123.12,32);
	System.out.println("Multipilcation is :"+ ans);
	}
}

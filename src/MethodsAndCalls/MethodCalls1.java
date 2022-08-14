package MethodsAndCalls;

public class MethodCalls1 {

	int value =220;

	int operation(int value) {
		value =value*10/100;
		return value;
	}

	public static void main(String args[]) {
		MethodCalls1 mc = new MethodCalls1();
		System.out.println("Before operation value of data is "+mc.value);
		mc.operation(100);
		System.out.println("After operation value of data is "+mc.value);
		}
	}


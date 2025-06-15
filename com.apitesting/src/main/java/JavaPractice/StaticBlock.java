package JavaPractice;

public class StaticBlock {
	static {
		System.out.println("static block is executing first in case of main method also present");
	}
	public static void main(String[] args) {
		System.out.println("1)static block 2)main method");

	}

}

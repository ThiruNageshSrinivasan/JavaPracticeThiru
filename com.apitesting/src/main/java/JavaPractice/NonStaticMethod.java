package JavaPractice;

class Test2{
	void display() {
		System.out.println("hi thiru this is nonstatic method");
	}
}


//this is not staic method object is required to call the method
public class NonStaticMethod {
	public static void main(String[] args) {
		Test2 tc=new Test2();	

		tc.display();
	}


}

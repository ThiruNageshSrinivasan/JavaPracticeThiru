package JavaPractice;
class Final{
	final  double pi=3.14;


void display() {
	System.out.println(pi+" this is an constan value cannot change");
}
}
public class FinalKeyword {

	public static void main(String[] args) {
		Final fi = new Final() ;
		System.out.println(fi.pi);
		fi.display();
			
	

	}

}

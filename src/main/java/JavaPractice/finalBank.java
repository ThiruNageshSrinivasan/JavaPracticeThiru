package JavaPractice;

public class finalBank {

    final void displayInterestRate() {
        System.out.println("Fixed rate: 5%");
    }
}

class SBI extends  finalBank  {
    // ❌ This will cause a compile-time error!
    // void displayInterestRate() { ... }
}

//final class Constants {
  //  public static final double PI = 3.14159;
//}

// ❌ This will throw an error!
// class MyConstants extends Constants { ... }
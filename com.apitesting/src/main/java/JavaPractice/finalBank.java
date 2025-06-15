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
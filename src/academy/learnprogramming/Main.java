package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        //Define the type and declare & call methods
        ITelephone johnsPhone;
        johnsPhone = new DeskPhone(123456);
        johnsPhone.powerOn();
        johnsPhone.callPhone(123456);
        johnsPhone.answer();

        // new instance but it implements the same interface
        johnsPhone = new MobilePhone(24565);
        //johnsPhone.poweron();
        johnsPhone.callPhone(24565);
        johnsPhone.answer();

    }
}

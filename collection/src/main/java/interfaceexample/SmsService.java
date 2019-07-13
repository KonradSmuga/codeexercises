package interfaceexample;

import interfaceexample.interfaces.Rentable;

public class SmsService {

    public void sentSms(Rentable rentable) {

        System.out.println("You have just rented ");
        System.out.println(rentable.generateDescription());

    }
}

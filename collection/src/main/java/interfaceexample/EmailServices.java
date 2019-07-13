package interfaceexample;

import interfaceexample.interfaces.Rentable;

public class EmailServices {

    public void sentEmail(Rentable rentable) {

        System.out.println("You have just rented ");
        System.out.println(rentable.generateDescription());

    }
}

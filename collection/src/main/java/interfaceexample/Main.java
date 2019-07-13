package interfaceexample;

import interfaceexample.interfaces.Rentable;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Rentable scooter = new Scooter("Lime", BigDecimal.valueOf(2.5));
        Rentable car = new Car("BMW", BigDecimal.valueOf(5), 1996);
        Rentable trailer = new Trailer(BigDecimal.valueOf(1));


        SmsService smsService = new SmsService();
        RentService rentService = new RentService();
        EmailServices emailServices = new EmailServices();

        rentService.calculatePrice(scooter, 3);
        smsService.sentSms(scooter);
        emailServices.sentEmail(scooter);

        rentService.calculatePrice(scooter, 10);



    }


}

package Test;

import java.time.LocalTime;

public class MainTest {
    public static void main(String[] args) {
        AieTrip trip1= new AieTrip(1200,LocalTime.of(15,00),"Shiraz",false,10);
        trip1.checkStatus();
        trip1.checkDelay(1);

    }
}

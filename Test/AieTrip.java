package Test;

import javax.xml.crypto.Data;
import java.time.LocalTime;
import java.util.Date;

public class AieTrip {
    private int tripNo;
    private LocalTime tripHour;
    private String destination;
    private Boolean isFly;
    private int delay;

    public AieTrip(int tripNo, LocalTime tripHour, String destination, Boolean isFly,int delay) {
        this.tripNo = tripNo;
        this.tripHour = tripHour;
        this.destination = destination;
        this.isFly = isFly;
        this.delay=delay;
    }

    public void checkStatus(){
        if(LocalTime.now().equals(this.tripHour)){
            System.out.println("The flight is On time");
        }
        else if (LocalTime.now().isAfter(this.tripHour) && this.isFly==false){
            System.out.println("The flight is Delayed");
        }
        else if (LocalTime.now().isAfter(this.tripHour) && this.isFly==true){
            System.out.println("The flight has flown");
        }
        else if(LocalTime.now().isBefore(this.tripHour) && this.isFly==false){
            System.out.println("The flight is talking passengers");
        }
        else if(LocalTime.now().isBefore(this.tripHour) && this.isFly==true){
            System.out.println("The flight has left early");
        }
    }

    public void checkDelay(int flightDelay){
         this.delay=flightDelay;
         this.tripHour=this.tripHour.plusMinutes(flightDelay);

    }
}

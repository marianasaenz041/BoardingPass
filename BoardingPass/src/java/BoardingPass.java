import java.util.Scanner;
import java.util.Random;

public class BoardingPass {

    public void firstLine(Scanner input, Boarding_Pass_Info a){
        Random random = new Random();

        System.out.print("Boarding Pass Number: ");
        String setBoardingPassNumber = input.nextLine();
        a.setBoardingPassNumber(setBoardingPassNumber);


        System.out.print("Departure Date(MM/DD/YYYY): ");
        String setDate = input.nextLine();
        a.setDate(setDate);


        System.out.print("Origin: ");
        String setOrigin = input.nextLine();
        a.setOrigin(setOrigin);


        System.out.print("Destination: ");
        String setDestination = input.nextLine();
        a.setDestination(setDestination);


        //Random ETA generator
        int hour = random.nextInt(23);
        int minute = random.nextInt(59);
        if(minute < 10 ){
            String setETA = String.valueOf(hour) + ":0" + String.valueOf(minute);
            System.out.println("ETA: " + setETA);
        }else {
            String setETA = String.valueOf(hour) + ":" + String.valueOf(minute);
            System.out.println("ETA: " + setETA);
        }

        System.out.print("Departure Time: ");
        String setDepartureTime = input.nextLine();
        a.setDepartureTime(setDepartureTime);


    }


    //Second line of info in Boarding pass
    public void secondLine(Scanner input, Boarding_Pass_Info a){

        System.out.print("Name: ");
        String setName = input.nextLine();
        a.setName(setName);


        System.out.print("Email: ");
        String setEmail = input.nextLine();
        a.setEmail(setEmail);


        System.out.print("Phone Number: ");
        String setPhoneNumber = input.nextLine();
        a.setPhoneNumber(setPhoneNumber);


        System.out.print("Gender(F/M): ");
        String setGender = input.nextLine();
        a.setGender(setGender);


        System.out.print("Age: ");
        int setAge = input.nextInt();
        a.setAge(setAge);


    }

    public void ticketPrice(Boarding_Pass_Info a){
        int min = 120;
        int max = 1000;
        int ticketPrice = (int)Math.floor(Math.random()*(max-min+1)+min);

        if(a.getAge() <= 12){
            System.out.println("Ticket Price is: $" + ticketPrice);
            System.out.println("Children 12 and under get a %50 discount.");
            ticketPrice -= (ticketPrice * 0.5);
            System.out.println("Ticket Price after discount: $" + ticketPrice);
        }else if(a.getAge() >= 60){
            System.out.println("Ticket Price is: $" + ticketPrice);
            System.out.println("Senior citizens of 60 years or older receive a %60 discount.");
            ticketPrice -= (ticketPrice * 0.6);
            System.out.println("Ticket price after %60 discount: $" + ticketPrice);
        }else if(a.getGender().contains("F")){
            System.out.println("Ticket Price is: $" + ticketPrice);
            System.out.println("Women receive a %25 discount.");
            ticketPrice -= (ticketPrice * 0.25);
            System.out.println("Price after %25 discount: $" + ticketPrice);
        }else{
            System.out.println("Ticket Price is: $" + ticketPrice);
        }
    }
}

import java.util.Scanner;
import java.util.Random;

public class BoardingPass {

    public void firstLine(){
        Scanner input = new Scanner(System.in);
        Boarding_Pass_Info a = new Boarding_Pass_Info();
        Random random = new Random();

        System.out.println("Boarding Pass Number: ");
        String setBoardingPassNumber = input.nextLine();
        a.setBoardingPassNumber(setBoardingPassNumber);


        System.out.println("Departure Date(MM/DD/YYYY): ");
        String setDate = input.nextLine();
        a.setDate(setDate);


        System.out.println("Origin: ");
        String setOrigin = input.nextLine();
        a.setOrigin(setOrigin);


        System.out.println("Destination: ");
        String setDestination = input.nextLine();
        a.setDestination(setDestination);


        //Random ETA generator
        int hour = random.nextInt(24);
        int minute = random.nextInt(50);
        String setETA = String.valueOf(hour) + ":" + String.valueOf(minute);


        System.out.println("Departure Time: ");
        String setDepartureTime = input.nextLine();
        a.setDepartureTime(setDepartureTime);


    }


    //Second line of info in Boarding pass
    public void secondLine( ){
        Scanner scanner = new Scanner(System.in);
        Boarding_Pass_Info b = new Boarding_Pass_Info();

        System.out.println("Name: ");
        String setName = scanner.nextLine();
        b.setName(setName);


        System.out.println("Email: ");
        String setEmail = scanner.nextLine();
        b.setEmail(setEmail);


        System.out.println("Phone Number: ");
        String setPhoneNumber = scanner.nextLine();
        b.setPhoneNumber(setPhoneNumber);


        System.out.println("Gender(F/M): ");
        String setGender = scanner.nextLine();
        b.setGender(setGender);


        System.out.println("Age: ");
        int setAge = scanner.nextInt();
        b.setAge(setAge);


    }

    public void ticketPrice(){
        int min = 120;
        int max = 1000;
        int ticketPrice = (int)Math.floor(Math.random()*(max-min+1)+min);
        Boarding_Pass_Info c = new Boarding_Pass_Info();
        System.out.println(c.getAge());

        if(c.getAge() <= 12){
            System.out.println("Ticket Price is: $" + ticketPrice);
            System.out.println("Children 12 and under get a %50 discount.");
            ticketPrice -= (ticketPrice * 0.5);
            System.out.println("Ticket Price after discount: $" + ticketPrice);
        }else if(c.getAge() >= 60){
            System.out.println("Ticket Price is: $" + ticketPrice);
            System.out.println("Senior citizens of 60 years or older receive a %60 discount.");
            ticketPrice -= (ticketPrice * 0.6);
            System.out.println("Ticket price after %60 discount: $" + ticketPrice);
        }else if(c.getGender().contains("F")){
            System.out.println("Ticket Price is: $" + ticketPrice);
            System.out.println("Women receive a %25 discount.");
            ticketPrice -= (ticketPrice * 0.25);
            System.out.println("Price after %25 discount: $" + ticketPrice);
        }else{
            System.out.println("Ticket Price is: $" + ticketPrice);
        }
    }
}

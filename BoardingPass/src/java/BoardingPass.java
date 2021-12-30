import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.Random;


public class BoardingPass {


    public void firstLine(Scanner input, Boarding_Pass_Info a, BufferedWriter writer) throws IOException {
        Random random = new Random();

        System.out.print("Boarding Pass Number: ");
        a.setBoardingPassNumber(input.nextLine());
        writer.write("Boarding Pass Number: " + a.getBoardingPassNumber());


        System.out.print("Departure Date(MM/DD/YYYY): ");
        a.setDate(input.nextLine());
        writer.write("   Departure date: " + a.getDate());

        System.out.print("Origin: ");
        a.setOrigin(input.nextLine());
        writer.write("   Origin: " + a.getOrigin());

        System.out.print("Destination: ");
        a.setDestination(input.nextLine());
        writer.write("   Destination: " + a.getDestination());

        //Random ETA generator
        int hour = random.nextInt(23);
        int minute = random.nextInt(59);
        if(minute < 10 ){
            String setETA = String.valueOf(hour) + ":0" + String.valueOf(minute);
            writer.write("   ETA: " + setETA);
        }else {
            String setETA = String.valueOf(hour) + ":" + String.valueOf(minute);
            writer.write("   ETA: " + setETA);
        }


        System.out.print("Departure Time: ");
        a.setDepartureTime(input.nextLine());
        writer.write("   Departure Time: " + a.getDepartureTime());
        writer.write("\n");

    }


    //Second line of info in Boarding pass
    public void secondLine(Scanner input, Boarding_Pass_Info a, BufferedWriter writer) throws IOException {

        System.out.print("Name: ");
        a.setName(input.nextLine());
        writer.write("Name: " + a.getName());

        System.out.print("Email: ");
        a.setEmail(input.nextLine());
        writer.write("   Email: " + a.getEmail());

        System.out.print("Phone Number: ");
        a.setPhoneNumber(input.nextLine());
        writer.write("   Phone Number: " + a.getPhoneNumber());


        System.out.print("Gender(F/M): ");
        a.setGender(input.nextLine());
        writer.write("   Gender: " + a.getGender());


        System.out.print("Age: ");
        a.setAge(input.nextInt());
        writer.write("   Age: " + a.getAge());
        writer.write("\n");


    }

    public void ticketPrice(Boarding_Pass_Info a, BufferedWriter writer) throws IOException {
        int min = 120;
        int max = 700;
        double discount;
        int ticketPrice = (int)Math.floor(Math.random()*(max-min+1)+min);

        if(a.getAge() <= 12){
            writer.write("Ticket Price: $" + ticketPrice);
            discount = ticketPrice * 0.5;
            writer.write("\nChildren's Discount %50: -$" + discount);
            ticketPrice -= (ticketPrice * 0.5);
            writer.write("\nTotal: $" + ticketPrice);
        }else if(a.getAge() >= 60){
            writer.write("Ticket Price: $" + ticketPrice);
            discount = ticketPrice * 0.6;
            writer.write("\nSenior Citizen Discount %60: -$" + discount);
            ticketPrice -= (ticketPrice * 0.6);
            writer.write("\nTotal: $" + ticketPrice);
        }else if(a.getGender().contains("F")){
            writer.write("Ticket Price: $" + ticketPrice);
            discount = ticketPrice * 0.25;
            writer.write("\nWomen's Discount %25: -$" + discount);
            ticketPrice -= (ticketPrice * 0.25);
            writer.write("\nTotal: $" + ticketPrice);
        }else{
            writer.write("Total: $" + ticketPrice);
        }
        writer.write("\n\n\n\n\n");
    }
}

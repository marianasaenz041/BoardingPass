import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javaprojects\\BoardingPass\\BoardingTicket.txt", true));
        Scanner input = new Scanner(System.in);
        BoardingPass bp = new BoardingPass();
        Boarding_Pass_Info a = new Boarding_Pass_Info();

        writer.write("                          PYRAMID AIRLINE BOARDING PASS\n");
        bp.firstLine(input, a, writer);
        bp.secondLine(input, a, writer);
        bp.ticketPrice(a, writer);
        writer.close();
    }
}
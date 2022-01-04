import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("BoardingTicket.txt", true));
        BufferedReader reader = new BufferedReader(new FileReader("BoardingTicket.txt"));
        Scanner input = new Scanner(System.in);
        BoardingPass bp = new BoardingPass();
        Boarding_Pass_Info a = new Boarding_Pass_Info();

        writer.write("                          PYRAMID AIRLINE BOARDING PASS\n");
        bp.firstLine(input, a, writer);
        bp.secondLine(input, a, writer);
        bp.ticketPrice(a, writer);
        writer.close();
        bp.displayToConsole(reader);
    }
}
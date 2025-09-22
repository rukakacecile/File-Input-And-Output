import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filename = "user_detailed.txt";
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            System.out.println("******** Student Report System **********");

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your roll number: ");
            int rollnumber = scanner.nextInt();

            System.out.print("Enter your marks: ");
            double marks = scanner.nextDouble();


            writer.write("Name : " + name);
            writer.newLine();

            writer.write("Roll Number : " + rollnumber);
            writer.newLine();

            writer.write("Marks : " + marks);
            writer.newLine();

            writer.write("-----------------------------");
            writer.newLine();


            System.out.println("✅ Details saved successfully to file: \n" + filename);

        } catch (IOException e) {
            System.out.println(" Error while writing: " + e.getMessage());
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("\n===== Saved Student Details =====");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
            System.out.println("=================================");
            System.out.println("-----------------------------");
        } catch (IOException e) {
            System.out.println(" Error while reading: " + e.getMessage());
        }

        scanner.close();
    }
}

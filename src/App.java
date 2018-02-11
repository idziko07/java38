import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        BufferedWriter bfw = new BufferedWriter(new FileWriter("plik.txt"));

        System.out.println("Ile liczb chcesz podać: ");
        int quantity = input.nextInt();

        double[] numbers = new double[quantity];

        for (int i = 0; i< numbers.length;i++){
            System.out.println("Podaj " + (i + 1) + " liczbe: " );
            numbers[i] = input.nextDouble();
        }

        bfw.write(Arrays.toString(numbers));
        bfw.newLine();
        bfw.close();
    }
}

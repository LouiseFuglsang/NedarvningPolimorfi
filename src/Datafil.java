import java.io.FileNotFoundException;
import java.util.Scanner;


public class Datafil {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Velkommen til Grøntorvets lagersystem");
        System.out.println("Indlæser data...");

        Datafil datafil = new Datafil();
        datafil.save();
        datafil.load();
    }


    public void save() throws FileNotFoundException {

        java.io.File file = new java.io.File("data/Goods.txt");
        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to the file
        output.print("Apple ");
        output.println(158);
        output.print("Daisies ");
        output.println(143);
        output.print("Danish ");
        output.println(23);
        output.print("Peas ");
        output.println(1116);
        output.print("Peonies ");
        output.println(140);


        // Close the file
        output.close();
    }

    public void load() throws FileNotFoundException {
        // Create a File instance
        java.io.File file = new java.io.File("data/Goods.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            String vare = input.next();
            int antal = input.nextInt();
            System.out.println(
                    vare + " " + antal);
        }

        // Close the file
        input.close();
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Mainc {
public int numberOfRows;
    public static void main(String[] args) throws FileNotFoundException {

    File file = new File(args[0]);
    Scanner scan = new Scanner(file);
    this.numberOfRows = scan.nextInt();
    System.out.println(numberOfRows);
    while(scan.hasNextLine()){
        String str = scan.nextLine();
        System.out.println(str);
    }


    }
}

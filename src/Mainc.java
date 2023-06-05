import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Mainc {

    public static void main(String[] args) throws FileNotFoundException {

    File file = new File("/Users/christoffer/IdeaProjects/Lekstugan/src/input.txt");
    Scanner scan = new Scanner(file);

    while(scan.hasNextLine()){
        String str = scan.nextLine();
        System.out.println(str);
    }


    }
}

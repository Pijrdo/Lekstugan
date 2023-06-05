import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Mainc {
public int numberOfRows;
    public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(System.in);

    /*
    int numberOfRows;
    numberOfRows = scan.nextInt();
    System.out.println(numberOfRows);
    */

        ArrayList<String> stringArray = new ArrayList<>();

    while(scan.hasNextLine()) {
        stringArray.add(scan.nextLine());
    }


    ArrayList<Integer> arrayMedian = new ArrayList<>();
    int i = 1;
    while(i < stringArray.size()) {
        ArrayList<Integer> arrayInt = new ArrayList<>();
        Integer[] numbers = new Integer[100];
        String s = stringArray.get(i);
        String[] s2 = s.split(" ");
        //System.out.println("s2 length is " + s2.length);
        for(int j = 0; j < s2.length; j++) {
            System.out.print(s2[j] + " ");
            arrayInt.add(Integer.valueOf(s2[j]));
        }
        System.out.println();
        Collections.sort(arrayInt);
        arrayMedian.add(arrayInt.get((arrayInt.size()+1)/2-1));
        i++;
    }
    Collections.sort(arrayMedian);
    System.out.println(arrayMedian.get((arrayMedian.size()+1)/2-1));
    }
}

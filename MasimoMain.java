
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Queue;
import java.util.regex.*;

public class MasimoMain{
	public static void main(String arg[]) throws IOException{
        String fileAddress = "TEST.txt";
		Scanner console = new Scanner( System.in );
        String choice = "s";
        String c="";
        String n="";
        List<Double> testList= readFromText(fileAddress);
		while(true){
			if(choice.startsWith("s")){
				System.out.print("what is the c? ");
				c = console.nextLine().trim();
                System.out.print("what is the N? ");
                n = console.nextLine().trim();               
                Calculation.getInstance().calculate(Integer.parseInt(c),Integer.parseInt(n),testList);
            }else if ( choice.startsWith( "q" ) ) {
                break;
            }
            System.out.println();
            System.out.print( "(s)tart, (q)uit ? " );
            choice = console.nextLine().trim().toLowerCase();

		}
	}
	public static List<Double> readFromText(String address) throws IOException {
        Scanner inFile = new Scanner(new File(address));

        List<Double> temps = new ArrayList<>();
        // while loop
        while (inFile.hasNext()) {
          // find next line
          String token = inFile.next();
          temps.add(Double.parseDouble(token));
        }
        inFile.close();
        return temps;           
    }

} 

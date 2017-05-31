import java.util.*;
import java.io.*;

public class MasimoMain{
	public static void main(String arg[]) throws Exception{
        String fileAddress = "TEST.txt";
		Scanner console = new Scanner( System.in );
        String choice = "s";
        int c,n;
        List<Float> testList= readFromText(fileAddress);
		while(true){
			if(choice.startsWith("s")){
                try{
                    System.out.print("what is the c? ");
                    c = Integer.valueOf(console.nextLine().trim());
                    System.out.print("what is the N? ");
                    n = Integer.valueOf(console.nextLine().trim());
                    while(c>=n||c<0||n>300)
                    {
                        System.out.println("please enter valid c and N. (0<=c<n<=300)");
                        System.out.print("what is the c? ");
                        c = Integer.valueOf(console.nextLine().trim());
                        System.out.print("what is the N? ");
                        n = Integer.valueOf(console.nextLine().trim());   
                    }
                    Calculation.getInstance().calculate(c,n,testList);
                }catch(IllegalArgumentException iae){
                    System.out.println("Can not parse Input, please try again? ");
                }
				
            }else if ( choice.startsWith( "q" ) ) {
                break;
            }
            System.out.println();
            System.out.print( "(s)tart, (q)uit ? " );
            choice = console.nextLine().trim().toLowerCase();

		}
	}
    //read the array from the array of N
	public static List<Float> readFromText(String address) throws IOException {
            Scanner inFile = new Scanner(new File(address));
            List<Float> temps = new ArrayList<>();
            // while loop
            while (inFile.hasNext()) {
              // find next line
              String token = inFile.next();
              temps.add(Float.parseFloat(token));
            }
            inFile.close();
            return temps;       
    }

} 

import java.util.*;
public class Calculation{
	private static Calculation instance = null;
   	private Calculation() {
		
   	}
	public static Calculation getInstance() {
	  if(instance == null) {
	     instance = new Calculation();
	  }
	  return instance;
	}

	public void calculate(int c, int n, List<Double> testArray){
		Float[][] res = new Float[c+1][c+1]; 
		for(int k=0;k<=c;k++){
			for(int j=0;j<=c;j++){
				float subresult=0; 
				for(int i=c;i<n;i++){
					double tempNumber = testArray.get(i-k)*testArray.get(i-j);
					subresult +=(float)tempNumber;
				}
				res[k][j]=subresult;
				System.out.println(subresult);
			}
		}
	}	
}
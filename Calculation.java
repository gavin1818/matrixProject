import java.util.*;
import java.text.*;
public class Calculation{
	private static Calculation instance = null;
   	private Calculation() {}
	public static Calculation getInstance() {
	  if(instance == null) {
	     instance = new Calculation();
	  }
	  return instance;
	}

	public Float[][] calculate(int c, int n, List<Float> testArray){
		DecimalFormat df = new DecimalFormat("#.######");
		Float[][] res = new Float[c+1][c+1]; 
		for(int k=0;k<=c;k++){
			for(int j=0;j<=c;j++){
				float subresult=0; 
				for(int i=c;i<n;i++){
					Float tempNumber = testArray.get(i-k)*testArray.get(i-j);
					subresult +=tempNumber;
				}
				subresult = Float.parseFloat(df.format(subresult));
				res[k][j]=subresult;
				System.out.println(subresult);
			}
		}
		return res;
	}
}
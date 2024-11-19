// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		double piaprox = 0.0;
	    for(double i = 0; i < Double.parseDouble(args[0]) ; i ++){
			if(i % 2 == 0){
				piaprox += (1.0/((i*2.0)+1.0));
			}else{
				piaprox -=  (1.0/((i*2.0)+1.0));
			}// The HYPOCRISY
		}	
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + (piaprox*4));
		}
		
	}

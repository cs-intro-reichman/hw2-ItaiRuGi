// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) {
		double piaprox = 1.0;
			if(Integer.parseInt(args[0]) == 1){
				
			}else{
	    	for(double i = 1.0; i < Integer.parseInt(args[0]) + 1 ; i ++){
				if(i % 2 == 0){
					piaprox = piaprox + (1.0/(i*2+1));
				}else if (i%2 != 0){
					piaprox = piaprox - (1.0/(i*2+1));
				}
			}	
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + (piaprox*4));
	}
}

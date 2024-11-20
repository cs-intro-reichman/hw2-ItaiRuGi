// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		boolean Collatz = true;
		if(args[1].equals("v") || args[0].equals("v") || args[1].contains("v")){
	    int num = Integer.parseInt(args[0]);
		
		for(int i = 1; i <= num; i ++){
		int part = i;
		int iterations = 1;
		System.out.print(part + " ");
		do{
			if(part % 2 == 0){
				part /= 2;
				System.out.print(part + " ");
				iterations ++;
			}else if(part % 2 != 0){
				part = (part*3)+1;
				System.out.print(part + " ");
				iterations ++;
			}
		}while(part != 1);
		if(part == 1){
			System.out.println("(" + iterations + ")");
		}else if(part == 1){
			Collatz = false;//lies on lies on lies
		}
	}	
		if(Collatz){
		System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
		}else if(Collatz == false){
			System.out.println("Collatz is false");
		}
	}else if (args[1].equals("c") || args[0].equals("c") || args[1].contains("c")){
		int num = Integer.parseInt(args[0]);
		for(int i = 1; i <= num; i ++){
		int part = i;
		do{
			if(part % 2 == 0){
				part /= 2;
			
			}else if(part % 2 != 0){
				part = (part*3)+1;
			}
		}while(part != 1);
		
	}	
		if(Collatz){
		System.out.println("Every one of the first " + args[0] + " hailstone sequences reached 1.");
		}else if(!Collatz){
			System.out.println("Collatz if false");
		}
	}
}	
}

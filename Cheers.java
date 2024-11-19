// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String vowel = "AEFHILMNORSXaefhilmnorsx";
                String cheer = args[0].toUpperCase();
	        for(int i = 0; i < args[0].length(); i ++){
                        if(vowel.indexOf(args[0].charAt(i)) != -1){
                                System.out.println("Give me an " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!");
                        }else{
                                System.out.println("Give me a " + cheer.charAt(i) + ": " + cheer.charAt(i) + "!");
                        }
            }
            System.out.println("What does that spell?");
            for(int i = 0; i < Integer.parseInt(args[1]); i++){
                System.out.println(args[0] + "!!!"); // rando
            }
        }
}

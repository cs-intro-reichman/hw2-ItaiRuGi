public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minAdd = Integer.parseInt(args[1]);
        hours =  (hours + (minAdd+minutes)/60) % 24;
        minutes = (minAdd + minutes) % 60;
        boolean hoursSin = hours < 10;
        boolean minSin = minutes < 10;
        if(hoursSin){
            System.out.print("0" + hours);
        }else if(!hoursSin){
            System.out.print(hours);
        }
        if(minSin){
            System.out.print(":0" + minutes);
        }else if(!minSin){
            System.out.print(":" + minutes);
        }
}
}
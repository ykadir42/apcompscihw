public class NumberApp{


    

    public static void main(String [] args){
		int N = Integer.parseInt(args[0]);
	
		// tests all the MyNumber types
		System.out.println("Hex\tInt\tOctal\tBinary");
		for (int i = 0; i < N; i++){
		    Binary b  = new Binary(i);
		    Hexadecimal h = new Hexadecimal(i);
		    Octal oct = new Octal(i);
		    System.out.println(h + "\t" + i + "\t" + oct + "\t" + b);      
		}
    }

}

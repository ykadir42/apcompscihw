public class NumberApp{


    

    public static void main(String [] args){
//		int N = Integer.parseInt(args[0]);
//	
//		// tests all the MyNumber types
//		System.out.println("Hex\tInt\tOctal\tBinary");
//		for (int i = 0; i < N; i++){
//		    Binary b  = new Binary(i);
//		    Hexadecimal h = new Hexadecimal(i);
//		    Octal oct = new Octal(i);
//		    System.out.println(h + "\t" + i + "\t" + oct + "\t" + b);      
//		}
    	Binary b1 = new Binary(56);
    	Binary b2 = new Binary(56);
    	Octal o = new Octal(56);
    	Hexadecimal h = new Hexadecimal(56);
    	System.out.println(b1.equals(b2));
    	System.out.println(b2.equals(b1));
    	System.out.println(b1.equals(h));
    	System.out.println(o.equals(h));
    	System.out.println(h.equals(b1));
    }

}

public class NumToEng{

    private String _eng;
    private int _n;

    public NumToEng(int n){
	_n = n;
	_eng = convert(n);
    }

    // precondition: 0 <= n < 10
    public static String digits(int n){
	String[] d = {"zero","one","two","three","four",
		      "five", "six","seven", "eight", "nine"};
	return d[n];
    }

    // precondition: 10 <= n < 20
    public static String teens(int n){
	String[] t = {"tens", "eleven", "twelve", "thirteen","fourteen",
		      "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
	return t[n%10];
    }

    // precondition : 20 <= n < 100
    public static String tensPrefix(int n){
	String [] prefix = {"","","twenty", "thirty", "forty", "fifty",
			    "sixty", "seventy", "eighty", "ninety"};
	return prefix[n / 10];
    }
    
    

    public static String convert(int n){
    	if (n > 1000000000) return convert (n/1000000000) + " billion " + convert(n%1000000000);  
    	if (n > 1000000) return convert (n/1000000) + " million " + convert(n%1000000);
    	if (n > 1000) return convert (n/1000) + " thousand " + convert(n%1000);
    	if (n >= 100) return convert (n/100) + " hundred " + convert(n%10000);
    	if (n < 10) return digits(n);
    	if (n < 20) return teens(n);
    	if (n < 100 && n % 10 == 0) return tensPrefix(n);
    	if (n < 100) return tensPrefix(n/10*10) + "-" + convert(n%10);
    	return "NOT DONE YET";
    }

    public String toString(){
	return _n + " : " + _eng;
    }
    

    public static void main(String [] args){
		int n = Integer.parseInt(args[0]);
		if (n  < 0) n = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++){
		    System.out.println(new NumToEng(i));
	}
    }

}

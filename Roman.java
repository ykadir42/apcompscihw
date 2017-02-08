public class Roman {

        private int _n;
        private String _value;
        private String[] digits = {"I", "II", "III", "IV"};
        private String[] tens = {"X", "XX", "XXX", "XL"};
        private String[] hundreds = {"C", "CC", "CCC", "CD"};
        private String[] thousands = {"M", "MM", "MMM"};

        // precondition: 1 <= n < 4000
        public Roman(int n){
        _n = n;
        _value = toRoman(n);
        }

    // precondition : 1 <= n < 4000
    private String toRoman(int n){
        if (n==0) return "";
        if (n<5) return digits[n-1];
        if (n<9) return "V"+toRoman(n%5);
        if (n==9) return "IX";
	      if (n<50) return tens[n/10-1]+toRoman(n%10);
        if (n<90) return "L"+toRoman(n%50);
        if (n<100) return "XC" + toRoman(n%90);
        if (n<500) return hundreds[n/100-1] + toRoman(n%100);
	      if (n<900) return "D" + toRoman(n%500);
        if (n<1000) return "CM" +toRoman(n%900);
        return thousands[n/1000-1] + toRoman(n%1000);
    }
    

    public String toString(){
	      return _n + " : " + _value;
    }


    public static void main(String [] args){
	      int N = Integer.parseInt(args[0]);
	      for (int i = 1; i < N; i++)
	          System.out.println(new Roman(i));

    }
    
    


}

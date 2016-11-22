public class Octal extends MyNumber{


    private String _octal;

    // Constructor
    // pre : n >= 0
    public Octal(int n){
		super(n);
		if (n < 0) new IllegalArgumentException("must be nonnegative");
		_octal = convert();
    }
  
    // Accessor Methods
    public int getBase(){
    	return 8;
    }

    public String getDigits(){
    	return "01234567";
    }
    
    public String getValue(){
    	return _octal;
    }
    
    public boolean equals(MyNumber rhs){
    	if (!(rhs instanceof Octal)) return false;
    	return intValue() == ((MyNumber)rhs).intValue();
    }

}

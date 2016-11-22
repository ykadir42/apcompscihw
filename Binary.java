public class Binary extends MyNumber{


    private String _binary;

    // Constructor
    // pre : n >= 0
    public Binary(int n){
		super(n);
		if (n < 0) new IllegalArgumentException("must be nonnegative");
		_binary = convert();
    }
  
    // Accessor Methods
    public int getBase(){
    	return 2;
    }

    public String getDigits(){
    	return "01";
    }
    
    public String getValue(){
    	return _binary;
    }
    
    public boolean equals(MyNumber rhs){
    	if (!(rhs instanceof Binary)) return false;
    	return intValue() == ((MyNumber)rhs).intValue();
    }

}

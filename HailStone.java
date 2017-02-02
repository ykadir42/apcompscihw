public class HailStone{


    private int _seed;   // starting value
    private int _numTerms;  // number of terms in the sequence
    private String _sequence ; // sequence
    
    public HailStone(int seed){
    	_seed = seed;
    	_sequence = hail(seed);
    }

    // precondition : n >= 1
    // postcondition: generates the sequence and updates _numTerms
    private String hail(int n){
    	_numTerms++;
		if(n==1) return "1";
		if(n%2==0) return n + " " + hail(n/2);
		return n + " " + hail(n*3+1);
    }

    // Accessor Methods
    public int length(){
    	return _numTerms;
    }

    public int getSeed(){
    	return _seed;
    }
    
    public String toString(){
    	return _sequence;
    }

    public static void main(String [] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
	
		int length = 0;
		int longest = 0;
		for(int i=a; i < b; i++){
			HailStone sequence = new HailStone(i);
			System.out.println(sequence);
			if(sequence.length()>length){
				longest = i;
				length = sequence.length();
			}
		}
		System.out.println(longest+" generates the longest sequence");
		System.out.println("# terms: "+length);
			
			
	}

    

}

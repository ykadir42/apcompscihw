public class Bear extends Animal{


    // constructor
    public Bear (Ecosystem eco, int pos){
	super(eco,pos);
    }

    // override 
    public String toString(){
	return "B";
    }

    public void move()  {
    	Animal[] river = _eco.getRiver();
    	int movement = (int)(Math.random()*3-2);
    	if(!(_pos+movement>river.length||_pos+movement<0)&&river[_pos+movement]==null){
    		river[_pos]=null;
    		_pos=_pos+movement;
    		river[_pos]=this;
    		
    	}
    }


}

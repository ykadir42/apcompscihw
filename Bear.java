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
    	int newPos = _pos+movement;
    	if(!(newPos>river.length||newPos<0)&&river[newPos]==null){
    		river[_pos]=null;
    		_pos=newPos;
    		river[newPos]=this;
    		
    	}
    }


}

public class Ecosystem{
	//attributes
	private Animal[] _river;
	private int populationSize; //number of Animals in the river

	//constructor
	public Ecosystem(int capacity, int numFish, int numBear){
		_river = new Animal[capacity];
		_populationSize = numFish+numBear;
	}

	//accessor method
	public Animal[] getRiver(){
		return _river;
	}
}

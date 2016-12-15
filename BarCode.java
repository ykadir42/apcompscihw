public class BarCode implements Comparable<BarCode>{
    private String _zip;
    private int _checkDigit;

    //constructors
    public BarCode(String zip){
	_zip=zip;
	_checkDigit=0;
	for(int i=0; i<5; i++){
	    _checkDigit+=Integer.parseInt(zip.substring(i,i+1));
	}
    }
    public BarCode(BarCode x){

    }

    private int checkSum(){

    }









}

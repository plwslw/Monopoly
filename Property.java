public class Property extends Space implements Buyable{

    private int _price;
    private boolean _owned;
    private Player _owner;
    private int _housePrice;
    private int _numHouses;
    //private boolean _isHotel;
    private int[] _rents;//_rents[i] is price with i houses
    private int _type;//used for monopoly
    private static boolean _isMonoply;

    public Property(int type, int price, String name, int[] rents){
	super(name);
	_price=price;
	_owned=false;
	_owner=null;
	_housePrice=50*(1+(type-1)/2);
	_rents=rents;
	_type=type;
    }
    
    public int getPrice(){
	return _price;
    }

    public boolean isOwned(){
	return _owned;
    }

    public Player owner(){
	return _owner;
    }

    public int housePrice(){
	return _housePrice;
    }

    public int numHouses(){
	return _numHouses;
    }

    public int rent(){
	int a=numHouses();
	return _rents[a];
    }

    public void bought(Player buyer){
	_owned=true;
	_owner=buyer;
    }
}

    

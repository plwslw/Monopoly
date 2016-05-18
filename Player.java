public class Player{

    private String _name;//idea: avatar, puuppy , flower, arrow
    private int _money;
    private Space _position;
    private boolean[] _monopolies;
    private ArrayList<Buyable> _owned;
    private int _railroadsOwned;
    private int _utilitiesOwned;

    public Player(String name, int money){
	_name=name;
	_money=money;
	_position=null;
    }

    public String name(){
	return _name;
    }

    public int money(){
	return _money;
    }

    public void setPosition(Space s){
	_position=s;
    }

    public Space position(){
	return _position;
    }

    public Buyable[] ownings(){
	return _owned;
    }

    public int railroadsOwned(){
	return _railroadsOwned;
    }

    public int utilitiesOwned(){
	return _utilitiesOwned;
    }

    //money can be <0
    public void addMoney(int money){
	_money+=money;
    }

    public void payMoney(int money, Player other){
	addMoney(-1*money);
	other.addMoney(money);
    }

    public void buy(){
	if (!(position() instanceof Buyable)) throw new IllegalArgumentException();
	Buyable position1=(Buyable)(position());
	buy(position1);
_owned.add
    }

}

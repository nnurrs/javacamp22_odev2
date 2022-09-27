package classesWithAttiributes;

public class Product (int id, String name,String description,double price,int stockamount, String renk){
	public Product() {
		System.out.println("yapıcı blok çalıştı");
		this.id = id;
		this._renk = renk;
		this._name= name;
		this.price  =price;
		this.description=description;
		this.stockamount=stockamount;
		
	}
	
	public 
	//attiribute veya field 
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

    //getter
	public int getId() { //id int olduğu için
		return get_id();
		
	}
	private String get_name() {
		return this._name.substring(0,1)+ _id;
	}
	private void set_name(String _name) {
		this._name = _name;
	}
	//setter
	public void setId(int id) {
		set_id(id); //this bu class demek
	}
	private int get_id() {
		return _id;
	}
	private void set_id(int _id) {
		this._id = _id;
	}



}

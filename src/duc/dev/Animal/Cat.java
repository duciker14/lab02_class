package duc.dev.Animal;

public class Cat extends Animal {
	
public Cat(String mauMat, String mauLong,String tenGoi,double canNang) {
		super("meo",43);
		this.mauMat = mauMat;
		this.mauLong = mauLong;
	}
/**
 * thuoc tinh
 */
	private String mauMat;
	private String mauLong;
	
/**
 * phuong thuc
 */
	void batChuot() {
		System.out.println("bat chuot");
	}
	void leoCay() {
		System.out.println("leo cay");
		
	}
	public String getMauMat() {
		return mauMat;
	}
	public void setMauMat(String mauMat) {
		this.mauMat = mauMat;
	}
	public String getMauLong() {
		return mauLong;
	}
	public void setMauLong(String mauLong) {
		this.mauLong = mauLong;
	}
	
}

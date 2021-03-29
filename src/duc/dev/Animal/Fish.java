package duc.dev.Animal;

public class Fish extends Animal{
	/**
	 * Thuoc tinh
	 */
	
	private String loaiNuoc;
	private String mauVay;
	
	
	public String getLoaiNuoc() {
		return loaiNuoc;
	}


	public void setLoaiNuoc(String loaiNuoc) {
		this.loaiNuoc = loaiNuoc;
	}


	public String getMauVay() {
		return mauVay;
	}


	public void setMauVay(String mauVay) {
		this.mauVay = mauVay;
	}


	public Fish(String loaiNuoc, String mauVay,String tenGoi,double canNang) {
		super("meo", 32);
		this.loaiNuoc = loaiNuoc;
		this.mauVay = mauVay;
	}


	/**
	 * Phuong thuc
	 */
    void lan() {
    	System.out.println("Lan");
    }
}

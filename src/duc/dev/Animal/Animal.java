package duc.dev.Animal;

/**
 * 
 * @author Duc
 *
 */

public class Animal {
	/**
	 * Thuoc tinh
	 */
	private String tenGoi;
	public String getTenGoi() {
		return tenGoi;
	}



	public void setTenGoi(String tenGoi) {
		this.tenGoi = tenGoi;
	}



	public double getCanNang() {
		return canNang;
	}



	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}



	public Animal(String tenGoi, double canNang) {
		super();
		this.tenGoi = tenGoi;
		this.canNang = canNang;
	}



	private double canNang;
	
	
	
	void an() {
		System.out.println("An no");
	}
	

}

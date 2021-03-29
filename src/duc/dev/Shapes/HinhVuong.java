package duc.dev.Shapes;

public class HinhVuong extends Shapes {
public double getCanh() {
		return canh;
	}
	public void setCanh(double canh) {
		this.canh = canh;
	}
public HinhVuong(String mau, double canh) {
		super(mau);
		this.canh = canh;
	}
/**
 * thuoc tinh
 */
	private double canh;
	/**
	 * phuong thuc
	 */
	public double chuVi() {
		return 4*canh;
	}
	public double dienTich() {
		return canh*canh;
	}
	
}

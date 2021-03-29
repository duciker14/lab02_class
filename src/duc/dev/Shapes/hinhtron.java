package duc.dev.Shapes;

public class hinhtron extends Shapes {
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public hinhtron(String mau, double banKinh) {
		super(mau);
		this.banKinh = banKinh;
	}
	/**
	 * thuoc tinh
	 */
      private double banKinh;
      /**
       * phuong thuc
       */
      public double chuVi() {
    	  return banKinh*2*Math.PI;
      }
      public double dienTich() {
    	  return Math.PI*banKinh*banKinh;
      }
}

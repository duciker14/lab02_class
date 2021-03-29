package duc.dev.Animal;
import duc.dev.Animal.*;
public class Main {
	public static void main(String[] args) {
		Fish fish = new Fish("nuoc man","vay day","ca",54);
		System.out.println("Fish:\n");
		System.out.println(fish.getLoaiNuoc());
		System.out.println(fish.getMauVay());
		fish.an();
		fish.lan();
		System.out.println(fish.getTenGoi());
		System.out.println(fish.getCanNang());
		System.out.println("\n");
		
		Cat cat = new Cat("Mau do","mau vang","meo",98);
		System.out.println("Cat:\n");
		System.out.println(cat.getMauLong());
		System.out.println(cat.getMauMat());
		cat.leoCay();
		cat.batChuot();
		System.out.println(cat.getTenGoi());
		System.out.println(cat.getCanNang());
		
		
		
		
		
	}
	

}

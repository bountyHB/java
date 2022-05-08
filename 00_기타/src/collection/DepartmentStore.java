package collection;

public class DepartmentStore {
	private String parkinglot;
	private String foodcourt;
	private String cafe;
	private String cosmetics;
	private String womens;
	private String clothes;
	private String shoes;
	private String mens;
	private String kids;
	private String sports;
	private String theatre;
	private String park;
	private String office;
	
	
	public DepartmentStore() {
	}


	public DepartmentStore(String parkinglot, String foodcourt, String cafe, String cosmetics,
			String womens, String clothes, String shoes, String mens, String kids, String sports, String theatre) {
		this.parkinglot = parkinglot;
		this.foodcourt = foodcourt;
		this.cafe = cafe;
		this.cosmetics = cosmetics;
		this.womens = womens;
		this.clothes = clothes;
		this.shoes = shoes;
		this.mens = mens;
		this.kids = kids;
		this.sports = sports;
		this.theatre = theatre;
	}
	
	
	public DepartmentStore(String parkinglot) {
		this.parkinglot = parkinglot;
	}
	
	public DepartmentStore(String cosmetics, String cafe) {
		this.cosmetics = cosmetics;
		this.cafe = cafe;
	}
	
	public DepartmentStore(String womens, String clothes, String shoes) {
		this.womens = womens;
		this.clothes = clothes;
		this.shoes = shoes;
	}
	
	public DepartmentStore(String mens, String clothes, String shoes, String sports) {
		this.womens = mens;
		this.clothes = clothes;
		this.shoes = shoes;
		this.sports = sports;
	}
	
	public DepartmentStore(String theatre, String foodcourt, String cafe, String park, String office) {
		this.theatre = theatre;
		this.foodcourt = foodcourt;
		this.cafe = cafe;
		this.cafe = park;
		this.cafe = office;
	}


	@Override
	public String toString() {
		return "DepartmentStore [parkinglot=" + parkinglot + ", foodcourt=" + foodcourt + ", cafe=" + cafe
				+ ", cosmetics=" + cosmetics + ", womens=" + womens + ", clothes=" + clothes + ", shoes=" + shoes
				+ ", mens=" + mens + ", kids=" + kids + ", sports=" + sports + ", theatre=" + theatre + ", park=" + park
				+ ", office=" + office + "]";
	}
	
	
	
	
}

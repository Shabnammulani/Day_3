package pkg_oops;

public class Laptop {

	private String Brand;
	private String windows;
	
	public Laptop() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Laptop(String name, String windows) {
		
		this.Brand = name;
		this.windows = windows;
	}
	
	
	public String getName() {
		return Brand;
	}
	public void setName(String name) {
		this.Brand = name;
	}
	public String getWindows() {
		return windows;
	}
	public void setWindows(String windows) {
		this.windows = windows;
	}
	
	
	@Override
	public String toString() {
		return "Laptop [name=" + Brand + ", windows=" + windows + "]";
	}
	
	
}

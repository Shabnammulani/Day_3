package pkg_oops;

public class PhysicalProductOrder extends Order {

	public PhysicalProductOrder(String order_id) {
		super(order_id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process_order() {
		System.out.println("Shipping physical product for order: "+order_id+".");
		
	}

}

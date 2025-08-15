package pkg_oops;

public class ServiceOrder extends Order {

	public ServiceOrder(String order_id) {
		super(order_id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process_order() {
		System.out.println("Scheduling service for order: "+order_id+".");
		
	}

	
}

package pkg_oops;

public class Orders {

	public static void main(String[] args) {
		Order physicalOrder = new PhysicalProductOrder("PH101");
		Order digitalOrder =new DigitalProductOrder("DG102");
		Order serviceOrder =new ServiceOrder("SV103");
		
		physicalOrder.process_order();
		physicalOrder.print_order_summary();
		System.out.println();
		
		digitalOrder.process_order();
		digitalOrder.print_order_summary();
		System.out.println();
		
		serviceOrder.process_order();
		serviceOrder.print_order_summary();
	}
}

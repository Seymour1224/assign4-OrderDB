package data;


public class Order {
	private int numOfOrders = 0;
	
	public void countOrder() {
		this.numOfOrders++;
	}
	
	public String[] order(String order) {
		String[] newOrder = order.split(",");
		countOrder();
		return newOrder;
	}
	
}




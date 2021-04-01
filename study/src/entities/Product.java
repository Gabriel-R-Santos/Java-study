package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public String totalValueInStrock() {
		return String.format("%.2f", price * quantity);
	}
	
	public void addProducts(int quatity) {
		this.quantity += quatity;
	}
	
	public void removeProducts(int quatity) {
		this.quantity -= quatity;
	}
	
	public String toString() {
		return  name
				+", $ "
				+String.format("%.2f", price) 
				+", "
				+quantity
				+" units, Total: $ "
				+totalValueInStrock();
				
	}

}

public class Product {
	private String name;
	private int quantity;
	private double price;
	
	public Product(String wantedName, double initialPrice)
	{
		name = wantedName;
		price = initialPrice;
		quantity = 0;
	}
	
	public Product(String wantedName, double initialPrice, int wantedQuantity)
	{
		name = wantedName;
		price = initialPrice;
		quantity = wantedQuantity;
	}
	
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	public void reducePrice(double amount)
	{
		price = price - price * amount;
	}
	
	public double totalCost()
	{
		return price * quantity;
	}
}

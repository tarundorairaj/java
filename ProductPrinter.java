public class ProductPrinter {
	public static void main(String[] args) {
		Product mansion = new Product("mansion", 0.01, 100);
		Product privateJet = new Product("private jet", 0.01, 1000);
		System.out.println(mansion.getName());
		System.out.println(mansion.getPrice());
		System.out.println(mansion.getQuantity());
		System.out.println(privateJet.getName());
		System.out.println(privateJet.getPrice());
		System.out.println(privateJet.getQuantity());
		mansion.reducePrice(0.25);
		privateJet.reducePrice(0.25);
		System.out.println(mansion.getName());
		System.out.println(mansion.getPrice());
		System.out.println(mansion.getQuantity());
		System.out.println(privateJet.getName());
		System.out.println(privateJet.getPrice());
		System.out.println(privateJet.getQuantity());
		System.out.println(mansion.totalCost());
		System.out.println(privateJet.totalCost());
		
		}
}
public class main {
	public static void main(String[] args) {
		VendingMachine vendingMachine1 = new HotDrinkMachine();
		vendingMachine1.setProduct(new HotDrinkWithTemperature("Латте", 50, 300));
		VendingMachine vendingMachine2 = new HotDrinkMachine();
		vendingMachine2.setProduct(new HotDrinkWithTemperature("Кофе с молоком", 40, 250));
		
		
		vendingMachine1.show();
		vendingMachine2.show();
		System.out.println(vendingMachine1.getProduct("Латте"));
		System.out.println(vendingMachine1.getProduct("Кофе с молоком"));
		
	}
}

public interface VendingMachine {
	
	HotDrinkWithTemperature getProduct(String name, int volume, int temperature);

	HotDrink getProduct(String name, int volume);
	

	void setProduct(String name, int volume, int temperature);

	void setProduct(HotDrinkWithTemperature drink);

	void show();

	HotDrinkWithTemperature getProduct(String name);
    
}

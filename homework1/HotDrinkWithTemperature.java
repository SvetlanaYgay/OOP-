public class HotDrinkWithTemperature extends HotDrink {
	int temperature;

	public HotDrinkWithTemperature(String name, int temperature, int volume) {
		super(name, volume);
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		
		return super.getName() +", "+ super.getVolume() +", " + temperature ;
	}
	public int getTemperature() {
		return temperature;
		
	}
}
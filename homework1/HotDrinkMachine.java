import java.util.HashMap;

import java.util.Map;

public class HotDrinkMachine implements VendingMachine {
	private Map<Integer, HotDrinkWithTemperature> store;
	private int count;

	public HotDrinkMachine() {
		store = new HashMap<Integer, HotDrinkWithTemperature>();
	}

	@Override
	public HotDrinkWithTemperature getProduct(String name, int volume, int temperature) {
		for (HotDrinkWithTemperature hdwt : store.values()) {
			if (hdwt.getName() == name) {
				if (hdwt.getVolume() == volume) {
					if (hdwt.getTemperature() == temperature) {
						return hdwt;
					}
				}
			}
		}
		return null;
	}
	@Override
	public HotDrinkWithTemperature getProduct(String name) {
		for (HotDrinkWithTemperature hdwt : store.values()) {
			if (hdwt.getName() == name) {
				return hdwt;
			}
		}
		return null;
	}

	@Override
	public HotDrinkWithTemperature getProduct(String name, int volume) {
		for (HotDrinkWithTemperature hdwt : store.values()) {
			if (hdwt.getName() == name) {
				if (hdwt.getVolume() == volume) {
					return hdwt;
				}
			}
		}
		return null;
	}

	@Override
	public void setProduct(String name, int volume, int temperature) {
		store.put(count++, new HotDrinkWithTemperature(name, volume, temperature));
	}

	public void setProduct(HotDrinkWithTemperature drink) {
		store.put(count++, drink);
	}

	@Override
	public void show() {
		System.out.println(store);
	}
}

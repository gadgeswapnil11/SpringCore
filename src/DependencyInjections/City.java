package DependencyInjections;

public class City {

	private String dist;

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	private int pin;

	@Override
	public String toString() {
		return "City [dist=" + dist + ", pin=" + pin + "]";
	}

}

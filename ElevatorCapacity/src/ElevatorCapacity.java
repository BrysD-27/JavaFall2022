
public class ElevatorCapacity {
	static double weightLimit = 1400;
	static double avgPersonWeight = 150;

	public static void main(String[] args) {
		System.out.printf("%.2f", weightLimit / avgPersonWeight);
	}
}

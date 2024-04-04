public class SimpleSphere {
	private double radius;
	public static final double DEFAULT_RADIUS = 1;

	public SimpleSphere() {
		radius = DEFAULT_RADIUS;
	}

	public SimpleSphere(double r) {
		radius = r;
	}

	public void printRadius() {
		System.out.println("Radius: " + radius);
	}

	public double getRadius() {
		return radius;
	}

	public int getRadiusInt() {
		return (int) radius;
	}

	public double getVolume() {
		return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
	}

	public static void main(String[] args) {
		// Example usage:
		SimpleSphere sphere1 = new SimpleSphere(); // Creates a sphere with default radius
		SimpleSphere sphere2 = new SimpleSphere(2.5); // Creates a sphere with radius 2.5

		System.out.println("Sphere 1:");
		sphere1.printRadius();
		System.out.println("Volume: " + sphere1.getVolume());

		System.out.println("\nSphere 2:");
		sphere2.printRadius();
		System.out.println("Volume: " + sphere2.getVolume());
	}
}

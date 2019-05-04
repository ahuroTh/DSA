package ex1;

public class GCDRecursive {
	public static void main(final String[] args) {
		// Process arguments.
		if (args.length != 2) {
			System.err.println("Usage: java GCDIter <int1> <int2>");
			System.exit(1);
		}
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);

		int euclid = euclid(n, m);
		System.out.println("The GCD of " + m + " and " + n + " is " + euclid + ".");
	}

	static int euclid(int n, int m) {
		if (n%m==0) {
			return m;
		}
		if (n>m) {
			return euclid(m, n );
		}
		if (n == 0) {
			return m;
		}
		return euclid(m, n % m);
	}
}
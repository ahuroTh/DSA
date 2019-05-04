package ex1;

public class GCDEuclid {
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
		if (n > m) {
			int tmp = m;
			m = n;
			n = tmp;
		}

		int r = 0;
		if (n < m) {
			while (m != 0) {
				r = n % m;
				n = m;
				m = r;
			}
		}
		return n;
	}
}

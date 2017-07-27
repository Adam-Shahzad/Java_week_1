package primes;

public class SeiveOfAtkin {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int limit = 2000000000;
		long counter = 3;
		boolean[] seive = new boolean[limit];
		

		for (int i = 0; i < seive.length; i++) {
			seive[i] = false;
		}

		for (long x = 1; x * x < limit; x++) {
			for (long y = 1; y * y < limit; y++) {

				long n = (4 * x * x) + (y * y);
				if (n <= limit && (n % 60 == 1 || n % 60 == 13 || n % 60 == 17 || n % 60 == 29 || n % 60 == 37
						|| n % 60 == 41 || n % 60 == 49 || n % 60 == 53))

				{
					seive[(int) n] ^= true;
				}

				n = (3 * x * x) + (y * y);
				if (n <= limit && (n % 60 == 7 || n % 60 == 19 || n % 60 == 31 || n % 60 == 43)) {
					seive[(int) n] ^= true;
				}

				n = (3 * x * x) - (y * y);
				if (x > y && n <= limit && (n % 60 == 11 || n % 60 == 23 || n % 60 == 47 || n % 60 == 59)) {
					seive[(int) n] ^= true;
				}

			}
		}

		for (long r = 5; r * r < limit; r++) {
			if (seive[(int) r]) {
				for (long i = r * r; i < limit; i += r * r)
					seive[(int) i] = false;
			}
		}

		for (long a = 0; a < limit; a++)
			if (seive[(int) a] == true) {
				counter++;
			}
		System.out.println(counter);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

}

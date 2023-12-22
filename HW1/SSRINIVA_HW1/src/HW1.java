public class HW1 {
	public static void cubeOfOdd(int n1) {
		for (int i = 1; i < n1; i += 2) {
			System.out.println(i * i * i);
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void introToJava(int n2) {
		if (n2 % 7 == 0 && n2 % 3 == 0) {
			System.out.println("UAB CS 203");
		} else if (n2 % 7 == 0) {
			System.out.println("UAB");
		} else if (n2 % 3 == 0) {
			System.out.println("CS");
		}

		else if (isPrime(n2)) {
			System.out.println("Go Blazers");
		} else {
			System.out.println(n2 * n2 * n2);
		}
	}

	public static double log2(int n) {
		return (Math.log(n) / Math.log(2));
	}

	public static String printJava(int n3) {
		String result = "";

		for (int i = 0; i <= n3; i++) {
			if (log2(i) == (int) log2(i)) {
				result += "JAVA";
			} else {
				result += Integer.toString(i);
			}
		}
		return result;
	}

	public static int numSteps(int n) {
		int c = 0;
		while (n > 0) {
			if (n % 2 != 0)
				n--;
			else
				n /= 2;
			c++;
		}
		return c;
	}
	
	public static boolean grader(float avg_exams, float avg_hw, int attendance) {
		if(attendance < 20) {
			System.out.println("FAIL");
			return false;
		} else if (!(avg_exams > 70 && avg_hw > 70)) {
			System.out.println("FAIL");
			return false;
		} else if(!(avg_exams > 85 || avg_hw > 85)) {
			System.out.println("FAIL");
			return false;
		}
		System.out.println("PASS");
		return true;
	}

	public static void main(String args[]) {
		cubeOfOdd(5);
		cubeOfOdd(3);
		cubeOfOdd(8);
		System.out.println();
		introToJava(3);
		introToJava(70);
		introToJava(4);
		introToJava(17);
		System.out.println();
		System.out.println(printJava(3));
		System.out.println(printJava(7));
		System.out.println(printJava(10));
		System.out.println(printJava(1));
		System.out.println();
		System.out.println(numSteps(14));
		System.out.println();
		grader(72, 88, 22);
		grader(66, 100, 24);
		grader(100, 90, 18);
	}
}

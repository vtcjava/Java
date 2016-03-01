package auditorium.utils;

/**
 * Company: WeDooApps
 * Date: 11/29/15
 * <p/>
 * Created by Adam Madoyan.
 */

public class StringDemo {


	public static void main(String[] args) {

		Integer a = 299;
		Integer b = 299;
		System.out.println(a == b);

		String[] strArr = {"str1", "str2"};

		String s = "text ! kuku!";

		String res = "";
		for (int i = 5; i < s.length(); i++) {
			res = res + s.charAt(i);
		}

		System.out.println(res);

		System.out.println(s.substring(3, 8));


	}

}


class AA {
	public static void main(String[] args) {
		int[][][] a = new int[2][][];

		for (int i = 0; i < a.length; i++) {

			a[i] = new int[3][];
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = new int[3];
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = k;
				}
			}
		}
		print(a);
	}

	static void print(int[][][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + "  ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

abstract class A {
	int a = 8;

	public A() {
		show();
	}

	abstract void show();
}

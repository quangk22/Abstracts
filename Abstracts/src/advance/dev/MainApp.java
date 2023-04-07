package advance.dev;

import java.util.Iterator;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[6];
		intput(s);
		print(s);
		max(s);
		System.out.println("====>Tìm diện tích lớn nhất <====");
		System.out.println("---Hình tròn---");
		maxCrile(s);
		System.out.println("---Hình tam giác---");
		maxTriangle(s);
		System.out.println("---Hình chữ nhật---");
		maxRectangle(s);

	}

	private static void maxRectangle(Shape[] s) {
		// TODO Auto-generated method stub
		double max = 0.0;
		for (Shape shape : s) {
			if (shape instanceof Rectangle) {
				double temp = shape.dienTich();
				if (temp > max) {
					max = temp;

				}
			}

		}
		System.out.println("Diện tích: " + max);
	}

	private static void maxTriangle(Shape[] s) {
		// TODO Auto-generated method stub
		double max = 0.0;
		for (Shape shape : s) {
			if (shape instanceof Triangle) {
				double temp = shape.dienTich();
				if (temp > max) {
					max = temp;

				}
			}

		}
		System.out.println("Diện tích : " + max);
	}

	private static void maxCrile(Shape[] s) {
		// TODO Auto-generated method stub
		double max = 0.0;
		int n = 0;
		for (Shape shape : s) {
			if (shape instanceof Circle) {
				double temp = shape.dienTich();

				if (temp > max) {
					max = temp;

				}
			}

		}

		System.out.println("Diện tích: " + max);

	}

	private static void max(Shape[] s) {
		// TODO Auto-generated method stub
		double maxArea = 0;
		Shape maxAreaShape = null;
		int n = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].dienTich() > maxArea) {
				n = i;
				maxArea = s[i].dienTich();
				maxAreaShape = s[i];
			}
		}

		System.out.println("Hình có diện tích lớn nhất là hình : " + (n + 1));
		System.err.println(maxAreaShape.toString());
	}

	private static void print(Shape[] s) {
		// TODO Auto-generated method stub
		System.out.println("Danh sách các hình đã nhập:");
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				System.out.println("- Hình " + (i + 1) + ":");
				System.err.println(s[i].toString());
				System.out.println("  Chu vi: " + s[i].chuVi());
				System.out.println("  Diện tích: " + s[i].dienTich());
			}
		}
	}

	private static void intput(Shape[] s) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			if (i < 2) {
				System.out.println("Nhập R cho hình tròn");
				System.out.println("Hình tròn " + (i + 1));
				double r = sc.nextDouble();
				s[i] = new Circle(r);
			} else if (i < 4) {
				System.out.println("Nhập a ,b cho hình chữ nhật" + (i + 1));
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				s[i] = new Rectangle(a, b);

			} else {
				System.out.println("nhập cạnh a,b,c cho hình tam giác " + (i + 1));
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double c = sc.nextDouble();
				s[i] = new Triangle(a, b, c);
			}
		}
	}

}

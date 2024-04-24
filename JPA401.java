import java.util.Scanner;

public class JPA401 {
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        int n[] = new int[10];
        int a = 0;
		int s = 0;
        System.out.println("請輸入10個整數:");
		for(int i = 0; i < 10; i++) {;
			System.out.print("第" + (i + 1) + "個整數:");
			n[i] = x.nextInt();

			if(n[i] > 60) {
				a ++;
				s += n[i];
			}
		}
		double c = s/a;
		System.out.println("陣列中大於60的有" + a + "個");
        System.out.println("總合為" + s);
        System.out.println("平均值為" + c);

    }
}
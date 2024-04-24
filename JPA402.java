import java.util.Scanner;


public class JPA402 {
    
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("請輸入學生人數:");
        int a = x.nextInt();
		float s = 0;
        float n[] = new float[a];
		for(int i = 0; i < a; i++) {;
			System.out.print("第" + (i + 1) + "個學生的成績:");
			n[i] = x.nextFloat();

			s += n[i];
		}
		double c = s/a;
		System.out.println("人數:" + a);
        System.out.println("總分:" + s);
        System.out.println("平均:" + c);
    }
}


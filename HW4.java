import java.util.Scanner;
import java.awt.Point;


public class HW4 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("輸入第1組的x和y座標:");
        Point point1 = new Point(scn.nextInt(), scn.nextInt());

        System.out.print("輸入第2組的x和y座標:");
        Point point2 = new Point(scn.nextInt(), scn.nextInt());

        float distance = (float)Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
        
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f", point1.getX(), point1.getY(), point2.getX(), point2.getY(),distance);
        System.out.println();
        scn.close();

    }

}

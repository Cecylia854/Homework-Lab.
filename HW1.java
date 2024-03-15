import java.util.Scanner;

public class HW1 {
    
    public static void main(String[] args) {
        System.out.print("Please input:");
        Scanner scn= new Scanner(System.in);
        double k = scn.nextDouble();
        System.out.println(k + " kg = " + (k * 2.20462) + " pounds");
        scn.close();
    } 
}

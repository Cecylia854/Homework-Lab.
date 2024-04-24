public class JPA405 {
    
    public static void main(String[] argv) {
        String x[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        System.out.print("反轉陣列資料之前: ");
        for(int a = 0; a < 10; a++)
        	System.out.print(x[a] + " ");

        System.out.print("\n反轉陣列資料之後: ");
        for(int a = x.length - 1; a >= 0; a--) {
            System.out.print(x[a] + " ");
        } 
    } 
}

public class JPA404 {
    
    public static void main(String[] args) {
        int a[] = new int [10];
        a[0] = 0;
        a[1] = 1;

        for(int x = 2; x < 10; x++)
            a[x] = a[x - 1] + a[x - 2];

        for(int x = 0; x < 10; x++)
            System.out.println(a[x]);
    }
}

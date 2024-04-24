public class JPA403 {
    
    final static int x = 2;
    final static int y = 3;
    public static void main(String args[]) {
        int A[][] = {{1,2,3}, {4,5,6}};
        int B[][] = {{7,8,9}, {10,11,12}};
        int C[][] = new int[x][y];
        System.out.println("陣列A的內容為(3x3):");
        show(A);
        System.out.println("陣列B的內容為(3x3):");
        show(B);
        add(A, B, C);
        System.out.println("陣列A+B=C，陣列C的內容為(3x3):");
        show(C);
    }

    public static void add(int[][] A,int[][] B,int[][] C){

        for(int b = 0; b < 2; b++) {
            for(int a = 0; a < 3; a++)
                C[b][a]=A[b][a]+B[b][a];
        }
    }

    public static void show(int[][] s) {
        for(int b = 0; b < 2; b++){
            for(int a = 0; a < 3; a++)
                System.out.print(" " + s[b][a]);
            System.out.println("");
        }
    }
}

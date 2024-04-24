public class JPA406 {
    
    public static void main(String[] argv) {
        for(int i = 4 ;i >= 0; i--){
            int x[] = {8, 5, 3, 2};
            int y[] = {0, 2, 4, 6};
            int z[] = {30, 50, 80, 100}; 
            int s = 0;

            System.out.println("停車時數:" + x[i - 1] + "小時");

            for(int a = 3 ;a >= 0; a--){
                if(x[i - 1] > y[a]){
                    s = s + (x[i - 1] - y[a]) * z[a];
                    x[i - 1] = y[a];
                }
            }

            System.out.println("應繳費用:" + s + "元整");
            System.out.println("--------------------");
        }
    }
}

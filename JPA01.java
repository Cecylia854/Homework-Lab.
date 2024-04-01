import java.util.*;

public class JPA01 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // program untuk menjumlahkan angka dengan rentang
        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.println("masukkan nilaiAwal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.println("masukkan nilaiAkhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah "+ nilaiAwal +"menjadi" + total);
            nilaiAwal++;

        }
         // tugas-> for loop, do while...
    }

}

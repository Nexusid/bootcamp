import java.util.Scanner;
public class triangle{
    public static void main(String args[]) {
        System.out.println(segi3("*", 10)); //input simbol dan tinggi segitiga
    }
    public static String segi3(String simbol, int sisi) { //pemanggilan command dari input diatas
        StringBuilder str = new StringBuilder();

        // bagian atas segitiga
        for (int i = sisi; i > 0; i--){
            str.append(simbol + " ");
        }
        str.append("\n");

        // bagian samping
        for (int i = sisi-2; i > 0; i--){
            //Samping kiri 
            for (int j = 1; j < sisi-i; j++) {
                str.append(" ");
            }
            str.append(simbol);

            // samping kanan
            for (int k = 1; k <= (i * 2)- 1 ; k++) {
                str.append(" ");
            }
            str.append(simbol).append("\n");
        }

        // bagian bawah
        for (int i = sisi-1; i > 0; i--) {
            str.append(" ");
        }
        return str.append(simbol).append("\n").toString();
    }
}
import java.sql.Array;
import java.util.*;

public class test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int index = 0; index < T; index++) {
            int n = scanner.nextInt();
            int a[] = new int[n];
            int m = scanner.nextInt();
            int b[] = new int[m];
            int c[] = new int[m+ n];
            for(int i = 0; i< n; i++) {
                a[i] = scanner.nextInt();
                c[i] = a[i];
            }
            for(int i = 0; i< m; i++) {
                b[i] = scanner.nextInt();
                c[i + n] = b[i];
            }
            Arrays.sort(c);
            int d[]= new int[m+n];
            for(int i = 0; i< m+ n -1; i++) {
                for(int j = i+ 1; j< m+ n; j++) {
                    if(c[i] == c[j]){
                        c[j] = -1;
                    }
                }
            }
            for(int i = 0; i< m+ n; i++){
                if(c[i] != -1) {
                    System.out.print(c[i]+" ");
                }
            }
            System.out.println();

        }

    }
}
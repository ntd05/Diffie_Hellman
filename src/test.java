import java.util.*;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            c[i]= a[i] + b[i];
        }
        int p = 0, q= 0;
        for(int i = p; i < n; i++) {
            for(int j = q; j< n; j++) {
                if(a[j] <= c[i]) {
                    count++;
                    p = i+ 1;
                    q = j + 2;
                } else {
                    continue;
                }
            }
        }

        System.out.println(count);

    }
}
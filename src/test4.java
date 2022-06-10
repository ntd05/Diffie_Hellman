import java.util.*;

public class test4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
        int xangcan = n;
        int xangthieu = m;
        int xangcon = 0;
        int xangco = 0;
        int i = 1;
        int k;
        while(i <= xangcan) {
            xangthieu = m - xangco;
            count += xangthieu * i;
            xangco = m;
            i++;
            xangcan -= xangco;
            xangco--;
        }
        System.out.println(count);
    }
}
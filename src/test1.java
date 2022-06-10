import java.util.*;

public class test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String arr[] = new String[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        for(int i = 0; i< n - 1; i++) {
            int count = 0;
            for(int j= i+ 1; j< n; j++) {
                if(arr[i].equals(arr[j])){
                    count++;
                    arr[j] += "(" + Integer.toString(count) + ")";
                }
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
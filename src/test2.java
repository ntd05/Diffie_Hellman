import java.util.*;

public class test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String x = "";
        for (int i = 0; i< s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                x+= "0";
            } else{
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    x+= "1";
                } else {
                    if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                        x+= "2";
                    } else{
                        if (s.charAt(i) == '$' || s.charAt(i) <= '#' || s.charAt(i) <= '@') {
                            x += "3";
                        }
                    }
                }

            }
        }

        if (x.indexOf("0") != -1 && x.indexOf("1") != -1 && x.indexOf("2") != -1 && x.indexOf("3") != -1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
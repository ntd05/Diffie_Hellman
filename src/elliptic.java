import java.util.ArrayList;

public class elliptic {
    public static void main(String[] args) {
        ArrayList crr = new ArrayList();
        int p = 7;
        for(int x = 0; x < 7; x++) {
            int z = (x*x*x + 2) % 7;
            for(int y = 0; y < 7; y++){
                if(( y * y - z) % p == 0){
                    crr.add(x);
                    crr.add(y);
                }
            }
        }
        for(int i = 0; i< crr.size(); i +=2) {
            System.out.println(crr.get(i) + " "+ crr.get(i+1));
        }
    }

}

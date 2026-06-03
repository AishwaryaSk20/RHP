import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int L = s.length();

        for (int mask = 1; mask < (1 << L); mask++) {
            StringBuilder combi = new StringBuilder();

            for (int sh = 0; sh < L; sh++) {
                if ((mask & (1 << sh)) != 0) {  // bit is set
                    combi.append(s.charAt(sh));
                }
            }

            System.out.println(combi);
        }

        sc.close();
    }
}
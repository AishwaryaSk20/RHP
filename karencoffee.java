import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] diff = new int[200002];

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            diff[l]++;
            diff[r + 1]--;
        }

        int[] pref = new int[200002];
        int cover = 0;

        for (int i = 1; i <= 200000; i++) {
            cover += diff[i];
            pref[i] = pref[i - 1] + (cover >= k ? 1 : 0);
        }

        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(pref[b] - pref[a - 1]);
        }

        sc.close();
    }
}

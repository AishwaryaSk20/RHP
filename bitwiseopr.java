import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int flag1 = 0;
        int flag2 = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                flag1 |= (1 << (ch - 'A'));
            } else if (ch >= 'a' && ch <= 'z') {
                flag2 |= (1 << (ch - 'a'));
            }
        }

        if (flag1 == (1 << 26) - 1 && flag2 == (1 << 26) - 1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}
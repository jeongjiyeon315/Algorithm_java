import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int check[] = new int[N];
        Arrays.fill(check, 0);

        int menuList[] = new int[2*N];

        for(int i = 0; i < 2*N; i++) {
            menuList[i] = scanner.nextInt();
        }

        int sticker = 0;
        int cnt = 0;

        for(int i = 0; i < menuList.length; i++) {
            if (check[menuList[i] - 1] == 0) {
                check[menuList[i]-1] = 1;
                cnt+=1;
            } else {
                check[menuList[i] - 1] = 0;
                cnt-=1;
            }
            sticker = Math.max(sticker, cnt);
        }
        System.out.println(sticker);
    }
}

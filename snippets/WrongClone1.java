import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = Integer.MAX_VALUE;
    for (int i = 1; i <= n; i++) {
      int j = n / i;
      ans = Math.min(ans, Math.abs(i - j) + n - i * j);

    }
    System.out.println(ans);
  }
}

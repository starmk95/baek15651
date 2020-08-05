import java.io.*;
import java.util.*;

public class Main {
    static int[] ans;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ans = new int[M];
        printSequence(0, N, M);
        bw.flush();
        bw.close();
    }

    // 브루트 포스
    static void printSequence(int index, int n, int m) throws IOException {
        if (m == index) { // 재귀함수의 기저조건 : 마지막 자리 인덱스의 수까지 구하면 수열 1개 완성
            for (int x : ans) {
                bw.write(x + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            ans[index] = i; // 해당 차례의 인덱스에 수를 널기
            printSequence(index + 1, n, m); // 다음 인덱스 자리에 올 숫자들을 확인
        }
    }
}

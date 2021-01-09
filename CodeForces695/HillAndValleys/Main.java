package CodeForces695.HillAndValleys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int T=fs.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tt=0; tt<T; tt++) {
            int n=fs.nextInt();
            int[] a=fs.readArray(n);
            int sum = 0;
            for (int i = 1; i < n - 1; i++) {
                sum += (cost(i, a));
            }
            int ans = sum;
            for (int i = 1; i < n - 1; i++) {
                int old = a[i];
                int base = cost(i, a) + cost(i - 1, a) + cost(i + 1, a);
                a[i] = a[i - 1];
                ans = Math.min(ans, sum - base + cost(i, a) + cost(i - 1, a) + cost(i + 1, a));
                a[i] = a[i + 1];
                ans = Math.min(ans, sum - base + cost(i, a) + cost(i - 1, a) + cost(i + 1, a));
                a[i] = old;
            }
            sb.append(ans + "\n");
        }
        System.out.print(sb);
    }
    static int cost(int i, int a[]) {
        if (i == 0 || i == a.length - 1)
            return 0;
        if ((a[i - 1] < a[i] && a[i] > a[i + 1]) || (a[i] < a[i - 1] && a[i] < a[i + 1]))
            return 1;
        return 0;
    }
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

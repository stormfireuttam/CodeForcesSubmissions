package CodeForces688Div2.SuffixOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static final int MAX = (int) (2e5 + 5);
    static int arr[] = new int[MAX];
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int t = reader.nextInt();
        while(t -- > 0) {
            int n = reader.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = reader.nextInt();
            }
            long ans = 0;
            for (int i = 1; i < n; i++) {
                ans += Math.abs(arr[i - 1] - arr[i]);
            }
            long pre = (ans - Math.abs(arr[0] - arr[1]));
            for (int i = 1; i < n; i++) {
                long temp = ans;
                temp -= Math.abs(arr[i] - arr[i - 1]);
                if (i < n - 1) {
                    temp -= Math.abs(arr[i + 1] - arr[i]);
                    temp += Math.abs(arr[i+1] - arr[i - 1]);
                }
                pre = Math.min(pre, temp);
            }
            System.out.println(pre);
        }
    }
}

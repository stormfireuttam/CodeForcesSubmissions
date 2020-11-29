package CodeForcesRound687Div2.RepaintingStreet;

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

    public static void main(String[] args) throws java.lang.Exception{
        FastReader reader = new FastReader();
        int t = reader.nextInt();
        while (t -- > 0) {
            int n = reader.nextInt(), k = reader.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = reader.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= 100 ; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] != i) {
                        int currentCount = 0;
                        while (j < n && (arr[j] != i) || currentCount%k!=0) {
                            j++; currentCount++;
                        }
                        if (j < n) j--;
                        count += Math.ceil(currentCount * 1.0 / k);
                    }
                }
                min = Math.min(count, min);
            }
            System.out.println(min);
        }
    }
}

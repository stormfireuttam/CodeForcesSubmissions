package CodeForcesRound687Div2.PrisonBreak;

import java.io.*;
import java.util.*;

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

    public static void main(String[] args) throws java.lang.Exception {
        FastReader reader = new FastReader();
        int t = reader.nextInt();
        while (t-- > 0) {
            long n = reader.nextLong();
            long m = reader.nextLong();
            long r = reader.nextLong();
            long c = reader.nextLong();
            long ans1 = Math.max(Math.abs(r - 1) + Math.abs(c - 1), Math.abs(n - r) + Math.abs(m - c));
            long ans2 = Math.max(Math.abs(r - 1) + Math.abs(c - m), Math.abs(n - r) + Math.abs(c - 1));
            System.out.println(Math.max(ans1, ans2));
        }
    }
}


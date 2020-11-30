package EducationalCodeForcesRound99.Jumps;

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
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int x = reader.nextInt();
            int y = 0, count = 0, i;
            for (i = 1; i <= x; i++) {
                y += i;
                count++;
                if (y == x || y > x)
                    break;
            }
            if (y - 1 == x){
                count ++;
            }
            else {
//                int factor = 2;
//                while(y > x) {
//                    y -= factor; count --;
//
//                    factor ++;
//                }
            }
            sb.append(count + "\n");
        }
        System.out.print(sb);
    }
}

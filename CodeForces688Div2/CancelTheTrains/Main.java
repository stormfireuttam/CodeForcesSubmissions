package CodeForces688Div2.CancelTheTrains;

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
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int t = reader.nextInt();
        while(t -- > 0) {
            int n = reader.nextInt();
            int m = reader.nextInt();
            int bottomTrains[] = new int[n];
            for(int i = 0; i < n; i ++) {
                bottomTrains[i] = reader.nextInt();
            }
            int leftTrains[] = new int[m];
            for(int i = 0; i < m; i ++) {
                leftTrains[i] = reader.nextInt();
            }
            int ptr1 = 0, ptr2 = 0, count = 0;
            while(ptr1 < n && ptr2 < m) {
                if (bottomTrains[ptr1] > leftTrains[ptr2]) {
                    ptr2 ++;
                }
                else if(bottomTrains[ptr1] < leftTrains[ptr2]) {
                    ptr1 ++;
                }
                else {
                    ptr1 ++;
                    ptr2 ++;
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
}

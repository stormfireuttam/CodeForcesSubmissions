package CodeForces694.StrangePartition;

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
            long x= fs.nextInt();
            int[] a=fs.readIntArray(n);
            long minSum = 0;
            long maxSum = 0;
            for(int i : a) {
                minSum += i;
                maxSum += (i / x);
                if (i % x != 0) {
                    maxSum ++;
                }
            }
            if (minSum % x != 0) {
             minSum /= x;
             minSum ++;
            }
            else
                minSum /= x;
            sb.append(minSum + " " + maxSum + "\n");
        }
        System.out.print(sb);
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

        int[] readIntArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }

        long[] readLongArray(int n) {
            long[] a=new long[n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

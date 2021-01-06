package CodeForces694.StrangeBirthdayParty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int T=fs.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tt=0; tt<T; tt++) {
            int n=fs.nextInt();
            int m= fs.nextInt();
            int[] friends=fs.readIntArray(n);
            int[] gifts= fs.readIntArray(m);
            int[] cost=new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = gifts[friends[i] - 1];
            }
            Arrays.sort(cost);
            int c = 0;
            long sumCost = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (c < n && gifts[c] < cost[i]) {
                    cost[i] = gifts[c];
                    c ++;
                }
                sumCost += cost[i];
            }
            sb.append(sumCost + "\n");
        }
        System.out.print(sb);
    }
    static void ruffle_sort(int[] a) {
        //random_ruffle
        Random r=new Random();
        int n=a.length;
        for (int i=0; i<n; i++) {
            int oi=r.nextInt(i);
            int temp=a[i];
            a[i]=a[oi];
            a[oi]=temp;
        }

        //sort
        Arrays.sort(a);
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

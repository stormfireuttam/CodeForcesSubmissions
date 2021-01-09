package CodeForces695.WizardOfOrz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int T=fs.nextInt();
        char ch[] = {'9', '8', '7', '6', '5', '4', '3', '2', '1', '0'};
        StringBuilder sb = new StringBuilder();
        for (int tt=0; tt<T; tt++) {
            int n=fs.nextInt();
            char output[] = new char[n];
            if (n == 1)
                output[0] = '9';
            else {
                int l = 1, r = 1;
                int index = 1;
                output[l] = ch[index --];
                l --;
                r ++;
                while (l >= 0 && r < n) {
                    if (index == -1)
                        index = 9;
                    output[l] = output[r] = ch[index --];
                    l --;
                    r ++;
                }
                while (l >= 0) {
                    if (index == -1)
                        index = 9;
                    output[l --] = ch[index --];
                }
                while (r < n) {
                    if (index == -1)
                        index = 9;
                    output[r] = ch[index --];
                    r ++;
                }
            }
            sb.append(String.valueOf(output) + "\n");
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
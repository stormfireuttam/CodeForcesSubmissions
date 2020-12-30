import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs=new FastScanner();
        int T=fs.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int tt=0; tt<T; tt++) {
            int n = fs.nextInt();
            int x[] = fs.readArray(n);
            if (n == 1){
                sb.append("1\n");
                continue;
            }
            HashSet<Integer> set = new HashSet<>();
            for (int i: x) {
                set.add(set.contains(i)? i + 1 : i);
            }
            sb.append(set.size() + "\n");
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


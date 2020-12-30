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
            char arr[] = fs.next().toCharArray();
            int count = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    count ++;
                    arr[i] = '%';
                }
                else {
                    if (i > 1 && arr[i] == arr[i - 2]) {
                        count ++;
                        arr[i] = '&';
                    }
                }
            }
            sb.append(count + "\n");
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

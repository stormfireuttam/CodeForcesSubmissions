package EducationalCodeForcesRound99.SequenceAndSwaps;

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

    public static void main(String[] args)throws java.lang.Exception {
        FastReader reader = new FastReader();
        int t = reader.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = reader.nextInt();
            int x = reader.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = reader.nextInt();
            }
            int count = 0;
            while (!isSorted(arr)) {
                int index = getFirst(arr, x);
                if (index < 0) {
                    count = -1;
                    break;
                }
                x = swap(arr, index, x);
                count ++;
            }
            sb.append(count+"\n");
        }
        System.out.print(sb);
    }

    private static int swap(int[] arr, int index, int x) {
        int t = arr[index];
        arr[index] = x;
        return t;
    }

    private static int getFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x)
                return i;
        }
        return -1;
    }

    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}

package CodeForcesRound686Div3.Program2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            if(n == 1){
                int i = sc.nextInt();
                System.out.println(i);
                continue;
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
                else
                {
                    map.put(arr[i], 1);
                }
            }
            boolean found = false;
            int min = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()){
                if (entry.getValue() == 1 && entry.getKey() < min ) {
                    found = true;
                    min = entry.getKey();
                }
            }
            if (!found) {
                System.out.println(-1);
            }
            else
            {
                for (int i = 0; i < n; i++) {
                    if (arr[i] == min) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }
    }
}

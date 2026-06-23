import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int t = 1;
        t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }

    static void solve() {
        int n = fs.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = fs.nextInt();
        Arrays.sort(arr);
        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        if(n == 2){
            System.out.println(arr[0] + " " + arr[1]);
            return;
        }

        boolean ok = true;
        for(int i = 0; i < n - 2; i++){
            if(arr[i] != arr[i + 1] + arr[i + 2]){
                ok = false;
                break;
            }
        }
        if(ok){
            System.out.println(arr[0] + " " + arr[1]);
        }
        else System.out.println(-1);

    }

    static void yes() {
        out.println("YES");
    }

    static void no() {
        out.println("NO");
    }

    static int[] readIntArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = fs.nextInt();
        return arr;
    }

    static long[] readLongArray(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = fs.nextLong();
        return arr;
    }

    static class Pair {
        int first, second;

        Pair(int f, int s) {
            first = f;
            second = s;
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int read() {
            if (ptr >= len) {
                ptr = 0;
                try {
                    len = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() {
            int c;
            while ((c = read()) <= ' ');
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = c - '0';
            while ((c = read()) > ' ')
                val = val * 10 + c - '0';
            return val * sign;
        }

        long nextLong() {
            int c;
            while ((c = read()) <= ' ');
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            long val = c - '0';
            while ((c = read()) > ' ')
                val = val * 10 + c - '0';
            return val * sign;
        }

        String next() {
            StringBuilder sb = new StringBuilder();
            int c;
            while ((c = read()) <= ' ');
            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }
    }
}
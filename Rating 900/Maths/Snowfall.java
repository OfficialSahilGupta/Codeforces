import java.io.*;
import java.util.*;

public class Snowfall {

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
        List<Integer> D = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> A = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++){
            int x = fs.nextInt();

            if(x % 6 == 0){
                D.add(x);
            }
            else if(x % 2 == 0){
                B.add(x);
            }
            else if(x % 3 == 0){
                C.add(x);
            }
            else A.add(x);
        }
        boolean first = true;

        for(int x : D){
            if(!first) ans.append(' ');
            ans.append(x);
            first = false;
        }
        for(int x : B){
            if(!first) ans.append(' ');
            ans.append(x);
            first = false;
        }
        for(int x : A){
            if(!first) ans.append(' ');
            ans.append(x);
            first = false;
        }
        for(int x : C){
            if(!first) ans.append(' ');
            ans.append(x);
            first = false;
        }

        ans.append('\n');
        System.out.print(ans);

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
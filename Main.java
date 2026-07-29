import java.io.*;
import java.util.*;

public class Main {

    // =====================================================
    // FAST INPUT
    // =====================================================

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }

        int[] intArray(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        long[] longArray(int n) throws IOException {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        String[] stringArray(int n) throws IOException {
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = next();
            }
            return arr;
        }
    }

    static FastScanner fs = new FastScanner();
    // =====================================================
// FAST OUTPUT
// =====================================================

static class FastWriter {

    private final PrintWriter out;

    FastWriter() {
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    }

    void print(Object obj) {
        out.print(obj);
    }

    void println(Object obj) {
        out.println(obj);
    }

    void println() {
        out.println();
    }

    void printf(String format, Object... args) {
        out.printf(format, args);
    }

    void flush() {
        out.flush();
    }

    void close() {
        out.close();
    }
}
    static FastWriter out = new FastWriter();

    public static void main(String[] args) throws Exception {
         out.flush();
    }
}

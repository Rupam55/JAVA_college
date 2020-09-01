import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;


public class Q1 {

  public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

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

    String[] nextSArray() {
      String sr[] = null;
      try {
        sr = br.readLine().trim().split(" ");
      } catch (IOException e) {
        e.printStackTrace();
      }
      return sr;
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



  public static void main(String[] args) throws Exception {
    FastReader sc = new FastReader();
    //write your logic here;
    //out.println(); ............to print anything.
    //use out.close() after using one or more print statement
    //int rupam = sc.nextInt();..................to take integer input
    //double rupam=sc.nextDouble();       double input
    //String rupam2 =sc.nextLine();      string input
    
    String arr [] = sc.nextSArray();
    int vovel = 0;
    int upper = 0;
    
    out.print("complete name is- ");
    for(int i = 0; i < arr.length; i++) {
    	out.print(arr[i]+" ");
    	if(arr[i].contains("a") || arr[i].contains("e") || arr[i].contains("i")|| arr[i].contains("o")|| arr[i].contains("u")) {
    		vovel++;
    	}
    }
    out.println("\n"+"number of words is-"+arr.length);
    
    out.println("number of vovel are-"+vovel);
    
    
    
    out.close();
  }
}
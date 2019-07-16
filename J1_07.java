import java.io.*;
import java.util.*;

public class J1_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] k = new int[3];
        k[0] = sc.nextInt();
        k[1] = sc.nextInt();
        k[2] = sc.nextInt();
        
        Arrays.sort(k);
        System.out.println(k[1]);
    }
}

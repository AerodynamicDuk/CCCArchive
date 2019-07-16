import java.io.*;
import java.util.*;

public class J2_17 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);		
	int N= sc.nextInt();
	int k= sc.nextInt();	
	int Q=N;	
	while(k>0) {	
		Q=(Q*10);
		Q=Q+N;
		k=k-1;		
	}
	System.out.println(Q);
}
}

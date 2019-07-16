import java.io.*;
import java.util.*;

public class J1_08 {
    public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
	double i = sc.nextDouble();
	double j = sc.nextDouble();
	
	double k = i/(j*j);
	if (k > 25.0) {
	System.out.println("Overweight");
	} else if (k < 18.5) {
	System.out.println("Underweight");}
	else {
	System.out.println("Normal weight");
	}
}
}

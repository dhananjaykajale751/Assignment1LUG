import java.util.*;

public class Country {

	public static void main(String[] args) {

	String[]C= {"India","UK","China","USA","SriLanka"};
	String[]K= {"New Delhi","London","Bejing","Washington.D.C","Colombo"};
	int[]a= {18000,2000,18000,1500,1200};
	for(int j=0;j<5;j++) {
		if(a[j]>2000) {
			System.out.println(C[j] +","+ K[j] +"," + a[j]);
		}
	}
		

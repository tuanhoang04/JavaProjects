package PR2.TUT4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class EX5 {
	
	public static int binarytodecimal(int[] bin) {
		int[] a =new int[bin.length];
		int j = 0;
		for(int i = bin.length-1; i>=0;i--) {
			a[j]=bin[i];
			j++;
		}
		int k =0;
		for(int i =0; i<a.length; i++) {
			if (a[i] == 0) {
				continue;
			}
			k+= (int) Math.pow(2,i);
		}
		return k;
	}
	
	public static ArrayList<Integer> decimaltobinary(int dec){
		ArrayList<Integer> a = new ArrayList<>();
		if(dec==0){
			a.add(dec);
		}
		while (dec>=1) {
		a.add(dec%2);
		dec/=2;
		}
		Collections.reverse(a);
		return a;
	}
	
	public static int xor(int a, int c) {
		ArrayList<Integer> abi = decimaltobinary(a); 
		ArrayList<Integer> cbi = decimaltobinary(c);
		
		if (abi.size()>cbi.size()) {
			int temp = abi.size()-cbi.size();
			for(int i = 0; i<temp; i++) {
				cbi.add(0, 0);
			}
		}else if(abi.size()<cbi.size()) {
			int temp = cbi.size()-abi.size();
			for(int i =0; i<temp; i++){
				abi.add(0,0);
			}
		}
		int[] result = new int[abi.size()];
		for (int i = 0; i<abi.size();i++) {
			if(Objects.equals(abi.get(i), cbi.get(i))) {
				result[i] = 0;
			}else {
				result[i]=1;
			}
		}
		return binarytodecimal(result);
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer A from 0 to 255: ");
		int a = sc.nextInt();
		System.out.print("Please enter an integer B from 0 to 255 so that A xor C = B: ");
		int b = sc.nextInt();
		System.out.print("C is: " +xor(a,b));
	}
	
	
	
}

package DSA.TUT4;

import java.util.Scanner;

public class EXER2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please type in the number of students: ");
		int nos = sc.nextInt();
		int[] name = new int[nos];
		int[] score = new int[nos];
		for(int i =0; i<nos;i++) {
			System.out.print("The name of student "+ i+1 +" is: ");
			name[i] = sc.nextInt();
			System.out.print("The score of student "+ i+1 +" is: ");
			score[i] = sc.nextInt();
		}
		
		System.out.println("Please type in the number of student who has the highest mark: ");
		int m = sc.nextInt();
		
		
		
		
	
	}
	
	public static void mergeSort(int[] arr, int beg, int end) {
		if(beg<end) {
			int mid = (beg+end)/2;
			mergeSort(arr, beg, mid);
			mergeSort(arr, mid+1, end);
			merge(arr,beg,mid,end);
		}
	}
	
	public static void merge(int[]arr, int beg, int mid, int end) {
		int fhlength = mid-beg+1;
		int shlength = end-mid;
		int [] fh = new int[fhlength];
		int[] sh = new int[shlength];
		
		int i,j,k;
		
		for(i = 0;i<fh.length;i++) {
			fh[i] = arr[beg+i];
		}
		
		for(j = 0; j <sh.length;j++) {
			sh[j]=arr[mid+j+1];
		}
		
		i=0;j=0;k=beg;
		
		
		while(i<fhlength && j<shlength) {
			if(fh[i]<=sh[j]) {
				arr[k++] = fh[i++];
			}else {
				arr[k++] = sh[j++];
			}
		}
		
		while(i<fhlength) {
			arr[k++] = fh[i++];
		}
		
		while(j<shlength) {
			arr[k++]= sh[j++];
		}
	}
	
	
}
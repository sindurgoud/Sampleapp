package org.cap.demo;

public class bootclass {

	public static void main(String[] args) {
		System.out.println("Hello from STS");
		show();
    }
    
	public static void show() {
<<<<<<< HEAD
		int[] arr= {1,22,3,4};
		int sum=0;
		for(int n:arr) {
			sum+=n;
			System.out.println(n);
=======
		int[] arr= {12,34,56,54};
		for(int i=0;i<100;i++)
		{
			System.out.println(arr[i]);
>>>>>>> branch 'master' of https://github.com/sindurgoud/Sampleapp.git
		}
		System.out.println("Show method here!");
	}
	
}

package org.src.tester.login;

public class Company {
public static void main(String[] args) {
	int a[]=new int[10];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
    a[4]=5;
    a[5]=6;
    a[6]=7;
    a[7]=8;
    a[8]=9;
    a[9]=10;  
    int len=a.length;
    System.err.println(len);
for(int i=0; i<10; i++) {
	System.err.println(a[i]);
	int sum=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
	System.err.println("enter the sum of values:" +sum);
	//int sum=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
	//System.err.println("enter the sum of values:" +sum);
}


}
}

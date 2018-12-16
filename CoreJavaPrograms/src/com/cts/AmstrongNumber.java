package com.cts;

public class AmstrongNumber {

	public static void main(String[] args) {
int n=345;
int rev=0,remainder=0;
while(n>0)
{
	remainder=n%10;
rev=rev*10+remainder;
n=n/10;
}
System.out.println(rev); 

	}

}

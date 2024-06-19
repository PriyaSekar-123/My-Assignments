package week1.day3;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num= {2,5,7,7,5,9,2,3};

Arrays.sort(num);
System.out.println("Sorted values are :");
for(int i=0;i<num.length;i++)
{
	System.out.println(num[i]);
}
System.out.println("Duplicate values are :");
for(int i=1;i<num.length-1;i++)
{
	//System.out.println(+num[i]);
	if(num[i]==num[i-1])
	{
		System.out.println(num[i]);
	}
}

	}

}

/*
 * int[] num={};
 Arrays.sort(num);
 for(int i=0;i<num.length-1;i++)
{
	if(num[i]==num[i+1])
	{
		System.out.println(num[i]);
	}
}
  */


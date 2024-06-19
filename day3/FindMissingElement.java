package week1.day3;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] input= {1,4,3,2,8,6,7};
//int[] output;
Arrays.sort(input);
System.out.println("Sorted Array values are :");
for(int i=0;i<=input.length-1;i++)
{
	System.out.println(input[i]);
}
int[] output=input;
System.out.println("Missing value is :");

for(int j=1;j<=input.length-1;j++)
{
	if(output!=input)
	{
		System.out.println(+output[j]);
	}
}
	}
}










	/*int[] output=input;
	
	for(int j=0;j<=output.length-1;j++)
	{
		System.out.println(output[i]);
	
	if(output!=input)
	{
		System.out.println("Missed value is " +output[j]);
	}
*/

/*
 //System.out.println("Missing Value is :");	
int[] output1 = output[i];

for(int j=0;j<=output.length-1;j++)
{ */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class BinarySearch 
{	

	public static void main(String[] args) 
	{
		int newInput = 0; 
		int askNum = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter as many positive integers as you would like seperated by a single space, once you are done entering integers enter -1 at the end.");
		System.out.println("Ex.) 7 17 12 2 -1");
		newInput = userInput.nextInt();
		System.out.println("The length of the array is " + newInput); //for testing only
		//Collections.sort(newinput);
		//generateTarget(null);

	}
	
	
	public int loadArray (String newInput)
	{
		int NumList;
		
		int numInt = 0;  //number of integers loaded into Array
		int i = 0;
		int fetchNum = 0;
		
		do{
			//fetchNum = newInput.nextInt();
			
			// check to see if number is larger than 20
			
			NumList = fetchNum;
			i++;
		  }while (fetchNum > 0);
		
		return NumList;
	}
		
		
			
	public static int generateTarget(ArrayList NumList)
	{
		String numList = "";
		int secretNumber = 0;
		int numLen = 0;
		
		Random randomNumber = new Random();
		int targetNum = (int) (Math.random()*21)+1;

		
		
		//Need to find out the length of the array
		numLen = numList.length();
		
		//secretNumber = 1 + randomNumber; 
		System.out.println("The target number is " + targetNum);
	    return secretNumber;
	}
	
	public static int binarySearch(int[ ] elements, int target)
	{
		int left = 0;
		int right = elements.length - 1;
		while (left <= right)
		{
			int middle = (left + right) / 2;
			if (target < elements[middle])
			{
				right = middle - 1;
			}
			else if (target > elements[middle])
			{
				left = middle + 1;
			}
			else
			{
				return middle;
			}
		}
	return -1;
	}

}
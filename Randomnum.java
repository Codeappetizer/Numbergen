package Numbergen;
import java.util.*;

public class Randomnum {
	Scanner sc=new Scanner(System.in);
	int n,gen;
	
	public void RandomNum(){
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			numbers.add(i+1);
		}
		Collections.shuffle(numbers);
		System.out.println(numbers);
	}
	public void Lotterynums(){
		for(int i=0;i<3;i++){
		System.out.println("Enter a num b/w 1 to 10");
		n=sc.nextInt();
		if(n!=4){
			System.out.println("Ur entered num is wrong");
		}
		if(n==4){
			System.out.println("You won the lottery");
		break;
		}
	}
		System.out.println("Ur chances are completed");
	}
	
	}



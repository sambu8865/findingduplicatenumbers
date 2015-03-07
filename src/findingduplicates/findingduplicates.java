package findingduplicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findingduplicates {
	private int size;
	
	private  List<Integer> list= new ArrayList<Integer>();
	
	public void findduplicate(){
		int size=list.size();
		int sum=0;
		for(int i=0;i<size;i++){
			sum+=list.get(i);
		}
		int duplicate=sum-(size*(size-1)/2);
		//System.out.println("The sum is "+sum +" and size is "+size);
		System.out.println("The duplicate number is "+duplicate);
		
	}
	
	public static void main(String[] args){
		findingduplicates fd=new findingduplicates();
		int num=0;
		Scanner s= new Scanner(System.in);
			System.out.println("Enter numbers in sequential order and enter -999 to find the duplicate: ");
			while(true){
			num=s.nextInt();
			if(num==-999){
				break;
			}
			fd.list.add(num);
		}
			fd.findduplicate();
	}

}

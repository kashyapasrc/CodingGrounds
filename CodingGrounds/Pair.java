import java.util.*;
class Pair{

	int array[];
	int x;
	Pair(int array[],int x){
		this.array=array;
		this.x=x;
	}
	void findPair(){
		System.out.println(Arrays.toString(array));
		System.out.println("Sum:value:"+x);
		HashSet<Integer> hash=new HashSet<>();
		for(int val:array){
			int temp=x-val;
			if(hash.contains(temp)){
				System.out.println("Pair element found :"+temp+","+val);
		
			}
			hash.add((Integer)val);

		}	
	}




	public static void main(String []args){
		int []array={1,4,2,5,6,15,9};
		int x=10;	
		Pair p=new Pair(array,x);
		p.findPair();
		
	
	}



}
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MorganStanleyTest {
	
	public static int difference_calculator(List<Integer> arr) {
	    // Write your code here
	        int indicatorOne=0;
	        int indicataorTwo=0;
	        int count1[] = new int[15];
	        int count2[]=new int[15];
	        
	        int counter =0;
	            for(int i=0;i<arr.size();++i){
	                for(int j=i;j<arr.get(i);j++){
	                    if(arr.get(j)==arr.get(i)){
	                        ++counter;
	                    }
	                    else{
	                        break;
	                        }
	                }
	            if(counter == arr.get(i))
	                {
	                    ++count1[i];
	                }
                counter=0;

	    }
	    
	    for(int i=1;i<arr.size();i++){
	        if(arr.get(i) ==i){
	            for(int j=i;j<arr.get(i);j++){
	                    if(arr.get(j)==arr.get(i)){
	                        ++counter;
	                    }
	                    else{
	                        break;
	                        }
	                }
	            if(counter == arr.get(i))
	                {
	                    ++count2[i];
	                    counter=0;
	                }
	        }
	    }
	    
	    for(int i=0;i<count1.length;i++){
	        if(count1[i]>0)
	        {
	            indicatorOne=indicatorOne+count1[i];
	        }
	    }
	    
	    for(int i=0;i<count2.length;i++){
	        if(count2[i]>0){
	            indicataorTwo=indicataorTwo+count2[i];
	        }
	    }
	    
	    System.out.println("Indicator 1 = "+indicatorOne);
	    System.out.println("Indicator 2= "+indicataorTwo);
	    
	    return Math.abs(indicataorTwo-indicatorOne);
	    
	    }
	
	public static void main(String[] args) {
		int ar[] = {3,3,2,2,5,5,5,5,5,3,3,2,2};
		
		List<Integer> list = new ArrayList<>();
		Arrays.stream(ar).forEach(e->list.add(e));
		difference_calculator(list);
		
		
	}


}


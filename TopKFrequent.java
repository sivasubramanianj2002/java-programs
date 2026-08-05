/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  int [] arr = {4,2,1,2,3,4,4,1,2,2};
	  solve(arr);
	}
	
	static void solve(int [] arr){
	    HashMap<Integer,Integer>map = new HashMap<>();
	    for(int n : arr){
	        map.put(n,map.getOrDefault(n,0)+1);
	    }
	    int secondFre = -1; int secondEle = -1; 
	    int firstEle = -1 ; int firstFre = -1;
	    for(int key : map.keySet()){
	        int freq = map.get(key);
	        
	        if(freq > firstFre){
	            secondEle = firstEle;
	            secondFre = firstFre;
	            firstFre = freq;
	            firstEle = key;
	        }else if(freq > secondFre){
	            secondFre = freq;
	            secondEle = key;
	        }
	    }
	    
	    System.out.println("First:"+ firstEle +"->" + firstFre + "/nSecond:" + secondEle + "->" + secondFre);
	}
}

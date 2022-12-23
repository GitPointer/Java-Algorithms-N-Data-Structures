package com.my.leetcode.old;

import java.util.ArrayList;
import java.util.HashMap;

public class MostFrequentElement {
	
	
	  public static void main(String[] args) {
		    HashMap<Integer, Integer> countMp= new HashMap<Integer, Integer>();
		    int maxCount=0;
		    int res=-1;
		    ArrayList<Integer> meals = new ArrayList<Integer>();
		    meals.add(1);
		    meals.add(2);
		    meals.add(2);
		    meals.add(3);
		    meals.add(3);

		    for (int meal : meals) {
		      if(countMp.containsKey(meal)){
		         int val=countMp.get(meal);
		        countMp.put(meal,++val);
		      }else{
		        countMp.put(meal,1);
		      }
		       if(maxCount< countMp.get(meal)){
		        res=meal;
		        maxCount= countMp.get(meal);
		        
		      }else if(maxCount==countMp.get(meal)) {
		    	  res = Math.min(res, countMp.get(meal)) ;
		      }
		    }
		    System.out.println(res);
	  }

}

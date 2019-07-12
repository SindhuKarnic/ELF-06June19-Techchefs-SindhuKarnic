package com.techchefs.java.collectionstwo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

@Log
public class Second {
	public static void main(String[] args) {
		Emp emp1=new Emp("sam", 6, 2000,"dev"); 
		Emp emp2=new Emp("ann", 1, 4000,"HR"); 
		Emp emp3=new Emp("tom", 3, 1000,"testing"); 
		Emp emp4=new Emp("jane", 2, 3000,"software engg"); 
		Emp emp5=new Emp("sarah", 4, 2000,"IT"); 
		ArrayList<Emp> t = new ArrayList<Emp>();
		t.add(emp1);
		t.add(emp2);
		t.add(emp3);
		t.add(emp4);
		t.add(emp5);

		
		Comparator<Emp> c=(i,j)->{
			Integer a=i.salary;
			Integer b=j.salary;
			
			return a.compareTo(b);
		};
		Emp minValue= t.stream().max(c).get();
		log.info(" "+minValue);
		
		

		
	}
	}



package com.techchefs.javaapp.collection;

import java.util.TreeSet;
import java.util.logging.Logger;

public class EmployeeSortTest {

private static final Logger log=Logger.getLogger("myLog");
	
	public static void main(String[] args) {
			
			EmpById r=new EmpById();
			EmpBySal s=new EmpBySal();
			EmpByName n=new EmpByName();
			int key=1;		
			TreeSetEmp p=new TreeSetEmp();

			TreeSet<EmployeeSort> t;
			switch (key) {
			case 1:
				 t=new TreeSet<EmployeeSort>(n);
			p.test(t);
				 break;
			case 2:
				t=new TreeSet<EmployeeSort>(r);
				p.test(t);

				break;
			case 3:
				t=new TreeSet<EmployeeSort>(s);
				p.test(t);

				break;
				
			default:
				log.info("invalid number");
				break;
			}

			
		}

	}


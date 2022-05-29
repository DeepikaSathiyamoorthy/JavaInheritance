package com.vstl.javaInheritance;

public class HierarchicalInheritance {

	int intenglish = 72;
	int intscience = 83;
	int intmaths = 91;
	
	void exam() {
		
		System.out.println("End of Exam Results");
	}
	
}

//inherited the parent class HierarchicalInHeritance
class SemesterOne extends HierarchicalInheritance{
	
	void firstsemester() {
		
		double doublesumofsemone = intenglish+intmaths+intscience;
		float floatfirstsemresult = (float) (doublesumofsemone*100)/300; 
		System.out.println("First Semester Percentage: " + floatfirstsemresult +"%");
	}
}


//inherited the parent class HierarchicalInHeritance, 
//created obj for semesterone class which has no connection with Semestertwo class
class SemesterTwo extends HierarchicalInheritance {
	
	void secondsemester () {
		
		int intcomputerscience = 95;
		double doublesecondsemresult = (((intenglish+intmaths+intscience+intcomputerscience)*100)/400);
	System.out.println("Second Semester Percentage: " +doublesecondsemresult+ "%" );
	
	SemesterOne objfirstsem = new SemesterOne();
	objfirstsem.firstsemester();
	
	objfirstsem.exam();
	
	}
	
}
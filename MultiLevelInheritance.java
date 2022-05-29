package com.vstl.javaInheritance;

public class MultiLevelInheritance {

	 void variabledeclarationclass() {
		
		@SuppressWarnings("unused")
		String stringempfirstname = "Ram";
		@SuppressWarnings("unused")
		String stringemplastname = "Rajan";
	System.out.println("parent clasee");
		
	 }
	
}

 class EmployeePersonalDetails extends MultiLevelInheritance {
	
	void personaldetails(String stringempfirstname, String stringlastname) {
	
		@SuppressWarnings("unused")
		int intempeno = 45;
		@SuppressWarnings("unused")
		int intdeptcode = 243;
		String stringempname = stringempfirstname.concat(stringlastname);
		
		System.out.println("Employee Name : " + stringempname);
	
	}
}

 class EmployeeDepartment extends EmployeePersonalDetails {
	
	void employeedept(int intempno, int intdeptcode) {
		
		String stringdept = String.valueOf(intdeptcode);
		String stringcode = String.valueOf(intempno);
		System.out.println("Employee Dept : " +stringcode + stringdept);
	}
} 










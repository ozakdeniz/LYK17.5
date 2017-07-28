package tr.org.linux.kamp.studentotomation;

import java.util.Scanner;

public class Student {

	String name;
	String id;
	int grade;
	
	public void idControl(String id) throws IDException {
		if(id.length() != 11) {  
			throw new IDException();
		}/// hata fırlat
		else this.id = id;
	}
	
	public void gradeControl(int grade)throws GradeExceptionn {
		if(grade < 0 || grade > 100) {
			try {
				throw new GradeExceptionn();
				
			} catch (GradeExceptionn e) {
				// TODO Auto-generated catch block
				System.out.println("Not değeri 0-100 arası olmalıdır");
			}
			
		}else {
			this.grade = grade;
			
		}
	}

}
	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTcno() {
		return Tcno;
	}

	public void setTcno(String tcno) {
		Tcno = tcno;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
	
	public static void main(String[] args) {
	
	}
	
	
	
	public static void gradeControl(int not) throws GradeExceptionn {
		if(not<0 && not>100) {
			
			throw new GradeExceptionn();
		}else {
			
			System.out.println("Notunuz :"+ not);
			
		}
	}
	
	public static void idControl (String Tcno) throws IDException{
		if(Tcno.length()<11 && Tcno.length()>11) {
			
			throw new IDException();
			
		}else {
			
			System.out.println("Tc no su :"+ Tcno);
		}
	}*/
/*package tr.org.linux.kamp.studentotomation;

import java.util.Scanner;

public class Student {

	static String ogr_tc;
	static int ogr_not;
	static String org_ad;

	public static void main(String[] args) {

	}

	public static void gradeControl(int not) throws GradeException {
		if (not > 0 || not < 100) {
			System.out.println("Notunuz:" + not);
		} else {
			throw new GradeException();
		}
	}

	public static void tcException(String tcno) {
		if (tcno.length() == 11) {
			System.out.println("Tc'niz:" + tcno.length());
			try {
				throw new IDException();
			} catch (IDException e) {
				System.out.println(e.getMessage());
			}
		} else {

		}

	}

}
*/
package tr.org.linux.kamp.studentotomation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OtomationApplication {

		public static void main(String[] args) {
			
			Student st = new Student();
			Scanner  in = new Scanner(System.in);
			
			try {
				
				System.out.println("Ogrencinin adını giriniz : ");
				st.name = in.nextLine();
				System.out.println("Ogrencinin Tc No giriniz : ");
				st.id = in.nextLine();
				st.idControl(st.id);
				System.out.println("Ogrencinin Notunu giriniz : ");
				st.grade = in.nextInt();
				st.gradeControl(st.grade);
				
				
			} catch (InputMismatchException e) {
				System.out.println("Hatalı tip girişi");
				
				
			} catch (IDException e) {
				System.out.println(e.getMessageForId());
				
				
			} catch (GradeExceptionn e) {
				System.out.println(e.getMessageForGrade());
				
				
			}
			System.out.println("adı : "+ st.name + "  tc "+ st.id + " not " + st.grade);
			
		}
	}
			
		/*System.out.println("Öğrenci adı ve soyadını eksiksiz giriniz :");
		String name = input.nextLine();
		Std1.setName(name);
		
		
		System.out.println("Öğrenci tc no sunu eksiksiz bir şekilde giriniz :");
		String id = input.next();
		Std1.setTcno(id);
		
		System.out.println("Lütfen öğrenci notunu eksiksiz giriniz :");
		int grade = input.nextInt();
		Std1.setGrade(grade);
		
		
		Student.gradeControl(grade);
		Student.idControl(id);
		
		Std1.gradeControl(Std1.grade);*/
	
		/*} catch (InputMismatchException e) {
			System.out.println("Hatalı tip girişi");
		}catch (IDException e) {
			System.out.println(e.getMessageForId());
		}catch (GradeExceptionn e) {
			System.out.println(e.getMessageForGrade());
		}
		
		System.out.println("Adı Soyadı :"+ st.name+ " tc no :"+ st.Tcno+ " notu :"+st.grade);	
		}
	}*/

	/*package tr.org.linux.kamp.studentotomation;

import java.util.*;

public class StudentOtomationTest {

	public static void main(String[] args) throws Exception {

		Student student = new Student();
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Ogrencinin adını giriniz : ");
			student.org_ad = input.nextLine();
			System.out.println("Ogrencinin Tc No giriniz : ");
			student.ogr_tc = input.nextLine();
			student.tcException(student.ogr_tc);
			System.out.println("Ogrencinin Notunu giriniz : ");
			student.ogr_not = input.nextInt();
			student.gradeControl(student.ogr_not);

		} catch (InputMismatchException e) {
			System.out.println("Hatalı tip girişi");
		} catch (GradeException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("adı : " + student.org_ad + "  tc " + student.ogr_tc + " not " + student.ogr_not);
	}

}
*/

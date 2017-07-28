package tr.org.linux.kamp.errors;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorExcepttion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = 5;
		int b = 0;
		
		
		int array[] = {1};
		int yas = -5;
		
		//System.out.println("Bir sayi giriniz: ");
		
		try {
			methodB();
			methodA();
			if(yas < 0) {
				throw new Exceptionss();/*throw un iki kullanımı vardır bir methodun yanına throws ile tanımlarız
				iki try bloğunun içinde tanımlarız her ikisi de hatayı hata sınıfına fırlatır*/
			}
			//System.out.println(array[array.length]);
			//int sayi = input.nextInt();
			//array[95] = 5;
			//int bolum = a/b;		
		/*int bolum = a/b; bu bir mantık hatasıdır 0 a bölme hatası. a ile b yi tanımladığımızda program durmuştur
		bölme işlemini görmez bu hatadan kurtulmak için try{... hatalı olabiliceğini düşündüğümüz 
		kodları yazarız }catch{ ... diğer kodları yazarız bu stil hataları azaltmamıza yardımcı olur */
		}catch(ArithmeticException e){
			System.out.println("Sıfıra bolme hatası yakalandı.");
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arrayin boyutu aşıldı.");
			
			
		}catch(InputMismatchException e) {
			System.out.println("Girdi hatası.");
			
			
		}catch(Exceptionss e){
			System.out.println(e.getMessage());
			
			
		}finally {
			System.out.println("Ne olursa");/*finally Ne işe yarar: bütün hataları yakalayıp en son işlemi kapatmak
			için kullanılır ... Daha çok araştır. :try da açtığımız metodları dosyaları cathde hatasını yakalayıp finally
			de kapatırız bir nevi break gibi iş yapar hata verse de vermese de dosyayı kapatmazsak programı yavaşlatır
			bu yüzden son olarak finally de dosyaları kapatırız close.field(); şeklinde*/
		}
		
		
		System.out.println("Try-catch bloğu bitti.");
	}
	
	public static void methodA() throws ArithmeticException{/*throws ne işe yarar: throw oluşabiliceğini
	düşündüğümüz hataları tanımlarken onları daha önceden oluşturduğumuz hataları tanımlama 
	sınıfına atarak düzeltmemizi sağlar */
		System.out.println("Method A");
		int a = 5/0;
		
		
	}
	public static void methodB() {
		System.out.println("Method B");
		
		
		try {
			int a = 5/0;/* olabilicek hataları tanımlarız try ın içinde catchin içindeyse hatayı nasıl çözüceğimizi 
			yada tanımlıyabiliceğimizi oluştururuz*/
			
			
		}catch(ArithmeticException e){
			System.out.println("Hata methodB de yakalandı.");
			
		}
	}
}

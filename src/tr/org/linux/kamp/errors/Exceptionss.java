package tr.org.linux.kamp.errors;

public class Exceptionss extends Exception {/*Örneğin bisiklet sınıfı oluşturduk
sonra birde dağ bisikleti sınıfı oluşturduk dağ bisikleti sınıfında da bisikletteki
gibi özellikler ek olarak kendine ait özellikleri de var bu özellikleri iki kez tanımlamak
yerine extends ile bisiklet sınıfındaki özellikleri dağ bisikletinede tanımlı kılıyorum artık yapmam
gereken tek şey dağ bisikletinin kendine ait özelliklerini tanımlamak yani dağ bisikleti
bisikletin özelliklerini miras alıyor.*/
	
	
	
	
	public String getMessage() {
		return "Hata Exceptionss sınıfında yakalandı";
		
		
		
	}

}

package vjezbe3;

public class KompleksniBroj {
	private float realniDio;
	private float imaginarniDio;
	
	public KompleksniBroj() {
		realniDio = 0;
		imaginarniDio = 0;
	}
	
	public KompleksniBroj(float realniDioP, float imaginarniDioP) {
		realniDio = realniDioP;
		imaginarniDio = imaginarniDioP;
	}
	
	public float dajRealni(){
		return realniDio;
	}
	
	public float dajImaginarni(){
		return imaginarniDio;
	}
	
	public void postaviRealniDio(float realniDioP) {
		realniDio = realniDioP;
	}
	
	public void postaviImaginarniDio(float imaginarniiDioP) {
		imaginarniDio = imaginarniiDioP;
	}
	
	public String dajBroj() {
		return realniDio + " + j(" + imaginarniDio + ")";
	}
	
	public float modulBroja(){
		return (float) Math.sqrt(realniDio*realniDio + imaginarniDio*imaginarniDio);
	}
	
	public KompleksniBroj saberi(KompleksniBroj a){
		KompleksniBroj rezultat = new KompleksniBroj();
		rezultat.postaviRealniDio(realniDio + a.realniDio);
		rezultat.postaviImaginarniDio(imaginarniDio + a.imaginarniDio);
		return rezultat;
	}
		
	public KompleksniBroj oduzmi(KompleksniBroj a){
		KompleksniBroj rezultat = new KompleksniBroj();
		rezultat.postaviRealniDio(realniDio - a.realniDio);
		rezultat.postaviImaginarniDio(imaginarniDio - a.imaginarniDio);
		return rezultat;
	}
		
	public KompleksniBroj pomnozi(KompleksniBroj a){
		KompleksniBroj rezultat = new KompleksniBroj();
		rezultat.postaviRealniDio(realniDio * a.realniDio - imaginarniDio*a.imaginarniDio);
		rezultat.postaviImaginarniDio(imaginarniDio*a.realniDio +realniDio*
		a.imaginarniDio);
		return rezultat;
	}

}
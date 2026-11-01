package drugaGrupa;

public class Zadatak2 {
	
	public static String dajPodatke(String ulaz) {
		String izlaz = "";
		
		int indexR = ulaz.indexOf('r');
		double obrtaji = Double.parseDouble(ulaz.substring(indexR + 1, indexR + 5));
		obrtaji /= 60.0;
		obrtaji = Math.round(obrtaji * 100.0) / 100.0;
		izlaz +="{'obrtaji': " + obrtaji + ", 'tempF': ";
		
		int indexTC = ulaz.indexOf('t');
		double tempC = Double.parseDouble(ulaz.substring(indexTC + 1, indexTC + 4));
		double tempF = tempC * 9/5 + 32;
		tempF = Math.round(tempF * 10.0) / 10.0; 
		izlaz += tempF + ", 'gorivo': ";
		
		int indexF = ulaz.indexOf('f');
		int gorivo = Integer.parseInt(ulaz.substring(indexF + 1, indexF + 4));
		izlaz += gorivo + "}";
		
		return izlaz;
	}

	public static void main(String[] args) {
		String ulaz =  "f045r2500v128s072t090*3B";
		System.out.println(dajPodatke(ulaz));
		

	}

}

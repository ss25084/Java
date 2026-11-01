package zadatak2;

public class Zadatak2b {
	public static String dajPodatke(String ulaz){
		String izlaz = "";
		
		int indexC = ulaz.indexOf('c');
		int smjer = Integer.parseInt(ulaz.substring(indexC + 1, indexC + 4));
		izlaz += "{smjer: " + smjer + ", 'brzinaSr': ";
		
		int indexS = ulaz.indexOf('s');
		double brzinaSr =Double.parseDouble(ulaz.substring(indexS + 1, indexS + 4));
		brzinaSr *= 0.44704;
		brzinaSr = Math.round(brzinaSr * 100.0) / 100.0;
		izlaz += brzinaSr + ", brzinaMax: ";
		
		int indexG = ulaz.indexOf('g');
		double brzinaMax = Double.parseDouble(ulaz.substring(indexG + 1, indexG + 4));
		brzinaMax *= 0.44704;
		brzinaMax = Math.round(brzinaMax * 100.0) / 100.0;
		
		izlaz += brzinaMax + "}";
	
		return izlaz;
	}

	public static void main(String[] args) {
		String ulaz =  "c123s015g028t068r002p017h53b10020*CS";
		System.out.println(dajPodatke(ulaz));

	}

}

package zadatak2;


public class Zadatak2a {
	
	public static String dajPodatke(String ulaz) {
		String izlaz = "";
		
		int indext = ulaz.indexOf('t');
		
		double tempF = Double.parseDouble(ulaz.substring(indext + 1, indext + 4));
		double tempC = (tempF - 32) * 5/9;
		tempC = Math.round(tempC * 10.0) / 10.0;
		
		izlaz += "{'temp':" + tempC + ", 'vlaznost':";
		
		int indexh = ulaz.indexOf('h');
		int vlaznost = Integer.parseInt(ulaz.substring(indexh + 1, indexh + 3));
		
		izlaz += vlaznost + ", pritisak:";
		
		int indexb = ulaz.indexOf('b');
		double pritisak = Double.parseDouble(ulaz.substring(indexb + 1, indexb + 6));
		pritisak *= 0.1;
		//pritisak = Math.round(pritisak * 10.0)/ 10.0;
		
		izlaz += pritisak + "}" ;
		
		return izlaz ;
	}

	public static void main(String[] args) {
		String ulaz = "c000s000g000t082r000p000h48b10022*3C";
		System.out.println(dajPodatke(ulaz));

	}

}

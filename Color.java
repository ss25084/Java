package vjezbe3m;

public class Color {
	private int red;
	private int green;
	private int blue;
	
	public Color() {
		red = 0;
		green = 0;
		blue = 0;
	}
	
	public Color(int redP, int greenP, int blueP) {
		setRed(redP);
		setGreen(greenP);
		setBlue(blueP);
	}
	
	public int getRed() {
		return red;
	}
	public void setRed(int redP) {
		if (redP >= 0 && redP <= 255) {
			this.red = redP;
		}else {
			System.out.println("izaberite vrijednost izmedju 0 i 255");
		}
	}
	
	public int getGreen() {
		return green;
	}
	public void setGreen(int greenP) {
        if (greenP >= 0 && greenP <= 255) {
        	this.green = greenP;
		}else {
			System.out.println("izaberite vrijednost izmedju 0 i 255");
		}
	}
	
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blueP) {
        if (blueP >= 0 && blueP <= 255) {
        	this.blue = blueP;
		}else {
			System.out.println("izaberite vrijednost izmedju 0 i 255");
		}
	}
	
	public void addRed(int change) {
		int novaBoja = getRed() + change;
		if(novaBoja >= 0 && novaBoja <= 255) {
		  setRed(novaBoja);
		}else if(novaBoja < 0){
			setRed(0);
			System.out.println("Nije moguce ispuniti zahtjev");
		}else {
			setRed(255);
			System.out.println("Nije moguce ispuniti zahtjev");
		}
	}
	
	public void addGreen(int change) {
		int novaBoja = getGreen() + change;
		if(novaBoja >= 0 && novaBoja <= 255) {
			setGreen(novaBoja);
		}else if(novaBoja < 0) {
			setGreen(0);
			System.out.println("Nije moguce ispuniti zahtjev");
		}else {
			setGreen(255);
			System.out.println("Nije moguce ispuniti zahtjev");
		}
	}

	public void addBlue(int change) {
		int novaBoja = getBlue() + change;
		if (novaBoja >= 0 && novaBoja <= 255) {
			setBlue(novaBoja);
		}else if(novaBoja < 0) {
			setBlue(0);
			System.out.println("Nije moguce ispuniti zahtjev");
		}else {
			setBlue(255);
			System.out.println("Nije moguce ispuniti zahtjev");
		}
	}
	
	public void printColor() {
		System.out.println("Red = " + getRed() + ", Green = " + getGreen() + ", Blue = " + getBlue());
	}
	

}

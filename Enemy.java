package TatineVjezbe;

public class Enemy {
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	
	public Enemy(int xP, int yP, int widthP, int heightP, int damageP) {
		x = xP;
		y = yP;
		width = widthP;
		height = heightP;
		damage = 0;
		setDamage(damageP);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int xP) {
		this.x = xP;
	}
	public int getY() {
		return y;
	}
	public void setY(int yP) {
		this.y = yP;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int widthP) {
		this.width = widthP;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int heightP) {
		this.height = heightP;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damageP) {
		if (damageP >= 0 && damageP <=100) {
			this.damage = damageP;
		}else {
			System.out.println("Greska: damage mora biti u opsegu 0-100!");
		}
		
	}
	
	

}

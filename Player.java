package TatineVjezbe;

public class Player {
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	
	public Player(int xP, int yP, int widthP, int heightP, int healthP) {
		x = xP;
		y = yP;
		width = widthP;
		height = heightP;
		health = 100;
		setHealth(healthP);
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
	public int getHealth() {
		return health;
	}
	public void setHealth(int healthP) {
		if(healthP >=0 && healthP <= 100) {
			this.health = healthP;
		}else {
			System.out.println("Greska: health mora biti u opsegu 0-100!");
		}
		
	}
	
	
	
	
}

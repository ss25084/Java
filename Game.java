package TatineVjezbe;
import java.util.Scanner;

public class Game {
	
    public static boolean checkCollision(Player p, Enemy e){
		  boolean preklapanjeX = p.getX() < e.getX() + e.getWidth()
		                        && e.getX() < p.getX() + p.getWidth();
		  boolean preklapanjeY = p.getY() < e.getY() + e.getHeight()
		                        && e.getY() < p.getY() + p.getHeight();
		  return preklapanjeX && preklapanjeY;
    }
	 
	public static void decreaseHealth(Player p, Enemy e) {
		int novoZdravlje = p.getHealth() - e.getDamage();
		if(novoZdravlje < 0) {
			novoZdravlje = 0;
			p.setHealth(novoZdravlje);
		}
	}
	
	public static void napad(Player p, Enemy e, String naziv) {
		if(checkCollision(p,e)) {
			decreaseHealth(p, e);
			System.out.println("Sudar sa " + naziv + "! Health igraca: " + p.getHealth());
		}else {
			 System.out.println("Nema sudara sa " + naziv + ". Health igraca: " + p.getHealth());
		}
	}
	
	public static void main(String[] args) {
		
		Player igrac = new Player(0, 0, 10, 10, 100);
		Enemy e1 = new Enemy(5, 5, 10, 10, 30);   
	    Enemy e2 = new Enemy(20, 0, 5, 5, 80); 
	    
	    igrac.setHealth(150);
	    e2.setDamage(-10);
	    
	    System.out.println("Igrac: (" + igrac.getX() + ", " + igrac.getY() + "), "
	            + igrac.getWidth() + "x" + igrac.getHeight() + ", health " + igrac.getHealth());
	    System.out.println("Enemy1: (" + e1.getX() + ", " + e1.getY() + "), damage " + e1.getDamage());
	    System.out.println("Enemy2: (" + e2.getX() + ", " + e2.getY() + "), damage " + e2.getDamage());
	    System.out.println();
	    
	    e2.setX(8);
	    e2.setY(2);
	    System.out.println("\nEnemy2 pomjeren na (" + e2.getX() + ", " + e2.getY() + ")");
	    napad(igrac, e2, "Enemy2");  
		    
	}

}

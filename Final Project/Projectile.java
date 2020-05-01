

public class Projectile extends Ammo {
	private final static double damage = 250, speed = 7/4*ArenaComponent.gameTickPeriod;
	public final static double size = 30;
	
	public Projectile(int xLoc, int yLoc, double angle) {
		super(xLoc, yLoc, angle, speed, size, size, damage);
	}

}

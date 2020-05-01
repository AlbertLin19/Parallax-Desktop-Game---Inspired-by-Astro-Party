

public class LaserBeam extends Ammo {
	private final static double damage = 600, speed = 5*ArenaComponent.gameTickPeriod;
	public final static double width = 1600, height = 80;
	
	public LaserBeam(int xLoc, int yLoc, double angle) {
		super(xLoc, yLoc, angle, speed, width, height, damage);
	}

}

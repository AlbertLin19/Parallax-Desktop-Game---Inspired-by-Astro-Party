

public class HomingMissile extends Ammo {
	private final static double damage = 400, speed = 0.4*ArenaComponent.gameTickPeriod, turnSpeed = 0.09;
	public final static double size = 80;
	
	public HomingMissile(int xLoc, int yLoc, double angle) {
		super(xLoc, yLoc, angle, speed, size, size, damage);
	}
	
	public void turnTo(int xTgt, int yTgt) {
		double targetAngle = Math.atan((yTgt-y)/(x-xTgt));
		if (xTgt<x) {
			targetAngle-=Math.PI;
		}
		double initialAngle = getVelocityAngle();
		while (initialAngle<0 || initialAngle>2*Math.PI) {
			if (initialAngle<0) {
				initialAngle+=2*Math.PI;
			} else {
				initialAngle-=2*Math.PI;
			}
		}
		while (targetAngle<0 || targetAngle>2*Math.PI) {
			if (targetAngle<0) {
				targetAngle+=2*Math.PI;
			} else {
				targetAngle-=2*Math.PI;
			}
		}
		if (targetAngle > initialAngle) {
			if (targetAngle - initialAngle < Math.PI/2)
				changeAngle(turnSpeed);
			else
				changeAngle(-turnSpeed);
		} else {
			if (initialAngle - targetAngle < Math.PI/2)
				changeAngle(-turnSpeed);
			else
				changeAngle(turnSpeed);
		}
	}
	

}

import java.awt.geom.Ellipse2D;

public abstract class MovableGamePiece extends Ellipse2D.Double {
	protected Vector velocity;
	
	public MovableGamePiece(int xLoc, int yLoc, double angle, double speed, double width, double height) {
		super(xLoc, yLoc, width, height);
		velocity = new Vector(angle, speed);
	}
	public void moveTick() {
		x+=velocity.getXMagnitude();
		y-=velocity.getYMagnitude();
	}
	
	public void changeSpeed(double speedChange) {
		velocity.changeMagnitude(speedChange);
	}
	
	public void changeAngle(double angleChange) {
		velocity.changeAngle(angleChange);
	}
	
	public double getVelocityAngle() {
		return velocity.getAngle();
	}

}

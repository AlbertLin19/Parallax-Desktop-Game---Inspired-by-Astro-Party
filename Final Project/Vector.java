
public class Vector {
	private double angle, magnitude;
	
	/**
	 * 
	 * @param angleIn in radians
	 * @param magnitudeIn
	 */
	public Vector(double angleIn, double magnitudeIn) {
		angle = angleIn;
		magnitude = magnitudeIn;
	}
	
	public double getAngle() {
		return angle;
	}
	public double getMagnitude() {
		return magnitude;
	}
	public double getXMagnitude() {
		return magnitude*Math.cos(angle);
	}
	public double getYMagnitude() {
		return magnitude*Math.sin(angle);
	}
	
	public void setAngle(double angleIn) {
		angle = angleIn;
	}
	public void setMagnitude(double magnitudeIn) {
		magnitude = magnitudeIn;
	}
	
	public void changeAngle(double angleChange) {
		angle+=angleChange;
	}
	public void changeMagnitude(double magnitudeChange) {
		magnitude+=magnitudeChange;
	}
	
	

}

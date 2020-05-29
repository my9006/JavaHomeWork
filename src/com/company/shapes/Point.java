package com.company.shapes;

public class Point {
	int coordinateX;
	int coordinateY;

	public Point(int coordinateX, int coordinateY) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}

	public Point() {
	}

	public int getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}

	public double distanceFrom(){
		return Math.sqrt(Math.pow(this.coordinateX, 2)+Math.pow(this.coordinateY, 2));
	}
	public double distanceFrom(Point point){
		int distanceX = this.coordinateX-point.getCoordinateX();
		int distanceY = this.coordinateY-point.getCoordinateY();

		return Math.sqrt(Math.pow(distanceX, 2)+Math.pow(distanceY, 2));
	}

}

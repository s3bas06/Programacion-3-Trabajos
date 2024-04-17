package Program;

public class player {
	int x;
	int y;
	int width;
	int height;
	String color;
	
	public player(int x, int y, int width, int height, String color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean colision(player pared) {
		
		if(
			((this.getX()	+ this.getWidth()) >= (pared.getX())) && 
			((this.getX()) <= (pared.getX() + pared.getWidth())) &&
			(this.getY() + this.getHeight() >= pared.getY()) &&
			(this.getY() <= (pared.getY() + pared.getHeight()))
				) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
}

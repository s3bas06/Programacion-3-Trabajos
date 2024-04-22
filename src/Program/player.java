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
	
	public boolean colision(player paredes[]) {
		int tam = paredes.length;
		for(int i =0; i<tam-1  ; i++) {
			if(
				((this.getX()	+ this.getWidth()) >= (paredes[i].getX())) && 
				((this.getX()) <= (paredes[i].getX() + paredes[i].getWidth())) &&
				(this.getY() + this.getHeight() >= paredes[i].getY()) &&
				(this.getY() <= (paredes[i].getY() + paredes[i].getHeight()))
				) {
				return true;
			}			
		}
		
		return false;
		
	}
	
	
	
	
}

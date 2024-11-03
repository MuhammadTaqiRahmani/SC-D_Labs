package Lab03;

public class Rectangle {
	float length;
	float width;
	float area;
	
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}
	
	public Rectangle(float length, float width) {
		setLength(length);
        setWidth(width);
		
	}
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		if(length > 0.0f && length < 20.0f) {
			this.length = length;	
		}
		else {
			System.out.println("length must be in the range of 0 to 20");
			this.length = 1.0f;
		}
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		if(width > 0.0f && width < 20.0f) {
			this.width = width;	
		}
		else {
			System.out.println("length must be in the range of 0 to 20");
			this.width = 1.0f;
		}
	}
	
	public float calculateArea() {
		area = length * width;
		return area;
	}
	
    public float calculatePerimeter() {
        return 2 * (length + width);
    }

	public void displayOutput() {
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
		System.out.println("Area: "+calculateArea());
		System.out.println("Perimeter: "+calculatePerimeter());
	}
}

class Point {
	String id
	double x,y;
	//TODO add new variable
	String color;

	//TODO constructor
	//Empty constructor here
    public Point(){

    }

    //Constructor with parameters here
    public Point(String id, double x, double y, String color) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.color = color;
    }

	//TODO setters and getters

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

	public void move (char xDirection, char yDirection) {
		//TODO
		this.x += Integer.parseInt(String.valueOf(xDirection));
        this.y += Integer.parseInt(String.valueOf(yDirection));
	}

	public void draw () {
		//TODO
		System.out.println("The point with ID: " + this.id
                + " and color " + this.color
                + " have coordinates [X] " + (int) this.x
                + " and [Y] " + (int) this.y);
	}



}
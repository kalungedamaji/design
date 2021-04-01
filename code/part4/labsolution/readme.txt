A developer has decided to create the following design.

class Rectangle {
  private double length;
  private double width;
  
  public double getLength() { return length; }
  public void setLength(double value) { length = value; }
  
  public double getWidth() { return width; }
  public void setWidth(double value) { width = value; }  
}

class Square extends Rectangle {
  public void setLength(double value) {
    setWidth(value);
  }
  
  public void setWidth(double value) {
    super.setLength(value);
    super.setWidth(value);
  }  
}

Is this a good design or are there issues with it?

This is not a good design.
If we substitute a Square where a Rectangle is expected, we may be in trouble.
A user may query for the length and then compute the area after changing a width.

A Square may want to use a Rectangle instead of being treated as a Rectangle.

Delegation may be better than inheritance in this case.

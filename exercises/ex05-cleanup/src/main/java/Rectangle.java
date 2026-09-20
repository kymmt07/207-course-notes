/** Check documentation and code style on Rectangle. */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Initiates the rectangle.
   *
   * @param w width.
   * @param h height.
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Calculates the area of the rectangle.
   *
   * @return the area of the rectangle.
   */
  public double area() {
    return width * height;
  }

  /**
   * scales the rectangle.
   *
   * @param factor factor to multiply the scale by.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Determines if the rectangle is greater than the other.
   *
   * @param other rectangle to compare against.
   * @return whether it is greater.
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}

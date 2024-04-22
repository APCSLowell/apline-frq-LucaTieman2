public class APLine {
  private int value1, value2, value3;
  public APLine (int a, int b, int c) {
    value1 = a;
    value2 = b;
    value3 = c;
  }  
  public double getSlope () {
    return -(double)value1/value2;
  }
  public boolean isOnLine (int x, int y) {
    if ((value1*x) + (value2*y) + (value3) == 0) {
      return true;
    }
    return false;
  }
}

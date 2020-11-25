package exercise9;

public class Ellipse {

 private Point startPoint;
 private double a;
 private double b;

 public Ellipse() {
  startPoint = new Point (0,0);
  a = 1;
  b = 1;
 }

 public Ellipse(Point startPoint, double a, double b) {
   this.startPoint = startPoint;
   this.a = a;
   this.b = b;
 }

 public Ellipse (Ellipse otherEllipse) {
   startPoint = new Point (otherEllipse.startPoint);
   a = otherEllipse.a;
   b = otherEllipse.b;
 }
 public boolean isValid() {
    if (a>0 && b>0) {
      boolean isValid = true;
      return isValid;
    }else {
      boolean isValid = false;
      return isValid;
    }   
 }
 public void initialize(){
   do {
     System.out.println("Start point: ");
     startPoint.initialize();
     a = Utils.INPUT.nextDouble();
     b = Utils.INPUT.nextDouble();
   }while(!isValid());
 }

 public double calculatePerimeter() {
   double P = Math.PI*(3.0*(a+b) - Math.sqrt((3.0*a + b)*(a + 3.0*b)));
    return P;
 }

 public double calculateArea() {
   double A = Math.PI*a*b;
   return A;
 }

 public String getType() {
  if(a==b) {
    return "Cycle";
  } else {
    return "Ellipse";
  }
 }

 public String toString() {
   return String.format ("%s-[%s, %s], %s, P=%s, A=%s",startPoint, a, b, getType(), calculatePerimeter(), calculateArea());
 }

 public boolean equal(Ellipse otherEllipse) {
        boolean sameA = Utils.equals(a, otherEllipse.a);
        boolean sameB = Utils.equals(b, otherEllipse.b);
        boolean sameAReversed = Utils.equals(a, otherEllipse.b);
        boolean sameBReversed = Utils.equals(b, otherEllipse.a);
      
      return (sameA && sameB) || (sameAReversed && sameAReversed);
 }


}

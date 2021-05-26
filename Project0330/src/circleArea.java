
public class circleArea {
	   public double radius;
	   public double pie = 3.14;
	   public double circleArea=0;
	   
	   
	   
	   CircleArea(double radius){
	      
	      this.circleArea = pie*radius*radius;
	      
	   }
	   public void printArea() {
	      System.out.println(   "원넓이 : " + this.circleArea);
	      
	   }
}

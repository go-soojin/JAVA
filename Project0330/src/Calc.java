
public class Calc {
	 public static void main(String[] args) {
	      
	      Input i = new Input();
	      
	      double r = i.CircleInput();
	      CircleArea c1 = new CircleArea(r);
	      
	      
	      double[] rCalc = i.RhomInput();
	      RhombusArea r1 = new RhombusArea(rCalc);
	      
	      double[] tCalc = i.TrapezInput();
	      TrapezArea t1 = new TrapezArea(tCalc);
	      
	      
//	      double[] tCalc = i.TrapezInput();
//	      TriangleArea t2 = new TriangleArea(6.2, 2);
//	      
//	      double[] tCalc = i.TrapezInput();
//	      SquareArea s1 = new SquareArea(1.5, 6.2);
//	      
	      c1.printArea();
	      r1.printArea();
	      t1.printArea();
//	      t2.printArea();
//	      s1.printArea();
	   }
}

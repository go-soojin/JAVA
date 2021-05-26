
public class Input {
	   Scanner s1 = new Scanner(System.in);
	   public double CircleInput() {
	      System.out.println("반지름 입력하세요.");
	      double radius = s1.nextDouble();
	      return radius;
	   }
	   
	   public double[] RhomInput() {
	      System.out.println("마름모의 가로를 입력하세요");
	      double width = s1.nextDouble();
	      System.out.println("마름모의 세로를 입력하세요");
	      double height = s1.nextDouble();
	      //double calc=width*height;
	      double rCalc[] = {width, height};
	      return rCalc;
	      // 반환 두개 못해?
	   }
	   public double[] TrapezInput() {
	      System.out.println("평행사변형윗변을 입력하세요");
	      double lower = s1.nextDouble();
	      System.out.println("평행사변형아랫변을 입력하세요");
	      double upper = s1.nextDouble();
	      System.out.println("평행사변형높이를 입력하세요");
	      double height = s1.nextDouble();
	      
	      double tCalc[]= {lower,upper,height};
	      return tCalc;
	   }

}

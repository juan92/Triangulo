import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x1,y1,x2,y2,x3,y3;
		
		
		Punto pT1;
		Punto pT2;
		Punto pT3;
		
		System.out.print("INGRESE x DE PUNTO 1");
		x1 =sc.nextInt();
		System.out.print("INGRESE Y DEL PUNTO 1 ");
		y1 =sc.nextInt();
		System.out.print("INGRESE X DEL PUNTO 2 ");
		x2 =sc.nextInt();
		System.out.print("INGRESE Y DEL PUNTO 2");
		y2 =sc.nextInt();
		System.out.print("INGRESE X DEL PUNTO 3");
		x3 =sc.nextInt();
		System.out.print("INGRESE Y DEL PUNTO 3");
		y3 =sc.nextInt();
		
		pT1 = new Punto(x1,y1);
		pT2 = new Punto(x2,y2);
		pT3 = new Punto(x3,y3);
		
		Triangulo triangulo = new Triangulo(pT1,pT2,pT3);
		
		System.out.println(triangulo.toString());
		
		System.out.println(triangulo.HallarPerimetro());
		
		System.out.println(triangulo.TipoTriangulo());
	}

}

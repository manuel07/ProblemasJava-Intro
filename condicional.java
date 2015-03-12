import java.util.Scanner;
public class condicional{
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);

		System.out.print("Ingrese numero A: ");
		int a = rd.nextInt();
		System.out.print("Ingrese numero B: ");
		int b = rd.nextInt();

		//si son iguales, a>b a<b
		if (a==b){
			System.out.println("A y B son iguales ");
		}else if (a>b){
			System.out.println("A mayor que B ");
		}else{
			System.out.print("B mayor que A ");
		}

	}
}
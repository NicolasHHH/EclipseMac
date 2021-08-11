import tc.TC;

public class PolynomeDegre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC.print("Entrer a b c : ");
		
		
		double a = TC.lireDouble();
		double b = TC.lireDouble();
		double c = TC.lireDouble();
		
		double discriminant = b*b-4*a*c;
		TC.println("Discriminant = "+discriminant );
		
		if (discriminant < 0) {
			TC.println("Pas de racine");
		}
		else if (discriminant == 0) {
			TC.println("Racine double : "+ -b/2/a );
		}
		else {
			TC.println("Deux Racines : "+(-b-Math.sqrt(discriminant))/2/a+" et "
		+(-b+Math.sqrt(discriminant))/2/a);
		}
	}

}

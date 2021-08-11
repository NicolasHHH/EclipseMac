import java.util.Arrays;

import tc.TC;

public class Kovix3 {

		public static void traiter() {
			String nb_ps = TC.lireLigne();
			int n = Integer.parseInt(nb_ps);
			
			TC.print("Il y a "+n+" personne");
			if (n>1) TC.print("s");
			TC.println(".");
			
			for(int i = 0; i<n ; i++) {
				String ligne_per = TC.lireLigne();
				String[] mots = TC.motsDeChaine(ligne_per);
				int nb_ln = Integer.parseInt(mots[1]);
				TC.print("On a "+mots[1]+" positions pour le pseudo "+mots[0]+" aux instants ");
				Itineraire iti = new Itineraire(mots[0],nb_ln);
				
				for (int j=0;j<nb_ln;j++) {
					String infoj = TC.lireLigne();
					String[] pos_instantj = TC.motsDeChaine(infoj);
					Instant insj = new Instant(pos_instantj[0]);
					int xj =  Integer.parseInt(pos_instantj[1]);
					int yj =  Integer.parseInt(pos_instantj[2]);
					Position posj = new Position(insj,xj,yj);
					iti.ajouter(posj);
				}
				
				TC.print(Arrays.toString(iti.instants()));
				TC.println(".");
			}
			String nb_emp = TC.lireLigne();
			int n2 = Integer.parseInt(nb_emp);
			TC.print("Il y a "+n2+" emplacement");
			if (n2>1) TC.print("s");
			TC.println(".");
			
			
			for (int j=0; j< n2;j++) {
				String emp = TC.lireLigne();
				String[] mots = TC.motsDeChaine(emp);
				int x =  Integer.parseInt(mots[0]);
				int y =  Integer.parseInt(mots[1]);
				Emplacement empm = new Emplacement(mots[2],x,y);
				TC.println(empm.toString());
			}
			
			for(int i = 0; i<n ; i++) {
				String ligne_per = TC.lireLigne();
				String[] mots = TC.motsDeChaine(ligne_per);
				TC.println(mots[2]+" est le pseudo de "+mots[1]+" "+mots[0]+".");
			}
		
	
	}
}

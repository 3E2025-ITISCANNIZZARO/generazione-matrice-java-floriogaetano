public class Main
{
	public static void main(String[] args) {
	    //Creaziane matrice 
		int m [][]= new int [3][5];
		//Creazione array di boolean 
		boolean a []= new boolean [90];
		//Dichiarazione variabili temporanea
		int n=0;
		//Popolazione array di boolean
		for (int i=0; i<a.length; i++) {
			a[i]=false;
		}
		//Popolazione della matrice 3x5
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
			    //Verifica del numero
				do {
					n=(int)(Math.random()*90)+1;
				} while(a[n]==true);
				//Assegnazione nella matrice e assegnazione true mei boolean
				m[i][j]=n;
				a[n]=true;
			}
		}
		//Stampa matrice
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				if(m[i][j]<10) {
					System.out.print(0);
				}
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}

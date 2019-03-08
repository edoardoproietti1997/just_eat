package Model;

import java.util.Scanner;

public class Persona {

	Scanner scanner = new Scanner(System.in);

	String nome = scanner.next();
	String cognome = scanner.next();
	int giornoNascita = scanner.nextInt();
	int meseNascita = scanner.nextInt();
	int annoNascita = scanner.nextInt();

	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", giornoNascita=" + giornoNascita + ", meseNascita="
				+ MeseNascita() + ", annoNascita=" + annoNascita + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getGiornoNascita() {
		return giornoNascita;
	}

	public void setGiornoNascita(int giornoNascita) {
		this.giornoNascita = giornoNascita;
	}

	public int getMeseNascita() {
		return meseNascita;
	}

	public void setMeseNascita(int meseNascita) {
		this.meseNascita = meseNascita;
	}

	public int getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

	public int AnnoNascita() {

		if (annoNascita > 2000) {
			annoNascita = annoNascita - 2000;
		} else if (annoNascita < 2000) {
			annoNascita = annoNascita - 1900;
		} else if (annoNascita < 1900 || annoNascita > 2019) {
			System.out.println("non puoi essere vivo reinserisci");
			return AnnoNascita();
		}
		return annoNascita;
	}

	public String MeseNascita() {

		if (meseNascita > 1 && meseNascita < 12) {
			String stringNascitaDay = null;
			switch (meseNascita) {
			case 1:
				stringNascitaDay = "A";
				break;
			case 2:
				stringNascitaDay = "B";
				break;
			case 3:
				stringNascitaDay = "C";
				break;
			case 4:
				stringNascitaDay = "D";
				break;
			case 5:
				stringNascitaDay = "E";
				break;
			case 6:
				stringNascitaDay = "H";
				break;
			case 7:
				stringNascitaDay = "L";
				break;
			case 8:
				stringNascitaDay = "M";
				break;
			case 9:
				stringNascitaDay = "P";
				break;
			case 10:
				stringNascitaDay = "R";
				break;
			case 11:
				stringNascitaDay = "S";
				break;
			case 12:
				stringNascitaDay = "T";
				break;

			}
			return stringNascitaDay;
		} else {
			System.out.println("mese errato reinserire");
			return MeseNascita();
		}
	}

	public int GiornoNascita() {

		if (giornoNascita < 31 && giornoNascita > 0) {
			return giornoNascita;
		} else {
			System.out.println("reinserire il giorno");
			return GiornoNascita();
		}
	}

//	public void NomeFiscale() {
//	
//		char[] consonanti = { 'B', 'C', 'D', 'F', 'G', 'H', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'Z' };
//	char[] charArrey = nome.toCharArray();
//	List<Character> lista = new ArrayList<Character>(3);
//	for (int i = 0; i < nome.toCharArray().length; i++) {
//		 Arrays.equals(charArrey, charArrey[i], consonanti[i], consonanti, i, i);
//		 lista.add(charArrey[i]);
//		}
//	System.out.println(lista);
//	}

	public void NomeFiscale() {
		char[] consonanti = { 'B', 'C', 'D', 'F', 'G', 'H', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'Z' };
		char[] charArrey = nome.toCharArray();
		char vocali[] = { 'A', 'I', 'E', 'O', 'U' };
		if (charArrey != vocali) {
			for (int i = 0; i < consonanti.length; i++) {
				for (int j = 0; j < charArrey.length; j++) {
        if (charArrey == consonanti) {
        	charArrey = consonanti;
        }
				}
			}
		} System.out.println(consonanti);
}
}
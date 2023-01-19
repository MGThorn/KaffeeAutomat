
public class Automat {

	public int zustand;
	
	public int wasserStand;
	public int bohnenStand;
	public int milchStand;

	Automat(){
		wasserStand = 100;
		bohnenStand = 100;
		milchStand = 100;

		zustand = 0;
		
	}


	public void zustandWechseln(char eingabe) {
		switch (zustand) {
		case 0: {
			switch (eingabe) {
			case 'y': {zustand = 1;} break;
			case 'n': {zustand = 0;} break;
			}
		} break;
		case 1: {
			switch (eingabe) {
			case 'y': {zustand = 2;} break;
			case 'n': {zustand = 1;} break;
			}
		} break;
		case 2: {
			switch (eingabe) {
			case 'y': {zustand = 3;} break;
			case 'n': {zustand = 2;} break;
			}
		} break;
		case 3: {
			switch (eingabe) {
			case '1': {zustand = 4;} break;
			case '2': {zustand = 5;} break;
			case '3': {zustand = 6;} break; 
			}
		} break;
		case 4: {
			switch (eingabe) {
			case '1': {zustand = 1;} break;
			case '2': {zustand = 0;} break;
			case '3': {zustand = 7;} break;
			}
		} break;
		case 5: {
			switch (eingabe) {
			case '1': {zustand = 1;} break;
			case '2': {zustand = 0;} break; 
			case '3': {zustand = 7;} break;
			}
		} break;
		case 6: {
			switch (eingabe) {
			case '1': {zustand = 1;} break;
			case '2': {zustand = 0;} break;
			case '3': {zustand = 7;} break;
			}
		} break;
		case 7: {
			switch (eingabe) {
			case '1': {zustand = 1;} break;
			case '2': {zustand = 0;} break;
			}
		} break;
		}
	}
}

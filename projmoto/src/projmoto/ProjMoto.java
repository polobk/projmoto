package projmoto;

public class ProjMoto {
	int marcha;
	String Modelo;
	String Cor;
	String Marca;
	int maiormacha = 6;
	int menormacha = 0;
	int marchacima;
	int marchabaixo;
	int marchab;
	boolean Status;

	ProjMoto() {

	}

	void inicializamacha(int marchain) {
		marcha = marchain;

	}

	void inicializamaiormacha(int maiormachain) {
		maiormacha = maiormachain;
	}

	int marchacima() {
		if (marcha < maiormacha) {
			marcha = marcha + 1;
			// System.out.println(("marcha" +marcha));

		} else {

			System.out.println("Limite de marchas excedidas");
		}
		return marcha;
	}

	int marchabaixo() {
		if (marcha > menormacha) {
			marcha = marcha - 1;
			// System.out.println(("marcha" +marcha));
		} else {

			System.out.println("Limite minimo de marchas excedidas");
		}

		return marcha;
	}

	String status() {
		String On;
		if (marcha > 0) {
			Status = true;
			On = "Ligada";
		} else {
			Status = false;
			On = "Desligada";
		}
		return On;

	}

}

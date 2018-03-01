package br.com.streams;

public class MainApp {
	public static void main(String[] args) {
		try {
			StreamImpl stream = new StreamImpl("aeiouasaawe");
			char res = Util.findFirstChar(stream);
			System.out.println("Resultado do algoritmo: " + res);
		} catch (Exception e) {
			System.out.println("Erro durante verificação: " + e.getMessage());
		}
	}
}

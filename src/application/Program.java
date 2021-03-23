package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import service.CalculationServices;

//le uma lista de inteiro e retorna o maior
public class Program {

	public static void main(String[] args) throws Exception {


		List<Integer> lista = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\temp\\numInteiros.txt"))) {

			String line = br.readLine();

			while (line != null) {
				lista.add(Integer.parseInt(line));
				line = br.readLine();

			}

			System.out.println("Maior:  " + CalculationServices.max(lista));

		}

		catch (IOException e) {
			System.out.println("Erro:" + e.getMessage());

		}

	}
}

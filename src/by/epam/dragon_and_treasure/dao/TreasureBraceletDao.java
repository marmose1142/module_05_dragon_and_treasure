package by.epam.dragon_and_treasure.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import by.epam.dragon_and_treasure.entity.Treasure;

public class TreasureBraceletDao implements TreasuresDao {

	@Override
	public String loadFile() {
		String lines = "";
		BufferedReader reader = null;

		try {
			File treasureFile = new File("resource\\treasure.txt");
			FileReader fileReader = new FileReader(treasureFile);
			reader = new BufferedReader(fileReader);
			String line = null;
			while ((line = reader.readLine()) != null) {
				lines += line;

			}
		} catch (IOException ex) {
			ex.printStackTrace();

		} finally {

			try {
				if (reader != null)
					reader.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		return lines;
	}

	@Override
	public List<Treasure> loadTreasure(String line) {

		List<Treasure> treasures = new ArrayList<Treasure>();
		List<Treasure> bracelets = new ArrayList<Treasure>();

		String[] result = line.split(";");
		String[] result1 = new String[result.length];
		String[] result2 = new String[result.length];

		for (int i = 0; i < result.length; i++) {
			result1[i] = result[i].replaceAll("-.*", "");
		}

		for (int i = 0; i < result.length; i++) {
			result2[i] = result[i].replaceAll("[^0-9]+", "");
		}

		BigDecimal[] mass = new BigDecimal[result2.length];

		try {
			for (int i = 0; i < result2.length; i++) {
				mass[i] = new BigDecimal(result2[i]);
			}

		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException: " + nfe.getMessage());
		}

		for (int i = 0; i < result.length; i++) {
			treasures.add(new Treasure(result1[i], mass[i]));
		}

		String s = "Золотой браслет с фианитом";
		String s2 = "Золотой браслет";
		String s3 = "Золотой браслет с ониксом и фианитом";
		String s4 = "Золотой браслет с плетением бисмарк";
		String s5 = "Серебряный браслет с керамиком";
		String s6 = "Серебряный браслет";
		String s7 = "Серебряный браслет с аметистом";
		String s8 = "Серебряный браслет с фманитом";


		for (int i = 0; i < treasures.size(); i++) {
			if (treasures.get(i).getTitle().equalsIgnoreCase(s) | (treasures.get(i).getTitle().equalsIgnoreCase(s2)
					| (treasures.get(i).getTitle().equalsIgnoreCase(s3)
							| (treasures.get(i).getTitle().equalsIgnoreCase(s4)
									| (treasures.get(i).getTitle().equalsIgnoreCase(s5)
											| (treasures.get(i).getTitle().equalsIgnoreCase(s6))
											| (treasures.get(i).getTitle().equalsIgnoreCase(s7))
											| (treasures.get(i).getTitle().equalsIgnoreCase(s8))))))) {
				bracelets.add(treasures.get(i));
			}
		}
		return bracelets;
	}
}

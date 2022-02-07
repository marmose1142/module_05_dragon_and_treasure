package by.epam.dragon_and_treasure.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import by.epam.dragon_and_treasure.entity.Treasure;

public class TreasureRingDao implements TreasuresDao {

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
		List<Treasure> rings = new ArrayList<Treasure>();

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

		String s = "Золотое кольцо";
		String s2 = "Серебряное кольцо";
		String s3 = "Серебряное кольцо с фианитом";
		String s4 = "Золотое кольцо с фианитом";


		for (int i = 0; i < treasures.size(); i++) {
			if (treasures.get(i).getTitle().equalsIgnoreCase(s) | (treasures.get(i).getTitle().equalsIgnoreCase(s2)
					| (treasures.get(i).getTitle().equalsIgnoreCase(s3)
							| (treasures.get(i).getTitle().equalsIgnoreCase(s4))))) {
				rings.add(treasures.get(i));
			}
		}
		return rings;
	}
}
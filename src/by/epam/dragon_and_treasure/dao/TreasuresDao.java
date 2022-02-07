package by.epam.dragon_and_treasure.dao;

import java.util.List;

import by.epam.dragon_and_treasure.entity.Treasure;

public interface TreasuresDao {

	public abstract String loadFile();

	public abstract List<Treasure> loadTreasure(String line);

}

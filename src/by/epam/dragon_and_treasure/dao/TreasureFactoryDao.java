package by.epam.dragon_and_treasure.dao;

public class TreasureFactoryDao {

	public TreasuresDao getTreasure(TreasurTypesDao type) {
		TreasuresDao toReturn = null;
		switch (type) {
		case RING:
			toReturn = new TreasureRingDao();
			break;
		case EARRING:
			toReturn = new TreasureEarringDao();
			break;
		case CHAIN:
			toReturn = new TreasureChainDao();
			break;
		case BRACELET:
			toReturn = new TreasureBraceletDao();
			break;
		case ALL:
			toReturn = new TreasureAllDao();
			break;
		default:
			throw new IllegalArgumentException("Wrong treasure type:" + type);
		}
		return toReturn;
	}
}

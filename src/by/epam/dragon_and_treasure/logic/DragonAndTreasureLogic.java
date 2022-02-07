package by.epam.dragon_and_treasure.logic;

import by.epam.dragon_and_treasure.dao.*;
import by.epam.dragon_and_treasure.entity.Cave;
import by.epam.dragon_and_treasure.entity.Treasure;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class DragonAndTreasureLogic {
	
	public void expensiveTreasure() {

		TreasureFactoryDao factory = new TreasureFactoryDao();

		TreasuresDao all = factory.getTreasure(TreasurTypesDao.ALL);
		String line = all.loadFile();

		List<Treasure> alltrasure = all.loadTreasure(line);

		System.out.println();
		System.out.println("Самое дорогое сокровище: ");
		System.out.println(Collections.max(alltrasure));

	}

	public List<Treasure> treasureRing() {
		
		TreasureFactoryDao factory = new TreasureFactoryDao();

		TreasuresDao ring = factory.getTreasure(TreasurTypesDao.RING);
		String line = ring.loadFile();

		List<Treasure> ringTreasure = ring.loadTreasure(line);

		return ringTreasure;
	}

	public List<Treasure> treasureEarring() {
		
		TreasureFactoryDao factory = new TreasureFactoryDao();

		TreasuresDao earring = factory.getTreasure(TreasurTypesDao.EARRING);
		String line = earring.loadFile();

		List<Treasure> earringTreasure = earring.loadTreasure(line);

		return earringTreasure;
	}

	public List<Treasure> treasureChain() {
		
		TreasureFactoryDao factory = new TreasureFactoryDao();

		TreasuresDao chain = factory.getTreasure(TreasurTypesDao.CHAIN);
		String line = chain.loadFile();

		List<Treasure> chainTreasure = chain.loadTreasure(line);

		return chainTreasure;
	}

	public List<Treasure> treasureBracelet() {
		
		TreasureFactoryDao factory = new TreasureFactoryDao();

		TreasuresDao bracelet = factory.getTreasure(TreasurTypesDao.BRACELET);
		String line = bracelet.loadFile();

		List<Treasure> braceletTreasure = bracelet.loadTreasure(line);

		return braceletTreasure;
	}

	public void checkPrice(Cave c, BigDecimal p) {

		System.out.println();
		System.out.println("Сокровище по заданной цене :");


		for (int i = 0; i < c.getTreasures().size(); i++) {
			if (p.equals(c.getTreasures().get(i).getPrice())) {

				System.out.println(c.getTreasures().get(i));
			}
		}
	}
}

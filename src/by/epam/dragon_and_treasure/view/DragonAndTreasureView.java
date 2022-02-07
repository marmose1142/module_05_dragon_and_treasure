package by.epam.dragon_and_treasure.view;

import by.epam.dragon_and_treasure.entity.*;

public class DragonAndTreasureView {

	public void printTreasure(Cave c) {

		System.out.println("Список сокровищ в пещере: ");
		for (int i = 0; i < c.getTreasures().size(); i++) {
			System.out.println(c.getTreasures().get(i));
		}
	}

	public void printDragon(Cave c) {

		System.out.println();
		System.out.println("Дракона зовут- " + c.getDragon().getName() + ", цвет-" + c.getDragon().getColour()
				+ ", уровень нападения- " + c.getDragon().getLevel());
	}

}

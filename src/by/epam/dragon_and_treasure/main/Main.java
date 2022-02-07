package by.epam.dragon_and_treasure.main;

import java.math.BigDecimal;
import java.util.List;

import by.epam.dragon_and_treasure.entity.*;
import by.epam.dragon_and_treasure.logic.*;
import by.epam.dragon_and_treasure.view.*;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
 * -Приложение должно быть объектно-, а не процедурно-ориентированным;
 * -Каждый класс должен иметь отражающий смысл название и информативный состав;
 * -Наследование должно приментяься только тогда, когда это имеет смысл;
 * -При кодировании должны быть использованы соглашения об оформлении кода java code convention;
 * -Классы должны быть грамотно разложены по пакетам;
 * -Консольное меню должно быть минимальным;
 * -Для хранения данных можно использовать файлы;
 * 
 * Дракон и его сокровища. Создать программу позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ, Выбора самого дорого по стоимости сокровища и выбора сокровищ на заданную
 * сумму.
 */

public class Main {

	public static void main(String[] args) {
		BigDecimal givenPrice = new BigDecimal(550);

		DragonAndTreasureLogic logic = new DragonAndTreasureLogic();
		Cave cave = new Cave();
		DragonAndTreasureView view = new DragonAndTreasureView();

		List<Treasure> ring = logic.treasureRing();
		List<Treasure> earring = logic.treasureEarring();
		List<Treasure> chain = logic.treasureChain();
		List<Treasure> bracelet = logic.treasureBracelet();

		cave.addTreasure(ring);
		cave.addTreasure(earring);
		cave.addTreasure(chain);
		cave.addTreasure(bracelet);

		view.printTreasure(cave);
		view.printDragon(cave);
		
		cave.getDragon().protect();
		
		logic.expensiveTreasure();
		logic.checkPrice(cave, givenPrice);

	}
}

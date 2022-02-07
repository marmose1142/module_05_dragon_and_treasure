package by.epam.dragon_and_treasure.entity;

import java.io.Serializable;

public class Dragon implements DragonSkill, Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String colour;
	private int level;

	public Dragon(String name, String colour, int level) {
		super();
		this.name = name;
		this.colour = colour;
		this.level = level;
	}

	public Dragon() {

	}

	@Override
	public void protect() {
		System.out.println("Дракон защищает сокровища");

	}

	@Override
	public void attack() {
		System.out.println("Дракон нападает: рычит, бъется,царапает когтями!");

	}

	@Override
	public void burn() {
		System.out.println("Дракон выпускает огонь!");

	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + level;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dragon other = (Dragon) obj;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (level != other.level)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dragon [name=" + name + ", colour=" + colour + ", level=" + level + "]";
	}

}

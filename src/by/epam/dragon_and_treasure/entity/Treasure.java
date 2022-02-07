package by.epam.dragon_and_treasure.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Treasure implements Serializable, Comparable<Treasure> {

	private static final long serialVersionUID = 1L;
	private String title;
	private BigDecimal price;

	public Treasure(String title, BigDecimal price) {
		super();
		this.title = title;
		this.price = price;
	}

	public Treasure() {
		super();

	}

	@Override
	public int compareTo(Treasure o) {

		return price.compareTo(o.getPrice());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Treasure other = (Treasure) obj;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Treasure [title=" + title + ", price=" + price + "]";
	}

}

import java.math.BigDecimal;

public class FoodItem
{
	String name;
	String description;
	FoodCategoryLinkedList<Size> size;
	String servingSize; // serving size i.e. 1case contains 12 items
	BigDecimal price;
	int quantity; // Stocks
	FoodCategoryLinkedList<String> specialOrder;

	public FoodItem(String name, BigDecimal price, int quantity,
			String description, FoodCategoryLinkedList<Size> size,
			String servingSize, FoodCategoryLinkedList<String> specialOrder)
	{
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.size = size;
		this.servingSize = servingSize;
		this.specialOrder = specialOrder;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public FoodCategoryLinkedList<Size> getSize()
	{
		return size;
	}

	public void setSize(FoodCategoryLinkedList<Size> size)
	{
		this.size = size;
	}

	public String getServingSize()
	{
		return servingSize;
	}

	public void setServingSize(String servingSize)
	{
		this.servingSize = servingSize;
	}

	public FoodCategoryLinkedList<String> getSpecialOrder()
	{
		return specialOrder;
	}

	public void setSpecialOrder(FoodCategoryLinkedList<String> specialOrder)
	{
		this.specialOrder = specialOrder;
	}

	public String toString()
	{
		return "FoodItem [name=" + name + ", description=" + description
				+ ", size=" + size + ", servingSize=" + servingSize + ", price="
				+ price + ", quantity=" + quantity + ", specialOrder="
				+ specialOrder + "]";
	}

}

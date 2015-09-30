
public class FoodItemNode<E>
{
	private E value;
	private FoodItemNode<E> link;

	public FoodItemNode(E value)
	{
		this.value = value;
		this.link = null;
	}

	public E getValue()
	{
		return value;
	}

	public void setValue(E value)
	{
		this.value = value;
	}

	public FoodItemNode<E> getLink()
	{
		return link;
	}

	public void setLink(FoodItemNode<E> link)
	{
		this.link = link;
	}

}

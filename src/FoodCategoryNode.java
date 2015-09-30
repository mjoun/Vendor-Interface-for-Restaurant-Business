
public class FoodCategoryNode<E>
{
	private E value;
	private FoodCategoryNode<E> link;

	public FoodCategoryNode(E value)
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

	public FoodCategoryNode<E> getLink()
	{
		return link;
	}

	public void setLink(FoodCategoryNode<E> link)
	{
		this.link = link;
	}

}

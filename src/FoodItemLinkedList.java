public class FoodItemLinkedList<E>
{
	FoodCategoryNode<E> head, tail, previous, current;
	int numElement;

	public FoodItemLinkedList()
	{
		head = null;
		tail = null;
		numElement = 0;
	}

	public void insert(E element)
	{
		FoodCategoryNode<E> newNode = new FoodCategoryNode<E>(element);
		if (head == null)
		{
			head = newNode;
		} else
		{
			tail.setLink(newNode);
		}
		tail = newNode;
		numElement++;
	}


	public E remove(E element)
	{
		E item = null;
		if (find(element))
		{
			if (current == head)
			{
				head = current.getLink();
			} else
			{
				previous.setLink(current.getLink());
			}
		}
		return item;
	}


	public boolean find(E element)
	{
		boolean status = false;
		current = head;
		previous = head;
		while (current != null)
		{
			if (current.getValue().equals(element))
			{
				status = true;
				return status;
			}
			previous = current;
			current = current.getLink();
		}
		return status;
	}

	public String toString()
	{
		String list = "";
		current = head;
		while (current != null)
		{
			list += current.getValue() + " ";
			current = current.getLink();
		}
		return list;
	}
}

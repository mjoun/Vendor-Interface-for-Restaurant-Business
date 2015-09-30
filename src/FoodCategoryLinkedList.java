public class FoodCategoryLinkedList<E>
{
	FoodCategoryNode<E> head, tail, previous, current;
	int numberOfElement;

	public FoodCategoryLinkedList()
	{
		head = null;
		tail = null;
		numberOfElement = 0;
	}

	public void add(E element)
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
		numberOfElement++;
	}


	public E delete(E element)
	{
		E item = null;
		if (search(element))
		{
			if (current == head)
			{
				// remove head
				head = current.getLink();
			} else
			{
				// remove in between and tail
				previous.setLink(current.getLink());
			}
		}
		return item;
	}


	public boolean search(E element)
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

	public boolean isEmpty(E element)
	{
		if (element == null)
		{
			return true;
		}
		return false;
	}
}

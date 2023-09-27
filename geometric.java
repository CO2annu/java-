 class geometric extends Progression
{
	protected long base;
	geometric()
	{
		this(2);
	}
	geometric(long b)
	{
		base = b;
		first = 1;
		cur = first;
	}
	protected long nextValue()
	{
		cur = cur * base;
		return cur;
	}
}
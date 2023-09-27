 class Arithmetic extends Progression
{
	protected long inc;
	Arithmetic()
	{
		this(1);
	}
	Arithmetic(long increment)
	{
		inc = increment;
	}
	protected long nextValue()
	{
		cur = cur + inc;
		return cur;
	}
}
public class Singer
{
	private	String name;
	private	int id;
	static int counter=0;
	static Singer[] singerArray = new Singer[10];
	public Singer(String name)
	{
		this.name = name;
		singerArray[counter]=this;
		id=counter++;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name2)
	{
		this.name = name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id2)
	{
		this.id = id;
	}
	public String toString()
	{
		return "Singer [name=" + name + ", id=" + id + "]";
	}
}
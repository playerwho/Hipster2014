package ctec.hipster.model;

/**
 * Hipster object for 2014 Hipster project
 * @author Austin Widmeier
 * @version 1.1 11/13/14
 */
public class Hipster
{
	private String name;
	private int age;
	private String [] hipsterAlbums;
	
	/**
	 * defines what the hipster cant be
	 */
	public Hipster()
	{
		name = "";
		age = -99;
		hipsterAlbums = null;
	}
	
	/**
	 * builds hipster
	 * @param name is name
	 * @param age is age
	 */
	public Hipster(String name, int age)
	{
		this.name = name;
		this.age = age;
		hipsterAlbums = null;
	}

	/**
	 * sets many variables
	 * @return the variables
	 */
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public String[] getHipsterAlbums()
	{
		return hipsterAlbums;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setHipsterAlbums(String[] hipsterAlbums)
	{
		this.hipsterAlbums = hipsterAlbums;
	}
}

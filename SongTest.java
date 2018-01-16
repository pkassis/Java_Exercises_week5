import java.util.Scanner;
public class SongTest
{
	public static void main(String[] args)
	{
	boolean a=true;
	Singer frank = new Singer ("Frank Sinatra");
	Singer wham = new Singer ("Wham!");
	Singer mariah = new Singer ("Mariah Carey");
	Singer chris = new Singer ("Chris Rea");
	Singer sia = new Singer ("Sia");
	Song song1 = new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY");
	Song song2 = new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA");
	Song song3 = new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI");
	Song song4 = new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
	Song song5 = new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU");
	Song song6 = new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU");
	Scanner scanner= new Scanner(System.in);
	while (a==true)
	{
	System.out.println("***************** Welcome to our DMST Christmas Music Application***************");
	System.out.println("Menu");
	System.out.println("Type 1 to display singers' list");
	System.out.println("Type 2 to display Frank's Sinatra available songs");
	System.out.print("	Type here: ");
	int number= scanner.nextInt();
	System.out.println(" ");
	if (number==1)
	{
		System.out.println("	** Display Singers' List **");
		int i=0;
		while ((i<10)&&(Singer.singerArray[i]!=null))
		{
				System.out.println("- "+Singer.singerArray[i].toString());
				i++;
		}
		System.out.println("********************************************************************************************");
		System.out.println(" ");
		System.out.println(" ");
	}
	if (number==2)
	{
		int counterFrank=0;
		System.out.println("	** Display Frank's Sinatra Song List **");
		for (int i=0; i<Song.songArray.length; i++)
		{
			if ((Song.songArray[i]!=null)&&(Song.songArray[i].getSinger()==frank))
			{
				counterFrank++;;
			}
		}
		System.out.println(counterFrank+" songs were found:");
		for (int i=0; i<Song.songArray.length; i++)
		{
			if ((Song.songArray[i]!=null)&&(Song.songArray[i].getSinger()==frank))
			{
				System.out.println("Title: "+Song.songArray[i].getTitle()+", url to listen: "+Song.songArray[i].getUrl());
			}
		}
		System.out.println("********************************************************************************************");
		System.out.println(" ");
		System.out.println(" ");
	}
	if ((number!=1)&&(number!=2))
	{
		System.out.println("Wrong number. Please try again");
		System.out.println(" ");
		System.out.println(" ");
	}
	}
	}
}
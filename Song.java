public class Song
{
	private	String title;
	private	String url;
	private Singer singer;
	static int countSongs=0;
	static Song[] songArray= new Song[10];
	public Song(String title, Singer singer, String url)
	{
		this.title = title;
		this.url = url;
		this.singer =singer;
		songArray[countSongs]=this;
		countSongs++;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getUrl()
	{
		return url;
	}
	public void setUrl(String url)
	{
		this.url = url;
	}
	public Singer getSinger()
	{
		return singer;
	}
	public void setSinger(Singer singer)
	{
		this.singer = singer;
	}
	public String toString() {
		return "Song [title=" + title + ", url=" + url + ", singer=" + singer + "]";
	}
}

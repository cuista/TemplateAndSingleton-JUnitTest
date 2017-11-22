package template;

public abstract class AudioPlayer
{
	private static AudioPlayer vlcInstance;
	private static AudioPlayer grooveInstance;

	protected AudioPlayer()
	{
	}

	public static AudioPlayer getVlc()
	{
		return vlcInstance == null ? vlcInstance = new VLC() : vlcInstance;
	}

	public static AudioPlayer getGroove()
	{
		return grooveInstance == null ? grooveInstance = new Groove() : grooveInstance;
	}

	protected PlayerType playerType;

	// primitive methods
	abstract void setPlayer();
	abstract void open();

	// template method
	public void play()
	{
		setPlayer();
		open();
	}

	public PlayerType getPlayerType()
	{
		return playerType;
	}
}

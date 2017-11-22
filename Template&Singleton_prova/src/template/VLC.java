package template;

import java.io.IOException;

public class VLC extends AudioPlayer
{

	@Override
	void setPlayer()
	{
		playerType=PlayerType.VLC;
	}

	@Override
	void open()
	{
		ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\VideoLAN\\VLC\\vlc.exe", "file to start with vlc");
		try
		{
			pb.start();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

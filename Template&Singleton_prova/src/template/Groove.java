package template;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Groove extends AudioPlayer
{

	@Override
	void setPlayer()
	{
		playerType = PlayerType.GROOVE;
	}

	@Override
	void open()
	{
			try
			{
				Desktop.getDesktop().open(new File("music/sleepingPowder.mp3"));
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}

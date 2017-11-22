package template.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import template.AudioPlayer;

public class TimingTemplateTest
{
	private static AudioPlayer audioPlayer;
	
	@Before
	public void eachTestInit()
	{
		audioPlayer=AudioPlayer.getVlc();
	}
	
	@After
	public void putNull()
	{
		audioPlayer=null;
	}

	@Test(timeout = 2000)
	public void test()
	{
		audioPlayer.getPlayerType();
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

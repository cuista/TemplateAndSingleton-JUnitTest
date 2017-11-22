package template.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import template.AudioPlayer;
import template.PlayerType;

public class TemplateBasicTest
{
	
	private static AudioPlayer audioPlayerVlc;
	private static AudioPlayer audioPlayerGroove;
	private static AudioPlayer audioPlayer;

	@BeforeClass
	public static void init()
	{
		audioPlayerVlc=AudioPlayer.getVlc();
		audioPlayerGroove=AudioPlayer.getGroove();
	}
	
	@Test
	public void playerTypeTest()
	{
		audioPlayerVlc.play();
		audioPlayerGroove.play();
		Assert.assertEquals(PlayerType.VLC, audioPlayerVlc.getPlayerType());
		Assert.assertEquals(PlayerType.GROOVE, audioPlayerGroove.getPlayerType());
	}
	
	@Test(expected = NullPointerException.class)
	public void exceptionNullInstanceTest()
	{
		audioPlayer.getPlayerType();
	}

}

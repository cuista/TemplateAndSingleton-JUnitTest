package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import template.AudioPlayer;

public class Frame extends JFrame
{
	JFrame frame;
	JPanel panel;
	JPanel buttonPanel;
	JButton vlcButton;
	JButton grooveButton;
	JLabel label;

	public Frame()
	{
		frame = new JFrame("AudioPlayer");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) (((dimension.getWidth() - frame.getWidth()) / 2) - 200);
		int y = (int) (((dimension.getHeight() - frame.getHeight()) / 2) - 200);
		frame.setLocation(x, y);
		
		init();
	}

	private void init()
	{
		panel = new JPanel();
		label = new JLabel(new ImageIcon("music/sleepingPowder.gif"));
		vlcButton=new JButton("Vlc");
		grooveButton=new JButton("Groove");
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.BLACK);
		buttonPanel.add(vlcButton);
		buttonPanel.add(grooveButton);
		panel.setBackground(Color.BLACK);
		panel.setLayout(new BorderLayout());
		panel.add(buttonPanel, BorderLayout.NORTH);
		panel.add(label, BorderLayout.CENTER);
		frame.add(panel);
		frame.pack();
		
		vlcButton.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				AudioPlayer.getVlc().play();
			}
		});
		
		grooveButton.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				AudioPlayer.getGroove().play();
			}
		});

	}

	public static void main(String[] args)
	{
		Frame frame = new Frame();
	}

}

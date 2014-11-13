package ctec.hipster.view;

import java.awt.Color;

import javax.swing.*;

import ctec.hipster.controller.HipsterAppController;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel albumLabel;
	private JLabel hipsterImage;
	private SpringLayout baseLayout;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		albumLabel = new JLabel("album info here");
		hipsterImage = new JLabel("something cool lookin", new ImageIcon(HipsterPanel.class.getResource("/ctec/hipster/view/images/cam.jpg")), JLabel.CENTER);
		hipsterImage.setVerticalAlignment(SwingConstants.BOTTOM);
		albumBox = new JComboBox();
		
		
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.setSize(1000,300);
		this.setLayout(baseLayout);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, hipsterImage, 237, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, hipsterImage, -88, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, albumBox, 99, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, albumBox, 92, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, albumLabel, 3, SpringLayout.NORTH, albumBox);
		baseLayout.putConstraint(SpringLayout.WEST, albumLabel, 340, SpringLayout.EAST, albumBox);
	}
	
	private void setupListeners()
	{
		
	}

}

package ctec.hipster.view;

import javax.swing.JFrame;

import ctec.hipster.controller.HipsterAppController;

public class HipsterFrame extends JFrame
{
	private HipsterPanel basePanel;
	
	/**
	 * ties frame, appcontroller, and base controller together
	 * @param baseController
	 */
	public HipsterFrame(HipsterAppController baseController)
	{
		this.basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * sets up a frame for a window
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000, 400);
		this.setResizable(false);
		this.setVisible(true);
	}
}

package ctec.hipster.controller;

import ctec.hipster.model.Hipster;
import ctec.hipster.view.HipsterFrame;

/**
 *  HipsterAppController for the 2014 Hipster day project
 * @author CodyH
 * @version 1.5 11/12/14
 */
public class HipsterAppController
{
	private HipsterFrame baseFrame;
	private Hipster selfHipster;
	private String [] myAlbums;
	
	/**
	 * builds the array, and frame
	 */
	public HipsterAppController()
	{
		selfHipster = new Hipster("John", 69);
		buildAlbumArray();
		baseFrame = new HipsterFrame(this);
	}
	
	/**
	 * starts the project
	 */
	public void start()
	{}
	
	/**
	 * get the selfHipster values
	 * @return selfhiptser
	 */
	public Hipster getSelfHipster()
	{
		return selfHipster;
	}
	
	/**
	 * different ways of making an array, all work.
	 */
	private void buildAlbumArray()
	{
		myAlbums = new String[4];
		myAlbums[0] = "Hello Nasty";
		myAlbums[1] = "Modest Mouse";
		myAlbums[2] = "something";
		myAlbums[3] = "Big Willie Style";
		selfHipster.setHipsterAlbums(myAlbums);
		
		// hipster
		String [] otherAlbums = {"stuff", "other", "sop sign", "hipster array"};
		
		// ultrahipster
		String [] weirdAlbums;
		weirdAlbums = new String [] {"ewefc", "aasas", "dsda", "dsd"};
	}
}

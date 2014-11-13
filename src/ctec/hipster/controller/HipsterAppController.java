package ctec.hipster.controller;

import ctec.hipster.model.Hipster;
import ctec.hipster.view.HipsterFrame;
/**
 *  HipsterAppController for the 2014 Hipster day project
 * @author CodyH
 * @version 1.0 11/12/14 Basic framework only
 */
public class HipsterAppController
{
	private HipsterFrame baseFrame;
	private Hipster selfHipster;
	private String [] myAlbums;
	
	public HipsterAppController()
	{
		selfHipster = new Hipster("John", 69);
		buildAlbumArray();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		selfHipster.setHipsterAlbums(myAlbums);
	}
	
	private void buildAlbumArray()
	{
		myAlbums = new String[4];
		myAlbums[0] = "Hello Nasty";
		myAlbums[1] = "Modest Mouse";
		myAlbums[2] = "fhfhdhd";
		myAlbums[3] = "fsdapo wowbfw";
		
		// hipster
		String [] otherAlbums = {"stuff", "other", "sop sign", "hipster array"};
		
		// ultrahipster
		String [] weirdAlbums;
		weirdAlbums = new String [] {"ewefc", "aasas", "dsda", "dsd"};
	}
}

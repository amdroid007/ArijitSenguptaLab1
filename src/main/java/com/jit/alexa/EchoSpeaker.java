/**
 * 
 */
package com.jit.alexa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author coblab
 *
 */
public class EchoSpeaker implements GenericComponent {
	private String model;
	private Speaker mySpeaker;
	private Microphone myMicrophone;
	private User myUser;
	private AmazonCloud myCloud;
	
	public EchoSpeaker() {
		mySpeaker = new Speaker();
		myMicrophone = new Microphone();
		myUser = new User();
		myCloud = new AmazonCloud();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Amazon Alexa Gen 1";
	}
	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, mySpeaker, myMicrophone, myUser, myCloud); // add all your sub components
		return internalComponents;	}

}

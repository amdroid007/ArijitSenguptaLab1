/**
 * 
 */
package com.jit.alexa;

import edu.fiu.jit.SelfCheckCapable;

/**
 * This is my microphone class
 * 
 * @author coblab
 *
 */
public class Microphone extends AudioComponent 
		implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Microphone array";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

}

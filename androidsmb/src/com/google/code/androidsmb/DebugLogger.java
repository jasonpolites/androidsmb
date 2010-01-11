/**
 * 
 */
package com.google.code.androidsmb;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

import org.alfresco.config.ConfigElement;
import org.alfresco.jlan.debug.DebugInterface;

/**
 * @author Patrick
 *
 */
public class DebugLogger extends Handler implements DebugInterface {

	/**
	 * 
	 */
	public DebugLogger() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.util.logging.Handler#close()
	 */
	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.util.logging.Handler#flush()
	 */
	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.util.logging.Handler#publish(java.util.logging.LogRecord)
	 */
	@Override
	public void publish(LogRecord record) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.alfresco.jlan.debug.DebugInterface#debugPrint(java.lang.String)
	 */
	public void debugPrint(String str) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.alfresco.jlan.debug.DebugInterface#debugPrintln(java.lang.String)
	 */
	public void debugPrintln(String str) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.alfresco.jlan.debug.DebugInterface#initialize(org.alfresco.config.ConfigElement)
	 */
	public void initialize(ConfigElement params) throws Exception {
		// TODO Auto-generated method stub

	}

}

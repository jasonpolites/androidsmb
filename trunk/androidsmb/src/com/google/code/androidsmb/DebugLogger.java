/**
 * 
 */
package com.google.code.androidsmb;

import java.util.LinkedList;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import org.alfresco.config.ConfigElement;
import org.alfresco.jlan.debug.DebugInterface;

import android.content.ContextWrapper;
import android.util.Log;

/**
 * @author Patrick
 *
 */
public class DebugLogger extends Handler implements DebugInterface {

	private String tag;
	private LinkedList<MessageListener> listeners;

	/**
	 * 
	 */
	public DebugLogger(String tag) {
		this.tag = tag;
		this.listeners = new LinkedList<MessageListener>();
		this.setLevel(Level.ALL);
	}

	/* (non-Javadoc)
	 * @see java.util.logging.Handler#close()
	 */
	@Override
	public void close() {
		
	}

	public void attach(MessageListener listener){
		listeners.add(listener);
	}
	
	public MessageListener dettach(MessageListener listener){
		listeners.remove(listener);
		return listener;
	}
	
	/* (non-Javadoc)
	 * @see java.util.logging.Handler#flush()
	 */
	@Override
	public void flush() {

	}

	/* (non-Javadoc)
	 * @see java.util.logging.Handler#publish(java.util.logging.LogRecord)
	 */
	@Override
	public void publish(LogRecord record) {
		// TODO Auto-generated method stub
		String msg = record.getMessage();
		this.print(msg);
	}

	private void print(String msg){
		Log.d(this.tag, msg);
		for(MessageListener listener : this.listeners){
			listener.message(msg);
		}
	}
	
	
	/* (non-Javadoc)
	 * @see org.alfresco.jlan.debug.DebugInterface#debugPrint(java.lang.String)
	 */
	public void debugPrint(String msg) {
		this.print(msg);
	}

	/* (non-Javadoc)
	 * @see org.alfresco.jlan.debug.DebugInterface#debugPrintln(java.lang.String)
	 */
	public void debugPrintln(String msg) {
		this.print(msg);
	}

	/* (non-Javadoc)
	 * @see org.alfresco.jlan.debug.DebugInterface#initialize(org.alfresco.config.ConfigElement)
	 */
	public void initialize(ConfigElement params) throws Exception {
		
	}

}

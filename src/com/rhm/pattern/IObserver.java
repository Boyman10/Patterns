package com.rhm.pattern;

/**
 * Rewriting Observer to match ODialog instead of using Observable concrete Object and rewriting an interface
 * @author John
 * @version 1.0.1
 */
public interface IObserver {
	public void update(Object arg1);
}

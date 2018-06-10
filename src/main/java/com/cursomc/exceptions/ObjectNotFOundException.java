package com.cursomc.exceptions;

public class ObjectNotFOundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ObjectNotFOundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFOundException(String msg, Throwable cause) {
		super(msg,cause);
	}
}

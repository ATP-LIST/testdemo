package com.gjy.struts2.interfaceAction;

public interface Action {
	public static String SUCCESS = "suc";
	public static String ERROR = "error";

	public String execute() throws Exception;
}

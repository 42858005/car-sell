package com.swj.carsell.model;

import java.io.Serializable;

/**
 * 消息对象
 * 
 * @author fiver
 *
 */
public class AjaxObj implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4806448810229890854L;

	private int code;
	private String msg;
	private Object data;
	private String flag;

	public AjaxObj() {

	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public AjaxObj(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public AjaxObj(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public AjaxObj(int code, String msg, Object data, String flag) {
		this.code = code;
		this.msg = msg;
		this.data = data;
		this.flag = flag;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
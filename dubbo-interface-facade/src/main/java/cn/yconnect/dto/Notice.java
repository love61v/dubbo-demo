package cn.yconnect.dto;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String name;

	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}

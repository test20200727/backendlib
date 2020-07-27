package com.neusoft.oa.hr.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;
//部门的model类
@Alias("Department")
public class DepartmentModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private int no=0;
	private String code=null;
	private String name=null;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

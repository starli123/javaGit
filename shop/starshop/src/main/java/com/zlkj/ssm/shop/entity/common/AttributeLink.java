package com.zlkj.ssm.shop.entity.common;import java.io.Serializable;import com.zlkj.ssm.shop.core.page.QueryModel;/** * 属性产品中间类 */public class AttributeLink extends QueryModel implements Serializable {	private static final long serialVersionUID = 1L;	private String id;	private int attrID;	private int productID;	private String value;//此值用于该属性为参数的情况	public void clear() {		super.clear();		id = null;		attrID = 0;		productID = 0;		value = null;	}	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public int getAttrID() {		return attrID;	}	public void setAttrID(int attrID) {		this.attrID = attrID;	}	public int getProductID() {		return productID;	}	public void setProductID(int productID) {		this.productID = productID;	}	public String getValue() {		return value;	}	public void setValue(String value) {		this.value = value;	}}
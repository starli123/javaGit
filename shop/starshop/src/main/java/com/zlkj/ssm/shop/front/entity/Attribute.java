package com.zlkj.ssm.shop.front.entity;import java.io.Serializable;import java.util.LinkedList;import java.util.List;/** * 商品属性、参数类 */public class Attribute extends com.zlkj.ssm.shop.entity.common.Attribute implements		Serializable {	private static final long serialVersionUID = 1L;	private List<Attribute> attrList = new LinkedList<Attribute>();// 子属性集合	public void clear() {		super.clear();		if (attrList != null) {			attrList.clear();			attrList = null;		}	}	public List<Attribute> getAttrList() {		return attrList;	}	public void setAttrList(List<Attribute> attrList) {		this.attrList = attrList;	}}
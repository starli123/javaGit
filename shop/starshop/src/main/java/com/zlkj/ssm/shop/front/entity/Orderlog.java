package com.zlkj.ssm.shop.front.entity;import java.io.Serializable;public class Orderlog extends com.zlkj.ssm.shop.entity.common.Orderlog implements Serializable {	private static final long serialVersionUID = 1L;	public Orderlog() {		super();	}	public Orderlog(String orderid) {		super(orderid);	}	public void clear() {		super.clear();	}}
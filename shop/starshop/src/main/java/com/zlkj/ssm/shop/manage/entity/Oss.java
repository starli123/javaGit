package com.zlkj.ssm.shop.manage.entity;import java.io.Serializable;/** * 云存储对象 */public class Oss extends com.zlkj.ssm.shop.entity.common.Oss implements Serializable {	private static final long serialVersionUID = 1L;	public static final String oss_status_y = "y";//启用	public static final String oss_status_n = "n";//禁用		private AliyunOSS aliyunOSS;//阿里云存储配置对象		public static final String code_aliyun = "aliyun";	public void clear() {		super.clear();		if(aliyunOSS!=null){			aliyunOSS.clear();			aliyunOSS = null;		}	}	public AliyunOSS getAliyunOSS() {		return aliyunOSS;	}	public void setAliyunOSS(AliyunOSS aliyunOSS) {		this.aliyunOSS = aliyunOSS;	}}
package com.zlkj.ssm.shop.manage.service;import com.zlkj.ssm.shop.core.Services;import com.zlkj.ssm.shop.manage.entity.EmailNotifyProduct;public interface AdminEmailNotifyProductService extends Services<EmailNotifyProduct> {	/**	 * 系统自动发送到货通知	 */	void autoNotify();}
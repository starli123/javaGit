package com.zlkj.ssm.shop.manage.service.impl;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;import com.zlkj.ssm.shop.core.ServersManager;import com.zlkj.ssm.shop.manage.dao.AdminOrderpayDao;import com.zlkj.ssm.shop.manage.entity.Orderpay;import com.zlkj.ssm.shop.manage.service.AdminOrderpayService;import javax.annotation.Resource;@Transactional@Servicepublic class AdminOrderpayServiceImpl extends ServersManager<Orderpay, AdminOrderpayDao> implements		AdminOrderpayService {    @Resource    @Override    public void setDao(AdminOrderpayDao orderpayDao) {        this.dao = orderpayDao;    }}
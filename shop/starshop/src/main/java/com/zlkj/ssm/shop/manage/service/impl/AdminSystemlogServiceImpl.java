package com.zlkj.ssm.shop.manage.service.impl;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;import com.zlkj.ssm.shop.core.ServersManager;import com.zlkj.ssm.shop.manage.dao.AdminSystemlogDao;import com.zlkj.ssm.shop.manage.entity.Systemlog;import com.zlkj.ssm.shop.manage.service.AdminSystemlogService;import javax.annotation.Resource;@Transactional@Servicepublic class AdminSystemlogServiceImpl extends ServersManager<Systemlog, AdminSystemlogDao> implements		AdminSystemlogService {    @Override    @Resource    public void setDao(AdminSystemlogDao systemlogDao) {        this.dao = systemlogDao;    }    @Override	public Systemlog selectFirstOne(String account) {		return dao.selectFirstOne(account);	}}
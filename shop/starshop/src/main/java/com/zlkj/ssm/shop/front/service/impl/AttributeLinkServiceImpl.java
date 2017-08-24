package com.zlkj.ssm.shop.front.service.impl;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;import com.zlkj.ssm.shop.core.ServersManager;import com.zlkj.ssm.shop.front.dao.AttributeLinkDao;import com.zlkj.ssm.shop.front.entity.AttributeLink;import com.zlkj.ssm.shop.front.service.Attribute_linkService;import javax.annotation.Resource;@Transactional@Servicepublic class AttributeLinkServiceImpl extends ServersManager<AttributeLink, AttributeLinkDao>implements Attribute_linkService {    @Resource    @Override    public void setDao(AttributeLinkDao attribute_linkDao) {        this.dao = attribute_linkDao;    }    @Override	public int deleteByCondition(AttributeLink e) {		return dao.deleteByCondition(e);	}}
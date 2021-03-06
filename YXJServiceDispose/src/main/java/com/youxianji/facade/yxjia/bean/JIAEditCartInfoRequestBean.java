package com.youxianji.facade.yxjia.bean;

import base.cn.annotation.InterfaceParam;
import base.cn.web.facade.bean.BaseRequest;

@InterfaceParam(command="8002",comment="编辑购物车BEAN")
public class JIAEditCartInfoRequestBean extends BaseRequest{
	private String configflag;//	String	设置 标识	1.添加2.修改 3.删除 4.全部删除
	private String prodid;//	String	商品ID	
	private String quantity;//String	购买数量	
	
	public String getConfigflag() {
		return configflag;
	}
	public void setConfigflag(String configflag) {
		this.configflag = configflag;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}

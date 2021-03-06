package com.youxianji.facade.system.bean;

import com.youxianji.facade.trade.bean.json.VoucherBean;


/**
 * 注册接口返回属性 BEAN
 * @author xyuser
 * command=1002
 *
 */
public class LoginResponseBean{
	
	/* 用户ID */
	private String userid;
	/* 手机号 */
	private String telephone;
	//购物车总数
	private String cardcount;
	private String couponcount;//注册时返回代金券id
	private String paypassflag;//	String	是否设置支付密码	0未设置 1 已设置
	private String useramount;//	String	用户账户余额	
	private String memberflag;//	String 	会员标识	0 不是 1 是
	private String islogin;// 0 注册  1登录
	private String totalmoney;//红包总金额
	


	public String getTotalmoney() {
		return totalmoney;
	}

	public void setTotalmoney(String totalmoney) {
		this.totalmoney = totalmoney;
	}

	public String getIslogin() {
		return islogin;
	}

	public void setIslogin(String islogin) {
		this.islogin = islogin;
	}

	public String getPaypassflag() {
		return paypassflag;
	}

	public void setPaypassflag(String paypassflag) {
		this.paypassflag = paypassflag;
	}

	public String getUseramount() {
		return useramount;
	}

	public void setUseramount(String useramount) {
		this.useramount = useramount;
	}

	public String getMemberflag() {
		return memberflag;
	}

	public void setMemberflag(String memberflag) {
		this.memberflag = memberflag;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCardcount() {
		return cardcount;
	}

	public void setCardcount(String cardcount) {
		this.cardcount = cardcount;
	}

	public String getCouponcount() {
		return couponcount;
	}

	public void setCouponcount(String couponcount) {
		this.couponcount = couponcount;
	}

	

	
	
	
	
	
	
}

package com.czxy.mybatis_0929.domain;

import java.util.Date;

/**
 *
 Create Table

 CREATE TABLE `orders` (
 `oid` varchar(32) NOT NULL,
 `ordertime` datetime DEFAULT NULL,
 `total` double DEFAULT NULL,
 `state` int(11) DEFAULT NULL,
 `address` varchar(30) DEFAULT NULL,
 `name` varchar(20) DEFAULT NULL,
 `telephone` varchar(20) DEFAULT NULL,
 `uid` varchar(32) DEFAULT NULL,
 PRIMARY KEY (`oid`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8

 */
public class Order {

	private String oid; 		// 订单编号
	private Date ordertime; 	// 下单时间
	private Double total; 		// 订单总金额
	private Integer state; 		// 订单状态 0 未支付 1 已支付 2已发货 3已收货
	private String address;		// 收货人地址
	private String name;		// 收货人姓名
	private String telephone;	// 收货人电话
	private String uid;
	// 多对一， 多个订单 属于 【一个用户】
	private User user;
	// ...

	@Override
	public String toString() {
		return "Order{" +
				"oid='" + oid + '\'' +
				", ordertime=" + ordertime +
				", total=" + total +
				", state=" + state +
				", address='" + address + '\'' +
				", name='" + name + '\'' +
				", telephone='" + telephone + '\'' +
				", uid='" + uid + '\'' +
				", user=" + user +
				'}';
	}

	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public Date getOrdertime() {
		return ordertime;
	}

	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Order() {
	}

	public Order(String oid, Date ordertime, Double total, Integer state, String address, String name, String telephone, String uid, User user) {
		this.oid = oid;
		this.ordertime = ordertime;
		this.total = total;
		this.state = state;
		this.address = address;
		this.name = name;
		this.telephone = telephone;
		this.uid = uid;
		this.user = user;
	}
}
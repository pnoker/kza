package com.noker.kza.model;

import java.io.Serializable;
import java.util.Date;

public class ReservePlus implements Serializable {

	/**
	 * 鍏紬鍙锋爣璇�
	 * @mbggenerated
	 */
	private String appId;
	/**
	 * 鏄熸湡  1锛氭槦鏈熶竴 2锛氭槦鏈熶簩 3锛氭槦鏈熶笁 4锛氭槦鏈熷洓 5锛氭槦鏈熶簲 6锛氭槦鏈熷叚 7锛氭槦鏈熸棩
	 * @mbggenerated
	 */
	private Integer week;
	/**
	 * 涓婂崍 1锛氬嚭璇� 2锛氫笉鍑鸿瘖
	 * @mbggenerated
	 */
	private Integer am;
	/**
	 * 涓嬪崍 1锛氬嚭璇� 2锛氫笉鍑鸿瘖
	 * @mbggenerated
	 */
	private Integer pm;
	/**
	 * 鍙绾︿汉鏁�
	 * @mbggenerated
	 */
	private Integer max;
	/**
	 * 棰勭害浠锋牸 鍗曚綅鍒�
	 * @mbggenerated
	 */
	private Integer price;
	/**
	 * 鏄惁鍚敤 1锛氬惎鐢� 2锛氫笉鍚敤
	 * @mbggenerated
	 */
	private Integer isOpen;
	/**
	 * 鍒涘缓鏃堕棿
	 * @mbggenerated
	 */
	private Date atTime;
	/**
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return  the value of reserve_plus.app_id
	 * @mbggenerated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId  the value for reserve_plus.app_id
	 * @mbggenerated
	 */
	public void setAppId(String appId) {
		this.appId = appId == null ? null : appId.trim();
	}

	/**
	 * @return  the value of reserve_plus.week
	 * @mbggenerated
	 */
	public Integer getWeek() {
		return week;
	}

	/**
	 * @param week  the value for reserve_plus.week
	 * @mbggenerated
	 */
	public void setWeek(Integer week) {
		this.week = week;
	}

	/**
	 * @return  the value of reserve_plus.am
	 * @mbggenerated
	 */
	public Integer getAm() {
		return am;
	}

	/**
	 * @param am  the value for reserve_plus.am
	 * @mbggenerated
	 */
	public void setAm(Integer am) {
		this.am = am;
	}

	/**
	 * @return  the value of reserve_plus.pm
	 * @mbggenerated
	 */
	public Integer getPm() {
		return pm;
	}

	/**
	 * @param pm  the value for reserve_plus.pm
	 * @mbggenerated
	 */
	public void setPm(Integer pm) {
		this.pm = pm;
	}

	/**
	 * @return  the value of reserve_plus.max
	 * @mbggenerated
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * @param max  the value for reserve_plus.max
	 * @mbggenerated
	 */
	public void setMax(Integer max) {
		this.max = max;
	}

	/**
	 * @return  the value of reserve_plus.price
	 * @mbggenerated
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * @param price  the value for reserve_plus.price
	 * @mbggenerated
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * @return  the value of reserve_plus.is_open
	 * @mbggenerated
	 */
	public Integer getIsOpen() {
		return isOpen;
	}

	/**
	 * @param isOpen  the value for reserve_plus.is_open
	 * @mbggenerated
	 */
	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}

	/**
	 * @return  the value of reserve_plus.at_time
	 * @mbggenerated
	 */
	public Date getAtTime() {
		return atTime;
	}

	/**
	 * @param atTime  the value for reserve_plus.at_time
	 * @mbggenerated
	 */
	public void setAtTime(Date atTime) {
		this.atTime = atTime;
	}

	/**
	 * @mbggenerated
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		ReservePlus other = (ReservePlus) that;
		return (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
				&& (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
				&& (this.getAm() == null ? other.getAm() == null : this.getAm().equals(other.getAm()))
				&& (this.getPm() == null ? other.getPm() == null : this.getPm().equals(other.getPm()))
				&& (this.getMax() == null ? other.getMax() == null : this.getMax().equals(other.getMax()))
				&& (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
				&& (this.getIsOpen() == null ? other.getIsOpen() == null : this.getIsOpen().equals(other.getIsOpen()))
				&& (this.getAtTime() == null ? other.getAtTime() == null : this.getAtTime().equals(other.getAtTime()));
	}

	/**
	 * @mbggenerated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
		result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
		result = prime * result + ((getAm() == null) ? 0 : getAm().hashCode());
		result = prime * result + ((getPm() == null) ? 0 : getPm().hashCode());
		result = prime * result + ((getMax() == null) ? 0 : getMax().hashCode());
		result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
		result = prime * result + ((getIsOpen() == null) ? 0 : getIsOpen().hashCode());
		result = prime * result + ((getAtTime() == null) ? 0 : getAtTime().hashCode());
		return result;
	}

	/**
	 * @mbggenerated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", appId=").append(appId);
		sb.append(", week=").append(week);
		sb.append(", am=").append(am);
		sb.append(", pm=").append(pm);
		sb.append(", max=").append(max);
		sb.append(", price=").append(price);
		sb.append(", isOpen=").append(isOpen);
		sb.append(", atTime=").append(atTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
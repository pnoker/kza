package com.noker.kza.model;

import java.io.Serializable;
import java.util.Date;

public class ReserveTel implements Serializable {

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
	 * 鍙數璇濋绾︽椂闂存 姣忓皬鏃舵槸鏁寸偣寮�濮�  姣忔鏄�15鍒嗛挓 姣忓ぉ鏈�澶�6涓椂闂存 鏃堕棿娈靛紑濮嬫椂闂达細鏃讹細鍒� 姣忔鐢�;鍙烽殧寮� 濡傦細01锛�15锛�03锛�30
	 * @mbggenerated
	 */
	private String timeRange;
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
	 * @return  the value of reserve_tel.app_id
	 * @mbggenerated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId  the value for reserve_tel.app_id
	 * @mbggenerated
	 */
	public void setAppId(String appId) {
		this.appId = appId == null ? null : appId.trim();
	}

	/**
	 * @return  the value of reserve_tel.week
	 * @mbggenerated
	 */
	public Integer getWeek() {
		return week;
	}

	/**
	 * @param week  the value for reserve_tel.week
	 * @mbggenerated
	 */
	public void setWeek(Integer week) {
		this.week = week;
	}

	/**
	 * @return  the value of reserve_tel.time_range
	 * @mbggenerated
	 */
	public String getTimeRange() {
		return timeRange;
	}

	/**
	 * @param timeRange  the value for reserve_tel.time_range
	 * @mbggenerated
	 */
	public void setTimeRange(String timeRange) {
		this.timeRange = timeRange == null ? null : timeRange.trim();
	}

	/**
	 * @return  the value of reserve_tel.price
	 * @mbggenerated
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * @param price  the value for reserve_tel.price
	 * @mbggenerated
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * @return  the value of reserve_tel.is_open
	 * @mbggenerated
	 */
	public Integer getIsOpen() {
		return isOpen;
	}

	/**
	 * @param isOpen  the value for reserve_tel.is_open
	 * @mbggenerated
	 */
	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}

	/**
	 * @return  the value of reserve_tel.at_time
	 * @mbggenerated
	 */
	public Date getAtTime() {
		return atTime;
	}

	/**
	 * @param atTime  the value for reserve_tel.at_time
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
		ReserveTel other = (ReserveTel) that;
		return (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
				&& (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
				&& (this.getTimeRange() == null ? other.getTimeRange() == null
						: this.getTimeRange().equals(other.getTimeRange()))
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
		result = prime * result + ((getTimeRange() == null) ? 0 : getTimeRange().hashCode());
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
		sb.append(", timeRange=").append(timeRange);
		sb.append(", price=").append(price);
		sb.append(", isOpen=").append(isOpen);
		sb.append(", atTime=").append(atTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
package com.noker.kza.model;

import java.io.Serializable;
import java.util.Date;

public class TreatRecord implements Serializable {

	/**
	 * 鑷涓婚敭id 鍞竴
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * 鍏紬鍙穒d
	 * @mbggenerated
	 */
	private String appId;
	/**
	 * 鐢ㄦ埛id
	 * @mbggenerated
	 */
	private String userId;
	/**
	 * 浠锋牸 鍗曚綅鍒�
	 * @mbggenerated
	 */
	private Integer price;
	/**
	 * 灏辫瘖绫诲瀷 1锛氶棬璇婂姞鍙� 2锛氱數璇濆挩璇�
	 * @mbggenerated
	 */
	private Integer type;
	/**
	 * 棰勭害寮�濮嬫椂闂� 濡傦細骞存湀鏃� 涓婂崍鎴栧勾鏈堟棩鏃跺垎
	 * @mbggenerated
	 */
	private String reserveTime;
	/**
	 * 鍖荤敓寤鸿
	 * @mbggenerated
	 */
	private String suggest;
	/**
	 * 澶囨敞
	 * @mbggenerated
	 */
	private String memo;
	/**
	 * 灏辫瘖鏃ユ湡
	 * @mbggenerated
	 */
	private Date atDate;
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
	 * @return  the value of treat_record.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id  the value for treat_record.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return  the value of treat_record.app_id
	 * @mbggenerated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId  the value for treat_record.app_id
	 * @mbggenerated
	 */
	public void setAppId(String appId) {
		this.appId = appId == null ? null : appId.trim();
	}

	/**
	 * @return  the value of treat_record.user_id
	 * @mbggenerated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId  the value for treat_record.user_id
	 * @mbggenerated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * @return  the value of treat_record.price
	 * @mbggenerated
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * @param price  the value for treat_record.price
	 * @mbggenerated
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * @return  the value of treat_record.type
	 * @mbggenerated
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param type  the value for treat_record.type
	 * @mbggenerated
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return  the value of treat_record.reserve_time
	 * @mbggenerated
	 */
	public String getReserveTime() {
		return reserveTime;
	}

	/**
	 * @param reserveTime  the value for treat_record.reserve_time
	 * @mbggenerated
	 */
	public void setReserveTime(String reserveTime) {
		this.reserveTime = reserveTime == null ? null : reserveTime.trim();
	}

	/**
	 * @return  the value of treat_record.suggest
	 * @mbggenerated
	 */
	public String getSuggest() {
		return suggest;
	}

	/**
	 * @param suggest  the value for treat_record.suggest
	 * @mbggenerated
	 */
	public void setSuggest(String suggest) {
		this.suggest = suggest == null ? null : suggest.trim();
	}

	/**
	 * @return  the value of treat_record.memo
	 * @mbggenerated
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo  the value for treat_record.memo
	 * @mbggenerated
	 */
	public void setMemo(String memo) {
		this.memo = memo == null ? null : memo.trim();
	}

	/**
	 * @return  the value of treat_record.at_date
	 * @mbggenerated
	 */
	public Date getAtDate() {
		return atDate;
	}

	/**
	 * @param atDate  the value for treat_record.at_date
	 * @mbggenerated
	 */
	public void setAtDate(Date atDate) {
		this.atDate = atDate;
	}

	/**
	 * @return  the value of treat_record.at_time
	 * @mbggenerated
	 */
	public Date getAtTime() {
		return atTime;
	}

	/**
	 * @param atTime  the value for treat_record.at_time
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
		TreatRecord other = (TreatRecord) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
				&& (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
				&& (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
				&& (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
				&& (this.getReserveTime() == null ? other.getReserveTime() == null
						: this.getReserveTime().equals(other.getReserveTime()))
				&& (this.getSuggest() == null ? other.getSuggest() == null
						: this.getSuggest().equals(other.getSuggest()))
				&& (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
				&& (this.getAtDate() == null ? other.getAtDate() == null : this.getAtDate().equals(other.getAtDate()))
				&& (this.getAtTime() == null ? other.getAtTime() == null : this.getAtTime().equals(other.getAtTime()));
	}

	/**
	 * @mbggenerated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
		result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
		result = prime * result + ((getReserveTime() == null) ? 0 : getReserveTime().hashCode());
		result = prime * result + ((getSuggest() == null) ? 0 : getSuggest().hashCode());
		result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
		result = prime * result + ((getAtDate() == null) ? 0 : getAtDate().hashCode());
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
		sb.append(", id=").append(id);
		sb.append(", appId=").append(appId);
		sb.append(", userId=").append(userId);
		sb.append(", price=").append(price);
		sb.append(", type=").append(type);
		sb.append(", reserveTime=").append(reserveTime);
		sb.append(", suggest=").append(suggest);
		sb.append(", memo=").append(memo);
		sb.append(", atDate=").append(atDate);
		sb.append(", atTime=").append(atTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
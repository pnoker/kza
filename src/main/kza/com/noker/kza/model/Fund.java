package com.noker.kza.model;

import java.io.Serializable;
import java.util.Date;

public class Fund implements Serializable {

	/**
	 * 鑷涓婚敭id 鍞竴
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * 鏀粯鍗″彿
	 * @mbggenerated
	 */
	private String payId;
	/**
	 * 鍏呭�奸噾棰� 鍗曚綅鍒�
	 * @mbggenerated
	 */
	private Integer topup;
	/**
	 * 鎻愮幇閲戦 鍗曚綅鍒�
	 * @mbggenerated
	 */
	private Integer withdraw;
	/**
	 * 鏀粯鏂瑰紡  1锛氬井淇� 2锛氭敮浠樺疂
	 * @mbggenerated
	 */
	private Integer source;
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
	 * @return  the value of fund.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id  the value for fund.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return  the value of fund.pay_id
	 * @mbggenerated
	 */
	public String getPayId() {
		return payId;
	}

	/**
	 * @param payId  the value for fund.pay_id
	 * @mbggenerated
	 */
	public void setPayId(String payId) {
		this.payId = payId == null ? null : payId.trim();
	}

	/**
	 * @return  the value of fund.topup
	 * @mbggenerated
	 */
	public Integer getTopup() {
		return topup;
	}

	/**
	 * @param topup  the value for fund.topup
	 * @mbggenerated
	 */
	public void setTopup(Integer topup) {
		this.topup = topup;
	}

	/**
	 * @return  the value of fund.withdraw
	 * @mbggenerated
	 */
	public Integer getWithdraw() {
		return withdraw;
	}

	/**
	 * @param withdraw  the value for fund.withdraw
	 * @mbggenerated
	 */
	public void setWithdraw(Integer withdraw) {
		this.withdraw = withdraw;
	}

	/**
	 * @return  the value of fund.source
	 * @mbggenerated
	 */
	public Integer getSource() {
		return source;
	}

	/**
	 * @param source  the value for fund.source
	 * @mbggenerated
	 */
	public void setSource(Integer source) {
		this.source = source;
	}

	/**
	 * @return  the value of fund.at_time
	 * @mbggenerated
	 */
	public Date getAtTime() {
		return atTime;
	}

	/**
	 * @param atTime  the value for fund.at_time
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
		Fund other = (Fund) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
				&& (this.getTopup() == null ? other.getTopup() == null : this.getTopup().equals(other.getTopup()))
				&& (this.getWithdraw() == null ? other.getWithdraw() == null
						: this.getWithdraw().equals(other.getWithdraw()))
				&& (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
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
		result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
		result = prime * result + ((getTopup() == null) ? 0 : getTopup().hashCode());
		result = prime * result + ((getWithdraw() == null) ? 0 : getWithdraw().hashCode());
		result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
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
		sb.append(", payId=").append(payId);
		sb.append(", topup=").append(topup);
		sb.append(", withdraw=").append(withdraw);
		sb.append(", source=").append(source);
		sb.append(", atTime=").append(atTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
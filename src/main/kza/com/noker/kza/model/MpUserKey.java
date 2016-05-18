package com.noker.kza.model;

import java.io.Serializable;

public class MpUserKey implements Serializable {

	/**
	 * 鍏紬鍙锋爣璇�
	 * @mbggenerated
	 */
	private String appId;
	/**
	 * 鍏紬鍙蜂笅openid 鍏紬鍙蜂笅鍞竴
	 * @mbggenerated
	 */
	private String openId;
	/**
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return  the value of mp_user.app_id
	 * @mbggenerated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId  the value for mp_user.app_id
	 * @mbggenerated
	 */
	public void setAppId(String appId) {
		this.appId = appId == null ? null : appId.trim();
	}

	/**
	 * @return  the value of mp_user.open_id
	 * @mbggenerated
	 */
	public String getOpenId() {
		return openId;
	}

	/**
	 * @param openId  the value for mp_user.open_id
	 * @mbggenerated
	 */
	public void setOpenId(String openId) {
		this.openId = openId == null ? null : openId.trim();
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
		MpUserKey other = (MpUserKey) that;
		return (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
				&& (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()));
	}

	/**
	 * @mbggenerated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
		result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
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
		sb.append(", openId=").append(openId);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
package com.noker.kza.model;

import java.io.Serializable;
import java.util.Date;

public class MpUser extends MpUserKey implements Serializable {

	/**
	 * 瑙掕壊 1锛氭偅鑰咃紝2锛氬尰鐢�
	 * @mbggenerated
	 */
	private Integer role;
	/**
	 * 鐢ㄦ埛鍚�
	 * @mbggenerated
	 */
	private String userId;
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
	 * @return  the value of mp_user.role
	 * @mbggenerated
	 */
	public Integer getRole() {
		return role;
	}

	/**
	 * @param role  the value for mp_user.role
	 * @mbggenerated
	 */
	public void setRole(Integer role) {
		this.role = role;
	}

	/**
	 * @return  the value of mp_user.user_id
	 * @mbggenerated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId  the value for mp_user.user_id
	 * @mbggenerated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * @return  the value of mp_user.at_time
	 * @mbggenerated
	 */
	public Date getAtTime() {
		return atTime;
	}

	/**
	 * @param atTime  the value for mp_user.at_time
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
		MpUser other = (MpUser) that;
		return (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
				&& (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
				&& (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
				&& (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
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
		result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
		result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
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
		sb.append(", role=").append(role);
		sb.append(", userId=").append(userId);
		sb.append(", atTime=").append(atTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
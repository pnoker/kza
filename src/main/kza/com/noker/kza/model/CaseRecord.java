package com.noker.kza.model;

import java.io.Serializable;
import java.util.Date;

public class CaseRecord implements Serializable {

	/**
	 * 鑷涓婚敭id 鍞竴
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * 鐢ㄦ埛id
	 * @mbggenerated
	 */
	private String userId;
	/**
	 * 鐥呮儏鎻忚堪
	 * @mbggenerated
	 */
	private String description;
	/**
	 * 鐥呮儏澶囨敞
	 * @mbggenerated
	 */
	private String memo;
	/**
	 * 鍖栭獙鍗曠殑鐓х墖 瀛樺偍鍦ㄦ寚瀹氱洰褰曚笅/id/report/1-n.jpg 缂╃暐鍥�1-n_thumb.jpg 鏈瓧娈靛瓨鐨勬槸鏂囦欢鍚嶏紝浠ラ�楀彿闅斿紑锛�1锛�2锛�
	 * @mbggenerated
	 */
	private String report;
	/**
	 * 妫�鏌ョ粨鏋滅殑鐓х墖 瀛樺偍鍦ㄦ寚瀹氱洰褰曚笅/id/result/1-n.jpg 缂╃暐鍥�1-n_thumb.jpg 鏈瓧娈靛瓨鐨勬槸鏂囦欢鍚嶏紝浠ラ�楀彿闅斿紑锛�1锛�2锛�
	 * @mbggenerated
	 */
	private String result;
	/**
	 * 鐥呭巻鐨勭収鐗� 瀛樺偍鍦ㄦ寚瀹氱洰褰曚笅/id/picture/1-n.jpg 缂╃暐鍥�1-n_thumb.jpg 鏈瓧娈靛瓨鐨勬槸鏂囦欢鍚嶏紝浠ラ�楀彿闅斿紑锛�1锛�2锛�
	 * @mbggenerated
	 */
	private String picture;
	/**
	 * 鐥呬緥鏃ユ湡
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
	 * @return  the value of case_record.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id  the value for case_record.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return  the value of case_record.user_id
	 * @mbggenerated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId  the value for case_record.user_id
	 * @mbggenerated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * @return  the value of case_record.description
	 * @mbggenerated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description  the value for case_record.description
	 * @mbggenerated
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * @return  the value of case_record.memo
	 * @mbggenerated
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo  the value for case_record.memo
	 * @mbggenerated
	 */
	public void setMemo(String memo) {
		this.memo = memo == null ? null : memo.trim();
	}

	/**
	 * @return  the value of case_record.report
	 * @mbggenerated
	 */
	public String getReport() {
		return report;
	}

	/**
	 * @param report  the value for case_record.report
	 * @mbggenerated
	 */
	public void setReport(String report) {
		this.report = report == null ? null : report.trim();
	}

	/**
	 * @return  the value of case_record.result
	 * @mbggenerated
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result  the value for case_record.result
	 * @mbggenerated
	 */
	public void setResult(String result) {
		this.result = result == null ? null : result.trim();
	}

	/**
	 * @return  the value of case_record.picture
	 * @mbggenerated
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture  the value for case_record.picture
	 * @mbggenerated
	 */
	public void setPicture(String picture) {
		this.picture = picture == null ? null : picture.trim();
	}

	/**
	 * @return  the value of case_record.at_date
	 * @mbggenerated
	 */
	public Date getAtDate() {
		return atDate;
	}

	/**
	 * @param atDate  the value for case_record.at_date
	 * @mbggenerated
	 */
	public void setAtDate(Date atDate) {
		this.atDate = atDate;
	}

	/**
	 * @return  the value of case_record.at_time
	 * @mbggenerated
	 */
	public Date getAtTime() {
		return atTime;
	}

	/**
	 * @param atTime  the value for case_record.at_time
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
		CaseRecord other = (CaseRecord) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
				&& (this.getDescription() == null ? other.getDescription() == null
						: this.getDescription().equals(other.getDescription()))
				&& (this.getMemo() == null ? other.getMemo() == null : this.getMemo().equals(other.getMemo()))
				&& (this.getReport() == null ? other.getReport() == null : this.getReport().equals(other.getReport()))
				&& (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
				&& (this.getPicture() == null ? other.getPicture() == null
						: this.getPicture().equals(other.getPicture()))
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
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
		result = prime * result + ((getMemo() == null) ? 0 : getMemo().hashCode());
		result = prime * result + ((getReport() == null) ? 0 : getReport().hashCode());
		result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
		result = prime * result + ((getPicture() == null) ? 0 : getPicture().hashCode());
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
		sb.append(", userId=").append(userId);
		sb.append(", description=").append(description);
		sb.append(", memo=").append(memo);
		sb.append(", report=").append(report);
		sb.append(", result=").append(result);
		sb.append(", picture=").append(picture);
		sb.append(", atDate=").append(atDate);
		sb.append(", atTime=").append(atTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
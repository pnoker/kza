package com.noker.kza.model;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {

	/**
	 * 鑷涓婚敭id 鍞竴
	 * @mbggenerated
	 */
	private Integer id;
	/**
	 * 鍏紬鍙锋爣璇�
	 * @mbggenerated
	 */
	private String appId;
	/**
	 * 鏂囩珷绫诲瀷  1锛氭潅蹇� 2锛氫細璁� 3锛氭椿鍔� 4锛氭枃绔� 5锛氳棰� 6锛氶煶棰�  
	 * @mbggenerated
	 */
	private Integer type;
	/**
	 * 鏂囩珷logo url
	 * @mbggenerated
	 */
	private String logo;
	/**
	 * 鏂囩珷鏍囬
	 * @mbggenerated
	 */
	private String title;
	/**
	 * 鏂囩珷鎽樿
	 * @mbggenerated
	 */
	private String summary;
	/**
	 * 涓婄骇鍗曚綅
	 * @mbggenerated
	 */
	private String upperOrg;
	/**
	 * 涓诲姙鍗曚綅
	 * @mbggenerated
	 */
	private String organizer;
	/**
	 * 鏉傚織鏂瑰悜
	 * @mbggenerated
	 */
	private String magWay;
	/**
	 * 鏉傚織绾у埆
	 * @mbggenerated
	 */
	private String magLevel;
	/**
	 * 浼氳鏃堕棿
	 * @mbggenerated
	 */
	private String metDate;
	/**
	 * 浼氳鍦扮偣
	 * @mbggenerated
	 */
	private String metAddr;
	/**
	 * 鍐呭 url
	 * @mbggenerated
	 */
	private String content;
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
	 * @return  the value of article.id
	 * @mbggenerated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id  the value for article.id
	 * @mbggenerated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return  the value of article.app_id
	 * @mbggenerated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId  the value for article.app_id
	 * @mbggenerated
	 */
	public void setAppId(String appId) {
		this.appId = appId == null ? null : appId.trim();
	}

	/**
	 * @return  the value of article.type
	 * @mbggenerated
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param type  the value for article.type
	 * @mbggenerated
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return  the value of article.logo
	 * @mbggenerated
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo  the value for article.logo
	 * @mbggenerated
	 */
	public void setLogo(String logo) {
		this.logo = logo == null ? null : logo.trim();
	}

	/**
	 * @return  the value of article.title
	 * @mbggenerated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title  the value for article.title
	 * @mbggenerated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * @return  the value of article.summary
	 * @mbggenerated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary  the value for article.summary
	 * @mbggenerated
	 */
	public void setSummary(String summary) {
		this.summary = summary == null ? null : summary.trim();
	}

	/**
	 * @return  the value of article.upper_org
	 * @mbggenerated
	 */
	public String getUpperOrg() {
		return upperOrg;
	}

	/**
	 * @param upperOrg  the value for article.upper_org
	 * @mbggenerated
	 */
	public void setUpperOrg(String upperOrg) {
		this.upperOrg = upperOrg == null ? null : upperOrg.trim();
	}

	/**
	 * @return  the value of article.organizer
	 * @mbggenerated
	 */
	public String getOrganizer() {
		return organizer;
	}

	/**
	 * @param organizer  the value for article.organizer
	 * @mbggenerated
	 */
	public void setOrganizer(String organizer) {
		this.organizer = organizer == null ? null : organizer.trim();
	}

	/**
	 * @return  the value of article.mag_way
	 * @mbggenerated
	 */
	public String getMagWay() {
		return magWay;
	}

	/**
	 * @param magWay  the value for article.mag_way
	 * @mbggenerated
	 */
	public void setMagWay(String magWay) {
		this.magWay = magWay == null ? null : magWay.trim();
	}

	/**
	 * @return  the value of article.mag_level
	 * @mbggenerated
	 */
	public String getMagLevel() {
		return magLevel;
	}

	/**
	 * @param magLevel  the value for article.mag_level
	 * @mbggenerated
	 */
	public void setMagLevel(String magLevel) {
		this.magLevel = magLevel == null ? null : magLevel.trim();
	}

	/**
	 * @return  the value of article.met_date
	 * @mbggenerated
	 */
	public String getMetDate() {
		return metDate;
	}

	/**
	 * @param metDate  the value for article.met_date
	 * @mbggenerated
	 */
	public void setMetDate(String metDate) {
		this.metDate = metDate == null ? null : metDate.trim();
	}

	/**
	 * @return  the value of article.met_addr
	 * @mbggenerated
	 */
	public String getMetAddr() {
		return metAddr;
	}

	/**
	 * @param metAddr  the value for article.met_addr
	 * @mbggenerated
	 */
	public void setMetAddr(String metAddr) {
		this.metAddr = metAddr == null ? null : metAddr.trim();
	}

	/**
	 * @return  the value of article.content
	 * @mbggenerated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content  the value for article.content
	 * @mbggenerated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	/**
	 * @return  the value of article.at_time
	 * @mbggenerated
	 */
	public Date getAtTime() {
		return atTime;
	}

	/**
	 * @param atTime  the value for article.at_time
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
		Article other = (Article) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
				&& (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
				&& (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
				&& (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
				&& (this.getSummary() == null ? other.getSummary() == null
						: this.getSummary().equals(other.getSummary()))
				&& (this.getUpperOrg() == null ? other.getUpperOrg() == null
						: this.getUpperOrg().equals(other.getUpperOrg()))
				&& (this.getOrganizer() == null ? other.getOrganizer() == null
						: this.getOrganizer().equals(other.getOrganizer()))
				&& (this.getMagWay() == null ? other.getMagWay() == null : this.getMagWay().equals(other.getMagWay()))
				&& (this.getMagLevel() == null ? other.getMagLevel() == null
						: this.getMagLevel().equals(other.getMagLevel()))
				&& (this.getMetDate() == null ? other.getMetDate() == null
						: this.getMetDate().equals(other.getMetDate()))
				&& (this.getMetAddr() == null ? other.getMetAddr() == null
						: this.getMetAddr().equals(other.getMetAddr()))
				&& (this.getContent() == null ? other.getContent() == null
						: this.getContent().equals(other.getContent()))
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
		result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
		result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
		result = prime * result + ((getSummary() == null) ? 0 : getSummary().hashCode());
		result = prime * result + ((getUpperOrg() == null) ? 0 : getUpperOrg().hashCode());
		result = prime * result + ((getOrganizer() == null) ? 0 : getOrganizer().hashCode());
		result = prime * result + ((getMagWay() == null) ? 0 : getMagWay().hashCode());
		result = prime * result + ((getMagLevel() == null) ? 0 : getMagLevel().hashCode());
		result = prime * result + ((getMetDate() == null) ? 0 : getMetDate().hashCode());
		result = prime * result + ((getMetAddr() == null) ? 0 : getMetAddr().hashCode());
		result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
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
		sb.append(", type=").append(type);
		sb.append(", logo=").append(logo);
		sb.append(", title=").append(title);
		sb.append(", summary=").append(summary);
		sb.append(", upperOrg=").append(upperOrg);
		sb.append(", organizer=").append(organizer);
		sb.append(", magWay=").append(magWay);
		sb.append(", magLevel=").append(magLevel);
		sb.append(", metDate=").append(metDate);
		sb.append(", metAddr=").append(metAddr);
		sb.append(", content=").append(content);
		sb.append(", atTime=").append(atTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
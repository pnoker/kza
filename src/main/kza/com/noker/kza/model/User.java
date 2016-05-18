package com.noker.kza.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	/**
	 * 鐢ㄦ埛鏍囪瘑
	 * 
	 * @mbggenerated
	 */
	private String userId;
	private String openId;
	private String appId;

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * 鐢ㄦ埛瀵嗙爜
	 * 
	 * @mbggenerated
	 */
	private String userPw;
	/**
	 * 鏀粯鍗″彿
	 * 
	 * @mbggenerated
	 */
	private String payId;
	/**
	 * 鏀粯瀵嗙爜
	 * 
	 * @mbggenerated
	 */
	private String payPw;
	/**
	 * 濮撳悕
	 * 
	 * @mbggenerated
	 */
	private String name;
	/**
	 * 鎬у埆 锛�1锛氱敺 2锛氬コ 3锛氫笉纭畾
	 * 
	 * @mbggenerated
	 */
	private Integer sex;
	/**
	 * 鍑虹敓鏃ユ湡
	 * 
	 * @mbggenerated
	 */
	private Date birthday;
	/**
	 * 鑱旂郴鐢佃瘽
	 * 
	 * @mbggenerated
	 */
	private String mobile;
	/**
	 * 閭
	 * 
	 * @mbggenerated
	 */
	private String mail;
	/**
	 * qq鍙�
	 * 
	 * @mbggenerated
	 */
	private String qq;
	/**
	 * 鍥藉
	 * 
	 * @mbggenerated
	 */
	private String country;
	/**
	 * 鐪�
	 * 
	 * @mbggenerated
	 */
	private String province;
	/**
	 * 甯�
	 * 
	 * @mbggenerated
	 */
	private String city;
	/**
	 * 鍖�
	 * 
	 * @mbggenerated
	 */
	private String district;
	/**
	 * 鍦板潃
	 * 
	 * @mbggenerated
	 */
	private String address;
	/**
	 * 寰俊鍙�
	 * 
	 * @mbggenerated
	 */
	private String wCode;
	/**
	 * 寰俊鏄电О
	 * 
	 * @mbggenerated
	 */
	private String wName;
	/**
	 * 寰俊澶村儚 url
	 * 
	 * @mbggenerated
	 */
	private String wLogo;
	/**
	 * @mbggenerated
	 */
	private Date atTime;
	/**
	 * @mbggenerated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @return the value of user.user_id
	 * @mbggenerated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the value for user.user_id
	 * @mbggenerated
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * @return the value of user.user_pw
	 * @mbggenerated
	 */
	public String getUserPw() {
		return userPw;
	}

	/**
	 * @param userPw
	 *            the value for user.user_pw
	 * @mbggenerated
	 */
	public void setUserPw(String userPw) {
		this.userPw = userPw == null ? null : userPw.trim();
	}

	/**
	 * @return the value of user.pay_id
	 * @mbggenerated
	 */
	public String getPayId() {
		return payId;
	}

	/**
	 * @param payId
	 *            the value for user.pay_id
	 * @mbggenerated
	 */
	public void setPayId(String payId) {
		this.payId = payId == null ? null : payId.trim();
	}

	/**
	 * @return the value of user.pay_pw
	 * @mbggenerated
	 */
	public String getPayPw() {
		return payPw;
	}

	/**
	 * @param payPw
	 *            the value for user.pay_pw
	 * @mbggenerated
	 */
	public void setPayPw(String payPw) {
		this.payPw = payPw == null ? null : payPw.trim();
	}

	/**
	 * @return the value of user.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the value for user.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * @return the value of user.sex
	 * @mbggenerated
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the value for user.sex
	 * @mbggenerated
	 */
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * @return the value of user.birthday
	 * @mbggenerated
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the value for user.birthday
	 * @mbggenerated
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the value of user.mobile
	 * @mbggenerated
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the value for user.mobile
	 * @mbggenerated
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	/**
	 * @return the value of user.mail
	 * @mbggenerated
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            the value for user.mail
	 * @mbggenerated
	 */
	public void setMail(String mail) {
		this.mail = mail == null ? null : mail.trim();
	}

	/**
	 * @return the value of user.qq
	 * @mbggenerated
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * @param qq
	 *            the value for user.qq
	 * @mbggenerated
	 */
	public void setQq(String qq) {
		this.qq = qq == null ? null : qq.trim();
	}

	/**
	 * @return the value of user.country
	 * @mbggenerated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the value for user.country
	 * @mbggenerated
	 */
	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	/**
	 * @return the value of user.province
	 * @mbggenerated
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province
	 *            the value for user.province
	 * @mbggenerated
	 */
	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}

	/**
	 * @return the value of user.city
	 * @mbggenerated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the value for user.city
	 * @mbggenerated
	 */
	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}

	/**
	 * @return the value of user.district
	 * @mbggenerated
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district
	 *            the value for user.district
	 * @mbggenerated
	 */
	public void setDistrict(String district) {
		this.district = district == null ? null : district.trim();
	}

	/**
	 * @return the value of user.address
	 * @mbggenerated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the value for user.address
	 * @mbggenerated
	 */
	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	/**
	 * @return the value of user.w_code
	 * @mbggenerated
	 */
	public String getwCode() {
		return wCode;
	}

	/**
	 * @param wCode
	 *            the value for user.w_code
	 * @mbggenerated
	 */
	public void setwCode(String wCode) {
		this.wCode = wCode == null ? null : wCode.trim();
	}

	/**
	 * @return the value of user.w_name
	 * @mbggenerated
	 */
	public String getwName() {
		return wName;
	}

	/**
	 * @param wName
	 *            the value for user.w_name
	 * @mbggenerated
	 */
	public void setwName(String wName) {
		this.wName = wName == null ? null : wName.trim();
	}

	/**
	 * @return the value of user.w_logo
	 * @mbggenerated
	 */
	public String getwLogo() {
		return wLogo;
	}

	/**
	 * @param wLogo
	 *            the value for user.w_logo
	 * @mbggenerated
	 */
	public void setwLogo(String wLogo) {
		this.wLogo = wLogo == null ? null : wLogo.trim();
	}

	/**
	 * @return the value of user.at_time
	 * @mbggenerated
	 */
	public Date getAtTime() {
		return atTime;
	}

	/**
	 * @param atTime
	 *            the value for user.at_time
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
		User other = (User) that;
		return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
				&& (this.getUserPw() == null ? other.getUserPw() == null : this.getUserPw().equals(other.getUserPw()))
				&& (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
				&& (this.getPayPw() == null ? other.getPayPw() == null : this.getPayPw().equals(other.getPayPw()))
				&& (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
				&& (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
				&& (this.getBirthday() == null ? other.getBirthday() == null
						: this.getBirthday().equals(other.getBirthday()))
				&& (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
				&& (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
				&& (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
				&& (this.getCountry() == null ? other.getCountry() == null
						: this.getCountry().equals(other.getCountry()))
				&& (this.getProvince() == null ? other.getProvince() == null
						: this.getProvince().equals(other.getProvince()))
				&& (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
				&& (this.getDistrict() == null ? other.getDistrict() == null
						: this.getDistrict().equals(other.getDistrict()))
				&& (this.getAddress() == null ? other.getAddress() == null
						: this.getAddress().equals(other.getAddress()))
				&& (this.getwCode() == null ? other.getwCode() == null : this.getwCode().equals(other.getwCode()))
				&& (this.getwName() == null ? other.getwName() == null : this.getwName().equals(other.getwName()))
				&& (this.getwLogo() == null ? other.getwLogo() == null : this.getwLogo().equals(other.getwLogo()))
				&& (this.getAtTime() == null ? other.getAtTime() == null : this.getAtTime().equals(other.getAtTime()));
	}

	/**
	 * @mbggenerated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
		result = prime * result + ((getUserPw() == null) ? 0 : getUserPw().hashCode());
		result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
		result = prime * result + ((getPayPw() == null) ? 0 : getPayPw().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
		result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
		result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
		result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
		result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
		result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
		result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
		result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
		result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
		result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
		result = prime * result + ((getwCode() == null) ? 0 : getwCode().hashCode());
		result = prime * result + ((getwName() == null) ? 0 : getwName().hashCode());
		result = prime * result + ((getwLogo() == null) ? 0 : getwLogo().hashCode());
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
		sb.append(", userId=").append(userId);
		sb.append(", userPw=").append(userPw);
		sb.append(", payId=").append(payId);
		sb.append(", payPw=").append(payPw);
		sb.append(", name=").append(name);
		sb.append(", sex=").append(sex);
		sb.append(", birthday=").append(birthday);
		sb.append(", mobile=").append(mobile);
		sb.append(", mail=").append(mail);
		sb.append(", qq=").append(qq);
		sb.append(", country=").append(country);
		sb.append(", province=").append(province);
		sb.append(", city=").append(city);
		sb.append(", district=").append(district);
		sb.append(", address=").append(address);
		sb.append(", wCode=").append(wCode);
		sb.append(", wName=").append(wName);
		sb.append(", wLogo=").append(wLogo);
		sb.append(", atTime=").append(atTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
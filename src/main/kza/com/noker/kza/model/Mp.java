package com.noker.kza.model;

import java.io.Serializable;
import java.util.Date;

public class Mp implements Serializable {

	/**
	 * 鍏紬鍙穒d
	 * @mbggenerated
	 */
	private String appId;
	/**
	 * 鍏紬鍙�
	 * @mbggenerated
	 */
	private String code;
	/**
	 * 鍏紬鍙峰悕绉�
	 * @mbggenerated
	 */
	private String name;
	/**
	 * 鍏紬鍙峰瘑閽�
	 * @mbggenerated
	 */
	private String appSecret;
	/**
	 * 鍏紬鍙蜂护鐗�
	 * @mbggenerated
	 */
	private String appToken;
	/**
	 * 娑堟伅瀵嗛挜
	 * @mbggenerated
	 */
	private String appAeskey;
	/**
	 * @mbggenerated
	 */
	private String refreshToken;
	/**
	 * 鍏紬鍙峰師濮媔d
	 * @mbggenerated
	 */
	private String rawId;
	/**
	 * 鍏紬鍙穕ogo url
	 * @mbggenerated
	 */
	private String logo;
	/**
	 * 鍏紬鍙蜂簩缁寸爜 url
	 * @mbggenerated
	 */
	private String appQr;
	/**
	 * 鍏紬鍙风被鍨嬶紝0浠ｈ〃璁㈤槄鍙凤紝1浠ｈ〃鐢卞巻鍙茶�佸笎鍙峰崌绾у悗鐨勮闃呭彿锛�2浠ｈ〃鏈嶅姟鍙�
	 * @mbggenerated
	 */
	private Integer serviceType;
	/**
	 * 璁よ瘉绫诲瀷锛�-1浠ｈ〃鏈璇侊紝0浠ｈ〃寰俊璁よ瘉锛�1浠ｈ〃鏂版氮寰崥璁よ瘉锛�2浠ｈ〃鑵捐寰崥璁よ瘉锛�3浠ｈ〃宸茶祫璐ㄨ璇侀�氳繃浣嗚繕鏈�氳繃鍚嶇О璁よ瘉锛�4浠ｈ〃宸茶祫璐ㄨ璇侀�氳繃銆佽繕鏈�氳繃鍚嶇О璁よ瘉锛屼絾閫氳繃浜嗘柊娴井鍗氳璇侊紝5浠ｈ〃宸茶祫璐ㄨ璇侀�氳繃銆佽繕鏈�氳繃鍚嶇О璁よ瘉锛屼絾閫氳繃浜嗚吘璁井鍗氳璇�
	 * @mbggenerated
	 */
	private Integer verifyType;
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
	 * @return  the value of mp.app_id
	 * @mbggenerated
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @param appId  the value for mp.app_id
	 * @mbggenerated
	 */
	public void setAppId(String appId) {
		this.appId = appId == null ? null : appId.trim();
	}

	/**
	 * @return  the value of mp.code
	 * @mbggenerated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code  the value for mp.code
	 * @mbggenerated
	 */
	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	/**
	 * @return  the value of mp.name
	 * @mbggenerated
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name  the value for mp.name
	 * @mbggenerated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * @return  the value of mp.app_secret
	 * @mbggenerated
	 */
	public String getAppSecret() {
		return appSecret;
	}

	/**
	 * @param appSecret  the value for mp.app_secret
	 * @mbggenerated
	 */
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret == null ? null : appSecret.trim();
	}

	/**
	 * @return  the value of mp.app_token
	 * @mbggenerated
	 */
	public String getAppToken() {
		return appToken;
	}

	/**
	 * @param appToken  the value for mp.app_token
	 * @mbggenerated
	 */
	public void setAppToken(String appToken) {
		this.appToken = appToken == null ? null : appToken.trim();
	}

	/**
	 * @return  the value of mp.app_aesKey
	 * @mbggenerated
	 */
	public String getAppAeskey() {
		return appAeskey;
	}

	/**
	 * @param appAeskey  the value for mp.app_aesKey
	 * @mbggenerated
	 */
	public void setAppAeskey(String appAeskey) {
		this.appAeskey = appAeskey == null ? null : appAeskey.trim();
	}

	/**
	 * @return  the value of mp.refresh_token
	 * @mbggenerated
	 */
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 * @param refreshToken  the value for mp.refresh_token
	 * @mbggenerated
	 */
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken == null ? null : refreshToken.trim();
	}

	/**
	 * @return  the value of mp.raw_id
	 * @mbggenerated
	 */
	public String getRawId() {
		return rawId;
	}

	/**
	 * @param rawId  the value for mp.raw_id
	 * @mbggenerated
	 */
	public void setRawId(String rawId) {
		this.rawId = rawId == null ? null : rawId.trim();
	}

	/**
	 * @return  the value of mp.logo
	 * @mbggenerated
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo  the value for mp.logo
	 * @mbggenerated
	 */
	public void setLogo(String logo) {
		this.logo = logo == null ? null : logo.trim();
	}

	/**
	 * @return  the value of mp.app_qr
	 * @mbggenerated
	 */
	public String getAppQr() {
		return appQr;
	}

	/**
	 * @param appQr  the value for mp.app_qr
	 * @mbggenerated
	 */
	public void setAppQr(String appQr) {
		this.appQr = appQr == null ? null : appQr.trim();
	}

	/**
	 * @return  the value of mp.service_type
	 * @mbggenerated
	 */
	public Integer getServiceType() {
		return serviceType;
	}

	/**
	 * @param serviceType  the value for mp.service_type
	 * @mbggenerated
	 */
	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	/**
	 * @return  the value of mp.verify_type
	 * @mbggenerated
	 */
	public Integer getVerifyType() {
		return verifyType;
	}

	/**
	 * @param verifyType  the value for mp.verify_type
	 * @mbggenerated
	 */
	public void setVerifyType(Integer verifyType) {
		this.verifyType = verifyType;
	}

	/**
	 * @return  the value of mp.at_time
	 * @mbggenerated
	 */
	public Date getAtTime() {
		return atTime;
	}

	/**
	 * @param atTime  the value for mp.at_time
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
		Mp other = (Mp) that;
		return (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
				&& (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
				&& (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
				&& (this.getAppSecret() == null ? other.getAppSecret() == null
						: this.getAppSecret().equals(other.getAppSecret()))
				&& (this.getAppToken() == null ? other.getAppToken() == null
						: this.getAppToken().equals(other.getAppToken()))
				&& (this.getAppAeskey() == null ? other.getAppAeskey() == null
						: this.getAppAeskey().equals(other.getAppAeskey()))
				&& (this.getRefreshToken() == null ? other.getRefreshToken() == null
						: this.getRefreshToken().equals(other.getRefreshToken()))
				&& (this.getRawId() == null ? other.getRawId() == null : this.getRawId().equals(other.getRawId()))
				&& (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
				&& (this.getAppQr() == null ? other.getAppQr() == null : this.getAppQr().equals(other.getAppQr()))
				&& (this.getServiceType() == null ? other.getServiceType() == null
						: this.getServiceType().equals(other.getServiceType()))
				&& (this.getVerifyType() == null ? other.getVerifyType() == null
						: this.getVerifyType().equals(other.getVerifyType()))
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
		result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + ((getAppSecret() == null) ? 0 : getAppSecret().hashCode());
		result = prime * result + ((getAppToken() == null) ? 0 : getAppToken().hashCode());
		result = prime * result + ((getAppAeskey() == null) ? 0 : getAppAeskey().hashCode());
		result = prime * result + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
		result = prime * result + ((getRawId() == null) ? 0 : getRawId().hashCode());
		result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
		result = prime * result + ((getAppQr() == null) ? 0 : getAppQr().hashCode());
		result = prime * result + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
		result = prime * result + ((getVerifyType() == null) ? 0 : getVerifyType().hashCode());
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
		sb.append(", code=").append(code);
		sb.append(", name=").append(name);
		sb.append(", appSecret=").append(appSecret);
		sb.append(", appToken=").append(appToken);
		sb.append(", appAeskey=").append(appAeskey);
		sb.append(", refreshToken=").append(refreshToken);
		sb.append(", rawId=").append(rawId);
		sb.append(", logo=").append(logo);
		sb.append(", appQr=").append(appQr);
		sb.append(", serviceType=").append(serviceType);
		sb.append(", verifyType=").append(verifyType);
		sb.append(", atTime=").append(atTime);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}
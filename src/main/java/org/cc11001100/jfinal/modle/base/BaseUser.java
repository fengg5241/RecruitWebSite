package org.cc11001100.jfinal.modle.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public M setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
		return (M)this;
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.String getId() {
		return get("id");
	}

	public M setUsername(java.lang.String username) {
		set("username", username);
		return (M)this;
	}

	public java.lang.String getUsername() {
		return get("username");
	}

	public M setNickname(java.lang.String nickname) {
		set("nickname", nickname);
		return (M)this;
	}

	public java.lang.String getNickname() {
		return get("nickname");
	}

	public M setPasswd(java.lang.String passwd) {
		set("passwd", passwd);
		return (M)this;
	}

	public java.lang.String getPasswd() {
		return get("passwd");
	}

	public M setAvatar(java.lang.String avatar) {
		set("avatar", avatar);
		return (M)this;
	}

	public java.lang.String getAvatar() {
		return get("avatar");
	}

	public M setUserType(java.lang.Integer userType) {
		set("user_type", userType);
		return (M)this;
	}

	public java.lang.Integer getUserType() {
		return get("user_type");
	}

	public M setIsFreeze(java.lang.Integer isFreeze) {
		set("is_freeze", isFreeze);
		return (M)this;
	}

	public java.lang.Integer getIsFreeze() {
		return get("is_freeze");
	}

}

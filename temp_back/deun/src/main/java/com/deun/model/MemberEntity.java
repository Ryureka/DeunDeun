
package com.deun.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER")
public class MemberEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	private long member_id;
	private String name;
	private String nickname;
	private String email;
	private String password;
	private String tel;

	@Column(name = "grade")
	@Enumerated(EnumType.STRING)
	private MemberRole role;

	private Date createAt;
	
	

	public MemberEntity() {
		super();
	}

	public MemberEntity(String name, String nickname, String email, String password, String tel, MemberRole role) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.tel = tel;
		this.role = role;
	}

	@PrePersist
	public void beforeCreateAt() {
		createAt = new Date();
	}

	public long getMember_id() {
		return member_id;
	}

	public void setMember_id(long member_id) {
		this.member_id = member_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public MemberRole getRole() {
		return role;
	}

	public void setRole(MemberRole role) {
		this.role = role;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "MemberEntity [member_id=" + member_id + ", name=" + name + ", nickname=" + nickname + ", email=" + email
				+ ", password=" + password + ", tel=" + tel + ", role=" + role + ", createAt=" + createAt + "]";
	}
}

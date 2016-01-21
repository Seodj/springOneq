package com.toast.oneq.vo;

import java.security.Timestamp;


/**
 * Copyright 2016 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * 유저의 정보를 저장하기 위한 VO
 * @author ${email}
 */
public class UserVo {

	private int			u_id;
	private Byte		u_type;
	private String		oauth_id;
	private String		token;
	private String		u_name;
	private Timestamp	birth_dt;
	private String		email;
	private Byte		gender;
	private String		thumbnail;
	
    public int getU_id() {
        return u_id;
    }
    public UserVo setU_id(int u_id) {
        this.u_id = u_id;
        return this;
    }
    
    public Byte getU_type() {
        return u_type;
    }
    public UserVo setU_type(Byte u_type) {
        this.u_type = u_type;
        return this;
    }
    
    public String getOauth_id() {
        return oauth_id;
    }
    public UserVo setOauth_id(String oauth_id) {
        this.oauth_id = oauth_id;
        return this;
    }
    
    public String getToken() {
        return token;
    }
    public UserVo setToken(String token) {
        this.token = token;
        return this;
    }
    
    public String getU_name() {
        return u_name;
    }
    public UserVo setU_name(String u_name) {
        this.u_name = u_name;
        return this;
    }
    
    public Timestamp getBirth_dt() {
        return birth_dt;
    }
    public UserVo setBirth_dt(Timestamp birth_dt) {
        this.birth_dt = birth_dt;
        return this;
    }
    
    public String getEmail() {
        return email;
    }
    public UserVo setEmail(String email) {
        this.email = email;
        return this;
    }
    
    public Byte getGender() {
        return gender;
    }
    public UserVo setGender(Byte gender) {
        this.gender = gender;
        return this;
    }
    
    public String getThumbnail() {
        return thumbnail;
    }
    public UserVo setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
	
}

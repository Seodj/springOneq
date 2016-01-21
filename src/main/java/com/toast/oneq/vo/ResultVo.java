package com.toast.oneq.vo;

import java.security.Timestamp;


/**
 * Copyright 2016 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * 결과 정보를 저장하기 위한 VO
 * @author ${email}
 */
public class ResultVo {

	private int i_id;
	private int u_id;
	private String val;
	private Timestamp registered_dt;
	private String referer_host;
	
    public int getI_id() {
        return i_id;
    }
    public ResultVo setI_id(int i_id) {
        this.i_id = i_id;
        return this;
    }
    
    public int getU_id() {
        return u_id;
    }
    public ResultVo setU_id(int u_id) {
        this.u_id = u_id;
        return this;
    }
    
    public String getVal() {
        return val;
    }
    public ResultVo setVal(String val) {
        this.val = val;
        return this;
    }
    
    public Timestamp getRegistered_dt() {
        return registered_dt;
    }
    public ResultVo setRegistered_dt(Timestamp registered_dt) {
        this.registered_dt = registered_dt;
        return this;
    }
    
    public String getReferer_host() {
        return referer_host;
    }
    public ResultVo setReferer_host(String referer_host) {
        this.referer_host = referer_host;
        return this;
    }
}

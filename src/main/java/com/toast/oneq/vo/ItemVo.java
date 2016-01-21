package com.toast.oneq.vo;


/**
 * Copyright 2016 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * 항목 정보를 저장하기 위한 VO
 * @author ${email}
 */
public class ItemVo {

	private int			i_id;
	private String		title;
	private Byte		media_type;
	private String		media_path;
	
    public int getI_id() {
        return i_id;
    }
    public ItemVo setI_id(int i_id) {
        this.i_id = i_id;
        return this;
    }
    
    public String getTitle() {
        return title;
    }
    public ItemVo setTitle(String title) {
        this.title = title;
        return this;
    }
    
    public Byte getMedia_type() {
        return media_type;
    }
    public ItemVo setMedia_type(Byte media_type) {
        this.media_type = media_type;
        return this;
    }
    
    public String getMedia_path() {
        return media_path;
    }
    public ItemVo setMedia_path(String media_path) {
        this.media_path = media_path;
        return this;
    }
	
}

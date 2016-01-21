package com.toast.oneq.vo;

import java.security.Timestamp;
import java.util.ArrayList;


/**
 * Copyright 2016 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * 질문 정보를 저장하기 위한 VO
 * @author ${email}
 */
public class QuestionVo {

	private int				q_id;
	private String			title;
	private String			content;
	private Byte			q_type;
	private int				hit;
	private Byte			media_type;
	private String			media_path;
	private Timestamp		s_dt;
	private Timestamp		e_dt;
	private int				vote_limit;
	private int				vote_num;
	private Timestamp		created_dt;
	private Timestamp		finished_date;
	private ArrayList<ItemVo>	items;
	
	public int getQ_id() {
        return q_id;
    }
    public QuestionVo setQ_id(int q_id) {
        this.q_id = q_id;
        return this;
    }
    
    public String getTitle() {
        return title;
    }
    public QuestionVo setTitle(String title) {
        this.title = title;
        return this;
    }
    
    public String getContent() {
        return content;
    }
    public QuestionVo setContent(String content) {
        this.content = content;
        return this;
    }
    
    public Byte getQ_type() {
        return q_type;
    }
    public QuestionVo setQ_type(Byte q_type) {
        this.q_type = q_type;
        return this;
    }
    
    public int getHit() {
        return hit;
    }
    public QuestionVo setHit(int hit) {
        this.hit = hit;
        return this;
    }
    
    public Byte getMedia_type() {
        return media_type;
    }
    public QuestionVo setMedia_type(Byte media_type) {
        this.media_type = media_type;
        return this;
    }
    
    public String getMedia_path() {
        return media_path;
    }
    public QuestionVo setMedia_path(String media_path) {
        this.media_path = media_path;
        return this;
    }
    
    public Timestamp getS_dt() {
        return s_dt;
    }
    public QuestionVo setS_dt(Timestamp s_dt) {
        this.s_dt = s_dt;
        return this;
    }
    
    public Timestamp getE_dt() {
        return e_dt;
    }
    public QuestionVo setE_dt(Timestamp e_dt) {
        this.e_dt = e_dt;
        return this;
    }
    
    public int getVote_limit() {
        return vote_limit;
    }
    public QuestionVo setVote_limit(int vote_limit) {
        this.vote_limit = vote_limit;
        return this;
    }
    
    public int getVote_num() {
        return vote_num;
    }
    public QuestionVo setVote_num(int vote_num) {
        this.vote_num = vote_num;
        return this;
    }
    
    public Timestamp getCreated_dt() {
        return created_dt;
    }
    public QuestionVo setCreated_dt(Timestamp created_dt) {
        this.created_dt = created_dt;
        return this;
    }
    
    public Timestamp getFinished_date() {
        return finished_date;
    }
    public QuestionVo setFinished_date(Timestamp finished_date) {
        this.finished_date = finished_date;
        return this;
    }
    
    public ArrayList<ItemVo> getItems() {
		return items;
	}
	public void setItems(ArrayList<ItemVo> items) {
		this.items = items;
	}
	public void addItems(ItemVo item) {
		this.items.add(item);
	}
	
}

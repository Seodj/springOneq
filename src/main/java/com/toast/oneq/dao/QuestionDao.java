package com.toast.oneq.dao;

import java.util.ArrayList;

import com.toast.oneq.vo.QuestionVo;

/**
 * Copyright 2016 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * tb_question에 접근할 때 사용하는 DAO
 * @author ${email}
 */
public class QuestionDao extends AbstrctDao {

	/**
	 * 질문을 등록할 때 사용하는 메소드. 추후 여러 질문을 묶을 수 있도록 QuestionVO를 return한다.
	 * @param 
	 * 	question : DB에 insert할 정보를 저장e
	 * @return
	 * 	paramameter question의 못채운 내용(Q_ID)을 채운 값
	 **/
	public QuestionVo registerQuestion(QuestionVo question) {
		
		return null;
	}
	
	 
	/**
	 * 질문의 list를 불러오기 위한 메소드
	 * @param
	 * 	startIndex : 어디서 붙어 가져올지에 대한 index 값
	 * 	endIndex : 어디 까지 가져올지에 대한 index 값
	 * @return
	 * 	정렬된 question중에서 startIndex, endIndex 사이에 있는 값의 ArrayList
	 **/
	public ArrayList<QuestionVo> getQuestions(int startIndex, int endIndex) {
		return null;
	}
	

	/**
	 * 하나의 질문만을 가져오기 위한 메소드
	 * @param 
	 * 	Q_ID : 가져오려는 징문의 Q_ID
	 * @return 
	 * 	Q_ID의 값에 해당하는 징문으로 정보를 넣은 QuestionVO
	 **/
	public QuestionVo getQuestion(int Q_ID) {
		return null;
	}
	

	/**
	 * 유저가 작성한 질문의 개수를 가져오기 위한 메소드
	 * @param 
	 * 	U_ID : 질문의 개수를 가져오려는 유저 아이디
	 * @return 
	 * 	U_ID에 해당하는 유저가 작성한 질문 개수
	 **/
	public int getQuestionCount(int U_ID) {
		return 0;
	}
	

	/**
	 * 유저가 투표한 질문의 개수를 가져오기 위한 메소드
	 * @param
	 * 	U_ID : 투표한 질문의 개수를 가져오려는 유저 아이디
	 * @return
	 * 	U_ID에 해당하는 유저가 작성한 질문 개수
	 **/
	public int getVoteCount(int U_ID) {
		return 0;
	}
	

	/**
	 * 유저 페이지에 리스트를 출력하기위한 메소드. 유저가 작성하였거나 투표한 질문을 출력해준다.
	 * @param 
	 * 	startIndex : 어디서 붙어 가져올지에 대한 index 값
	 * 	endIndex : 어디 까지 가져올지에 대한 index 값
	 * 	U_ID : 어떤 유저의 값을 가져올 건지 정할 U_ID
	 * 	option : 어떤 리스트를 출력할 것인가를 결정하는 옵션 값(ex 1(전부), 2(작성한 글만), 3(참여한 글만))
	 * @return 
	 * 	option에 해당하는 글중 startIndex, endIndex사이에 있는 U_ID의 질문 ArrayList
	 **/
	public ArrayList<QuestionVo> getQuestions(int startIndex, int endIndex, int U_ID, byte option) {
		return null;
	}
	
}

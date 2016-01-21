package com.toast.oneq.dao;

/**
 * Copyright 2016 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * tb_result에 접근하기 위한 DAO
 * @author ${email}
 */
public class ResultDao extends AbstrctDao {

	
	/**
	 * 항목(item)을 선택했을 때 호출되는 메소드
	 * @param 
	 * 	I_ID : 선택한 항목의 ID
	 * 	U_ID : 선택을 한 유저의 ID
	 * @return 
	 * 	
	 **/
	public void clickItem(int I_ID, int U_ID) {
		
	}
	
	
	/**
	 * 항목을 선택했을 때, 선택 처리를 할 메소드
	 * @param 
	 * 	I_ID : 선택한 항목의 ID
	 * 	U_ID : 선택을 한 유저의 ID
	 * @return 
	 * 	
	 **/
	@SuppressWarnings("unused") // clickItem에서 이 메소드 사용후 제거 바람
	private int postResult(int I_ID, int U_ID) {
		return 0;
	}
	
	
	/**
	 * 항목을 선택했을 때, 취소 처리를 할 메소드
	 * @param 
	 * 	I_ID : 선택한 항목의 ID
	 * 	U_ID : 선택을 한 유저의 ID
	 * @return 
	 * 	
	 **/
	@SuppressWarnings("unused") // clickItem에서 이 메소드 사용후 제거 바람
	private int deleteResult(int I_ID, int U_ID) {
		return 0;
	}
	
}
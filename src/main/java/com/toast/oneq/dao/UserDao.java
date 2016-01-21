package com.toast.oneq.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.toast.oneq.vo.UserVo;


/**
 * Copyright 2016 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * tb_user에 접근하기 위한 DAO
 * @author ${email}
 */

@Component
public class UserDao extends AbstrctDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

	/**
	 * 유저를 DB에 저장하기 위한 메소드
	 * @param 
	 * 	user : 저장하기 위한 유저의 정보가 들어있는 UserVO
	 * @return
	 * 	
	 **/	
	public void registerUser(UserVo user) {
	    sqlSessionTemplate.insert("userDao.insertUser",user);
	}
	
	
	/**
	 * 유저의 정보를 가져오기 위한 메소드
	 * @param 
	 * 	U_ID : 정보를 가져오고 싶은 유저의 U_ID
	 * @return 
	 * 	유저의 정보를 tb_user로 부터 읽어와 UserVO로 만들어 return
	 **/
	public UserVo getUserInformation(int U_ID) {
		return null;
	}
	
	
	/**
	 * 인증된 유저인지 확인하기 위한 메소드
	 * @param 
	 * 	U_ID : 확인하고자하는 유저의 U_ID
	 * @return
	 * 	인증이 되어있는 유저일 경우 인증된 유저의 UserVO, 아닐 경우 null을 출력해서 없는 유저임을 알린다.
	 **/
	public UserVo oAuthUser(int U_ID) {
		return null;
	}
	
}

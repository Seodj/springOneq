package com.toast.oneq.dao;

import org.apache.ibatis.session.SqlSession;

/**
 * Copyright 2016 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * 모든 DAO에게 SqlSession을 미리 생성해 전해 주기 위한 DAO
 * @author ${email}
 */
public class AbstrctDao {

	protected SqlSession sqlSession;
	
}

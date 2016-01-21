package com.toast.oneq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toast.oneq.dao.UserDao;
import com.toast.oneq.vo.UserVo;


/**
 * Copyright 2016 NHN Entertainment Corp. All rights Reserved.
 * NHN Entertainment PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * Main Controller
 * @author ${email}
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userdao;
	
	/**
	 * "/"로 접속했을 경우, 처음으로 시작하는 list를 보여주기 위한 메소드
	 * @param ${parameterDescription}
	 * @return 다음으로 옮겨갈 페이지를 return한다.
	 **/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
	    UserVo user = new UserVo().setOauth_id("abca12312311aadd").setU_name("서동진");
	    
	    userdao.registerUser(user);
	    
		return "home";
	}
	

	/**
	 * {U_ID}에 해당하는 user page를 보여주기 위한 메소드
	 * @param ${parameterDescription}
	 * @return 다음으로 옮겨갈 페이지를 return한다.
	 **/
	@RequestMapping(value="/u/{U_ID}", method = RequestMethod.GET)
	public String userView(Model model) {
		return "";
	}
	
	
	/**
	 * {hash_name}에 해당하는 list를 출력하기 위한 메소드
	 * @param ${parameterDescription}
	 * @return 다음으로 옮겨갈 페이지를 return한다.
	 **/
	@RequestMapping(value="/api/h/{hash_name}", method = RequestMethod.GET)
	public String listViewByHash(Model model) {
		return "";
	}
	
	
	/**
	 * {Q_ID}에 해당하는 question을 보여주기 위한 메소드
	 * @param ${parameterDescription}
	 * @return 다음으로 옮겨갈 페이지를 return한다.
	 **/
	@RequestMapping(value="/v/{Q_ID}", method = RequestMethod.GET)
	public String questionView(Model model) {
		return "";
	}
	
	
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
    public String test(Model model) {
        return "home";
    }
	
}

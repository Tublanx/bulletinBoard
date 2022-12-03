package com.tublanx.bulletinBoard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tublanx.bulletinBoard.dao.PostDao;

@Controller
public class PostController {

	@Autowired
	PostDao postDao;

	@GetMapping(value = "/main")
	public String main(Model model) {
		model.addAttribute("posts", postDao.selectList());
		return "main";
	}

	@GetMapping(value = "/main/post_detail")
	public String postDetail(Model model) {
		model.addAttribute("posts", postDao.selectList());
		return "postDetail";
	}
	
	@GetMapping(value = "/main/new")
	public String newPost() {
		return "newPost";
	}
	
	@GetMapping(value = "/settings")
	public String setting() {
		return "setting";
	}

}

package com.tublanx.bulletinBoard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tublanx.bulletinBoard.dao.PostDao;
import com.tublanx.bulletinBoard.domain.PostVO;

@RestController
public class PostController {

	@Autowired
	PostDao postDao;

	@GetMapping(value = "/main")
	public List<PostVO> main() {
		List<PostVO> postList = postDao.selectList();
		return postList;
	}

}

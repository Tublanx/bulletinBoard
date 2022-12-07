package com.tublanx.bulletinBoard.serviceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import com.tublanx.bulletinBoard.dao.PostDao;
import com.tublanx.bulletinBoard.domain.PostVO;
import com.tublanx.bulletinBoard.dto.PostDto;
import com.tublanx.bulletinBoard.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostDao postDao;

	@Override
	public List<PostVO> selectList() {
		return postDao.selectList();
	}

	@Override
	public void addPost(PostDto postDto) {
		postDao.addPost(postDto);
	}

}

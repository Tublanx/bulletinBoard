package com.tublanx.bulletinBoard.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tublanx.bulletinBoard.dao.PostDao;
import com.tublanx.bulletinBoard.domain.PostVO;
import com.tublanx.bulletinBoard.service.PostService;

public class PostServiceImpl implements PostService {

	@Autowired
	PostDao postDao;

	@Override
	public List<PostVO> selectList() {
		return postDao.selectList();
	}

}

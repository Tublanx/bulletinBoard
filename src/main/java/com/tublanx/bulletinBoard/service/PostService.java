package com.tublanx.bulletinBoard.service;

import java.util.List;

import com.tublanx.bulletinBoard.domain.PostVO;

public interface PostService {
	
	public List<PostVO> selectList();
	
}

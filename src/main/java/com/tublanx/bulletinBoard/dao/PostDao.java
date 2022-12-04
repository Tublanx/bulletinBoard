package com.tublanx.bulletinBoard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tublanx.bulletinBoard.domain.PostVO;
import com.tublanx.bulletinBoard.dto.PostDto;

@Mapper
public interface PostDao {

	public List<PostVO> selectList();
	
	public void addPost(PostDto postDto);

}

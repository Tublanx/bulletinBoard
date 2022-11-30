package com.tublanx.bulletinBoard.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tublanx.bulletinBoard.domain.PostVO;

@Mapper
public interface PostDao {

	public List<PostVO> selectList();

}

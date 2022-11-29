package com.tublanx.bulletinBoard.dao;

import java.util.List;

import com.tublanx.bulletinBoard.domain.Post;

public interface PostDao {

	public List<Post> selectList();

}

package com.tublanx.bulletinBoard.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tublanx.bulletinBoard.domain.PostVO;
import com.tublanx.bulletinBoard.dto.PostDto;

@Service
public interface PostService {

	public List<PostVO> selectList();

	public void addPost(PostDto postDto);

	public List<PostDto> getSearchedList(String keyword);

}

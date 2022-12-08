package com.tublanx.bulletinBoard.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public List<PostDto> getSearchedList(String keyword) {
		List<PostVO> postVO = postDao.getSearchedList(keyword);
		List<PostDto> postDtoList = new ArrayList<>();

		if (postVO.isEmpty()) {
			return postDtoList;
		}

		for (var posts : postVO) {
			postDtoList.add(this.convertEntityToDto(posts));
		}

		return postDtoList;
	}
	
	private PostDto convertEntityToDto(PostVO postVO) {
		return PostDto.builder()
				.postNo(postVO.getPostNo())
				.postName(postVO.getPostName())
				.author(postVO.getAuthor())
				.summary(postVO.getSummary())
				.description(postVO.getDescription())
				.createdDate(postVO.getCreatedDate())
				.build();
	}

}

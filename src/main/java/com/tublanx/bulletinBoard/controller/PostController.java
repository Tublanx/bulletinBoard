package com.tublanx.bulletinBoard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tublanx.bulletinBoard.dao.PostDao;
import com.tublanx.bulletinBoard.dto.PostDto;
import com.tublanx.bulletinBoard.service.PostService;

@Controller
public class PostController {

	@Autowired
	PostDao postDao;

	@Autowired
	PostService postService;

	@GetMapping(value = "/main")
	public String main(Model model) {
		model.addAttribute("posts", postDao.selectList());
		return "main";
	}

	@GetMapping(value = "/main/postDetail")
	public ModelAndView postDetail(@RequestParam(value = "postNo") int postNo) {
		ModelAndView mv = new ModelAndView("postDetail");
		PostDto postDto = postDao.selListByNo(postNo);
		mv.addObject("post", postDto);
		return mv;
	}

	@GetMapping(value = "/main/new")
	public String newPost() {
		return "newPost";
	}

	@GetMapping(value = "/cancel")
	public String cancel() {
		return "redirect:/main";
	}

	@GetMapping(value = "/main/search.do")
	public String search(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
		List<PostDto> postDtoList = postService.getSearchedList(keyword);

		model.addAttribute("posts", postDtoList);

		return "main";
	}

	@PostMapping(value = "/main/new/addpost.do")
	public String addPost(PostDto postDto) {
		postService.addPost(postDto);
		return "redirect:/main";
	}

}

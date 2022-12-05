package com.tublanx.bulletinBoard.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tublanx.bulletinBoard.dao.PostDao;
import com.tublanx.bulletinBoard.dto.PostDto;
import com.tublanx.bulletinBoard.service.PostService;

import jakarta.validation.Valid;

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

	@GetMapping(value = "/main/post_detail")
	public String postDetail(Model model) {
		model.addAttribute("posts", postDao.selectList());
		return "postDetail";
	}

	@GetMapping(value = "/main/new")
	public String newPost() {
		return "newPost";
	}

	@GetMapping(value = "/settings")
	public String setting() {
		return "setting";
	}

	@GetMapping(value = "/cancel")
	public String cancel() {
		return "redirect:/main";
	}

	@PostMapping(value = "/main/new/addpost.do")
	public String addPost(@Valid PostDto postDto, Errors errors, Model model) {
		
		if (errors.hasErrors()) {
			model.addAttribute("postDto", postDto);
			
			return "newPost";
		}

		postService.addPost(postDto);
		return "redirect:/main";
	}

}

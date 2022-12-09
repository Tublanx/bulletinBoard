package com.tublanx.bulletinBoard.dto;

import java.time.LocalDateTime;

import lombok.Builder;

public class PostDto {

	private Long postNo;

	private String postName;

	private String author;

	private String summary;

	private String description;

	private LocalDateTime createdDate;

	private LocalDateTime modifiedDate;

	public PostDto() {
	}

	public Long getPostNo() {
		return postNo;
	}

	public void setPostNo(Long postNo) {
		this.postNo = postNo;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(LocalDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Builder
	public PostDto(Long postNo, String postName, String author, String summary, String description,
			LocalDateTime createdDate, LocalDateTime modifiedDate) {
		this.postNo = postNo;
		this.postName = postName;
		this.author = author;
		this.summary = summary;
		this.description = description;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

}

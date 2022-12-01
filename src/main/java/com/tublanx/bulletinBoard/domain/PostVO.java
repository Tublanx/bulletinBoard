package com.tublanx.bulletinBoard.domain;

import java.time.LocalDateTime;

public class PostVO {

	private Long postNo;

	private String postName;

	private String author;

	private LocalDateTime createdDate;

	private LocalDateTime modifiedDate;

	public Long getPostNo() {
		return postNo;
	}

	public String getPostName() {
		return postName;
	}

	public String getAuthor() {
		return author;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public LocalDateTime getModifiedDate() {
		return modifiedDate;
	}

}

package com.file.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fileupload")
public class FileModel {
                    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;                                 
	@Column(name="content")
	private byte[] content;
	@Column(name="name")
	private String name;
	@Column(name="fileType")
	private String fileType;
	
	public FileModel() {
		super();
	}
	public FileModel(byte[] content, String name, String fileType) {
		super();
		this.content = content;
		this.name = name;
		this.fileType = fileType;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
}
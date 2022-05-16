package com.file.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.file.example.repository.FileRepo;

@Controller
public class FileController {
	
	@Autowired
	FileRepo fileRepo;

	@RequestMapping("/")
	public String getUploadPage() {
		return "UploadFile";
	}
	@RequestMapping("/saveData")
	@ResponseBody
	
	
}

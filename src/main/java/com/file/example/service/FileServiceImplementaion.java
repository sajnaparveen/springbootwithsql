package com.file.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.file.example.model.FileModel;
import com.file.example.repository.FileRepo;

@Service
public class FileServiceImplementaion  {

	@Autowired
	FileRepo fileRepo;
	
	public void saveFile(FileModel filemodel) {
		fileRepo.save(filemodel);
	}
	public List<FileModel> getAllFile() {
		return fileRepo.findAll();
	}
	public FileModel getFile(Long id) {
		return fileRepo.findById(id).get();
	}
}

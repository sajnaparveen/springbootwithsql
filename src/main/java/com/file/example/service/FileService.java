package com.file.example.service;

import java.util.List;

import com.file.example.model.FileModel;

public interface FileService {

	public void saveFile(FileModel fileModel);
	List<FileModel>getAllFile();
	FileModel getFile(Long id);
}

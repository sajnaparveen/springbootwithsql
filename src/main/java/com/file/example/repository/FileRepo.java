package com.file.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.file.example.model.FileModel;

@Repository
public interface FileRepo extends JpaRepository<FileModel,Long> {

}

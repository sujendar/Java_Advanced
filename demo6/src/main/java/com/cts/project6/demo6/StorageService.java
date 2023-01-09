package com.cts.project6.demo6;

import org.springframework.web.multipart.MultipartFile;

public interface StorageService {

	void store(MultipartFile file);
	
	void init();
	
	void deleteAll();
}

package com.cts.project6.demo6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class StrorageServiceImpl implements StorageService {

	@Override
	public void store(MultipartFile file) {
		
		String fileName = file.getOriginalFilename();
	    String folderPath = "C:\\Users\\2233220";
	    String filePath = folderPath + File.separator + fileName;
	    
	    // Copies Spring's multipartfile inputStream to /sismed/temp/exames (absolute path)
	    try {
			Files.copy(file.getInputStream(), Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	    
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}

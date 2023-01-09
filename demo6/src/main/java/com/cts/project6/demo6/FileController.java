package com.cts.project6.demo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
public class FileController {

	private final StorageService storageService;
      
      @Autowired
  	public FileController(StorageService storageService) {
  		this.storageService = storageService;
  	}
@GetMapping("/")
public String getHtml() {
	return "Form";
}
      
      @PostMapping("/")
  	public String handleFileUpload(@RequestParam("file") MultipartFile file,
  			RedirectAttributes redirectAttributes) {

  		storageService.store(file);
  		redirectAttributes.addFlashAttribute("message",
  				"You successfully uploaded " + file.getOriginalFilename() + "!");

  		return "redirect:/";
  	}
}

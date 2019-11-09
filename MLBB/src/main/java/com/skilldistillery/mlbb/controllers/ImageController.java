package com.skilldistillery.mlbb.controllers;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.mlbb.data.Image;

@Controller
public class ImageController {

	@Autowired
	ServletContext context;

	@RequestMapping(value = "fileUpload.do", method = RequestMethod.GET)
	public ModelAndView fileUploadPage() {
		Image file = new Image();
		ModelAndView modelAndView = new ModelAndView("fileUploadPage.do", "command", file);
		return modelAndView;
	}

	@RequestMapping(value = "fileUploadPage.do", method = RequestMethod.POST)
	public String fileUpload(@Validated Image image, BindingResult result, ModelMap model) throws IOException {
		if (result.hasErrors()) {
			System.out.println("validation errors");
			return "fileUploadPage";
		} else {
			System.out.println("Fetching file");
			MultipartFile multipartFile = image.getFile();
			String uploadPath = context.getRealPath("") + File.separator + "temp" + File.separator;
			// Now do something with file...
			FileCopyUtils.copy(image.getFile().getBytes(),
					new File(uploadPath + image.getFile().getOriginalFilename()));
			String fileName = multipartFile.getOriginalFilename();
			model.addAttribute("fileName", fileName);
			return "success";
		}
	}
}

package com.leyou.item.controller;


import com.leyou.item.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/uploadController/")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @RequestMapping("up")
    @ResponseBody
    public void uploadImg(@RequestParam("file") MultipartFile file){
        try {
            Boolean result = uploadService.upload(file);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.leyou.item.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Service
public class UploadService {

    private static List<String> imgTypes = Arrays.asList("image/png", "image/jpeg");

    private static String BasePath = "D:\\upload";

    public Boolean upload(MultipartFile file) throws Exception {

        String contentType = file.getContentType();
        if(!imgTypes.contains(contentType)){
            throw new Exception("error type of image");
        }
        if(file.isEmpty()){
            throw new Exception("empty of image");
        }
        File dir = new File(BasePath);
        if (!dir.exists()) {
            dir.mkdir();
        }
        file.transferTo(new File(dir,file.getOriginalFilename()));
        System.out.println(file.getOriginalFilename()+"============");
        return true;
    }
}

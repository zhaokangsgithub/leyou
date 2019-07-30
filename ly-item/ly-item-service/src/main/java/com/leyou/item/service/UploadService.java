package com.leyou.item.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class UploadService {

    private static List<String> imgTypes = Arrays.asList("image/png", "image/jpeg");

    private static String BasePath = "D:\\upload";

    public Boolean upload(MultipartFile file) {

        String contentType = file.getContentType();
        if(!imgTypes.contains(contentType)){
            System.out.println("error");
            return false;
        }
        if(file.isEmpty()){
            System.out.println("error");
            return false;
        }
        File dir = new File(BasePath);
        if (!dir.exists()) {
            dir.mkdir();
        }
        try {
            file.transferTo(new File(dir,file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        System.out.println(file.getOriginalFilename()+"============");
        return true;
    }
}

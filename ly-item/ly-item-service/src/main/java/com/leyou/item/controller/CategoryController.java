package com.leyou.item.controller;


import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/category/")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("list")
    @ResponseBody
    public List<Category> getCategoryList(Long pid, HttpServletRequest request, HttpServletResponse response) {

        String origin = request.getHeader("Origin");
        if("http://manage.leyou.com".equals(origin)){
            response.setHeader("Access-Control-Allow-Origin","http://manage.leyou.com");
            response.setHeader("Access-Control-Allow-Credentials","true");
        }

        return  categoryService.queryCategoryList(pid);
    }
}

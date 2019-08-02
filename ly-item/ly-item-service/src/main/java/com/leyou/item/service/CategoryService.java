package com.leyou.item.service;

import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryList(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
      return   categoryMapper.select(category);
    }
}

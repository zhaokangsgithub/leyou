package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface CategoryMapper {

    List<Category> findCategoryByPId(Long pid);
}

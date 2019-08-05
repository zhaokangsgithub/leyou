package com.leyou.item.mapper;

import com.leyou.item.pojo.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface CategoryMapper {

    List<Category> findCategoryByPId(Long pid);

    List<Category> queryNameByIds(@Param("ids")List<Long> ids);
}

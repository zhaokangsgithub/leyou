package com.leyou.item.mapper;

import com.leyou.item.pojo.SpuBo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/8/5.
 */
@Repository
public interface GoodsMapper {

    List<SpuBo> findByPage(@Param("start")int start,
                           @Param("end")int end,
                           @Param("saleable")Boolean saleable,
                           @Param("key")String key);
}

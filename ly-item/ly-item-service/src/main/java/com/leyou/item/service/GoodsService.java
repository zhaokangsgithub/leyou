package com.leyou.item.service;

import com.github.pagehelper.PageHelper;
import com.leyou.common.utils.pojo.PageResult;
import com.leyou.item.mapper.GoodsMapper;
import com.leyou.item.pojo.Category;
import com.leyou.item.pojo.SpuBo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2019/8/5.
 */
@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private CategoryService categoryService;

    public PageResult<SpuBo> querySpuPage(Integer page, Integer rows, Boolean saleable, String key) {

        PageResult<SpuBo> result = new PageResult<>();

        int pageNow = (page - 1) * rows;
        int pageSize = page * rows;
        List<SpuBo> lists = goodsMapper.findByPage(pageNow, pageSize,saleable,key);
        lists = lists.stream().map(spuBo -> {

            List<String> names = this.categoryService.queryNameByIds(
                    Arrays.asList(spuBo.getCid1(), spuBo.getCid2(), spuBo.getCid3()));
            spuBo.setCname(StringUtils.join(names, "/"));
            return spuBo;
        }).collect(Collectors.toList());

        return new PageResult<>(Long.valueOf(lists.size()), lists);
    }
}

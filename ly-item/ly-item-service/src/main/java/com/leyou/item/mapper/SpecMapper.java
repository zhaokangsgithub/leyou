package com.leyou.item.mapper;

import com.leyou.item.pojo.Group;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2019/8/1.
 */
@Repository
public interface SpecMapper
{
    List<Group> findGroupByCid(Long cid);

    int addSpecGroup(Group group);
}

package com.leyou.item.service;

import com.leyou.item.mapper.SpecMapper;
import com.leyou.item.pojo.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Administrator on 2019/8/1.
 */
@Service
public class SpecService {

    @Autowired
    private SpecMapper specMapper;

    public List<Group> getGroupByCid(Long cid) {

        return specMapper.findGroupByCid(cid);

    }

    public int addSpecGroup(Group group)
    {
        int id = specMapper.addSpecGroup(group);
        return id;
    }
}

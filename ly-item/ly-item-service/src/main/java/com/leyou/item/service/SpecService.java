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

    public void addOrUpdateGroup(Group group) {

        Long id = group.getId();
        if(id == null){
            specMapper.addGroup(group);
        }else{
            specMapper.updateGroup(group);
        }
    }
}

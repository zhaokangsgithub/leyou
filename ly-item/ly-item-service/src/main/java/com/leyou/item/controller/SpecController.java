package com.leyou.item.controller;

import com.leyou.item.pojo.Group;
import com.leyou.item.service.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/8/1.
 */
@Controller
@RequestMapping("/spec/")
public class SpecController {

    @Autowired
    private SpecService specService;

    @RequestMapping("groups/{cid}")
    @ResponseBody
    public List<Group> getGroupByCid(@PathVariable("cid")Long cid) {

        List<Group>  groups=  specService.getGroupByCid(cid);
        return groups;
    }

}

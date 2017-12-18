package com.taotao.controller;

import com.taotao.common.pojo.EUTreeNode;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品分类管理
 */

@Controller
@RequestMapping(value = "/item/cat")
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<EUTreeNode> getItemCatList(@RequestParam(value = "id", defaultValue = "0")Long parentId){
        List<EUTreeNode> list = itemCatService.getCatList(parentId);
        return list;
    }
}

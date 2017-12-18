package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 页面跳转Controller
 */
@Controller
public class PageController {

    /**
     * 打开首页
     */
    @RequestMapping(value = "/")
    public String showIndex(){
        return "index";
    }

    /**
     * 展示其他页面
     */
    @RequestMapping(value = "/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}

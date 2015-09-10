package com.bestpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: tomp
 * Date: 14-9-9
 * Time: 下午4:03
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class CheckpreloadController {

    @RequestMapping("/checkpreload.htm")
    public @ResponseBody String checkpreload() {
        return "success";
    }
}

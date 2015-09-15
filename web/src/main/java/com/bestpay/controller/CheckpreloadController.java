package com.bestpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: tomp
 * Date: 14-9-9
 * Time: 下午4:03
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class CheckpreloadController {

    @RequestMapping("/login")
    public @ResponseBody String login(HttpSession session) {
        session.setAttribute("name", "tomp");
        return "success";
    }

    @RequestMapping("/checkpreload.htm")
    public @ResponseBody String checkpreload(HttpSession session) {
        return (String) session.getAttribute("name");
    }
}

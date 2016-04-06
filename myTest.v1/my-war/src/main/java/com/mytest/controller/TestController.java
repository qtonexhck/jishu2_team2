package com.mytest.controller;

import cn.thinkjoy.cloudstack.dynconfig.DynConfigClient;
import cn.thinkjoy.cloudstack.dynconfig.DynConfigClientFactory;
import com.mytest.business.model.Criteria;
import com.mytest.business.model.TUser;
import com.mytest.business.service.TUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huangshengqing on 2016/3/14.
 *
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

//    @Autowired
//    UserService userService;
//
//    @ResponseBody
//    @RequestMapping(value = "/test01")
//    public Object test01(HttpServletRequest request, HttpServletResponse response) {
//        HashMap<String, Object> map = new HashMap<String, Object>();
//        DynConfigClient dynConfigClient = DynConfigClientFactory.getClient();
//
//        try {
//
//            //insertdemo
//            User user=new User();
//            user.setName("李四");
//            user.setPassword("123456");
//            user.setBrithday(new Date());
////            userService.insertSelective(user);
//
//            //selectdemo
//            Criteria criteria=  new Criteria();
////            criteria.put("name_greater","%李四%");
//
//            map.put("user",userService.selectByExample(criteria));
//            //通过zookeeper获取配置文件
//            logger.info(dynConfigClient.getConfig("common", "redisip"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return map;
//    }

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TUserService TUserService;

    @ResponseBody
    @RequestMapping(value = "/test01")
    public String test01(String phonenumber) {


        return "hello world"+phonenumber;
    }
    @ResponseBody
    @RequestMapping(value = "/user")
    public Object test02() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        DynConfigClient dynConfigClient = DynConfigClientFactory.getClient();
        try {

            //insertdemo
            TUser user=new TUser();
            user.setName("李四");
//            userService.insertSelective(user);

            //selectdemo
            Criteria criteria=  new Criteria();
            criteria.put("name","%三%");

            map.put("user", TUserService.selectByExample(criteria));
            //通过zookeeper获取配置文件
            logger.info(dynConfigClient.getConfig("common", "redisip"));
        } catch (Exception e) {
            e.printStackTrace();
        }


        return map;
    }
}

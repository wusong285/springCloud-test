package com.kydata.web;

import com.kydata.util.HttpUrlGet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 类描述：
 *
 * @author 吴松   song_wu
 * @date 2018/6/7 11:38
 * @updateRemark 修改备注：
 */
@RestController
public class testController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(){
        String url = "http://localhost:8762/test";
        return  HttpUrlGet.sendPost(url,"name=tt",false);
    }


    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello1(){
        String url = "http://localhost:8762/test";
        return  HttpUrlGet.sendPost(url,"name=tt",false);
    }


    @RequestMapping(value = "/test")
    String test(){
        String url = "http://localhost:8764/claGrade";
        return  HttpUrlGet.sendGet(url,"");
    }

}

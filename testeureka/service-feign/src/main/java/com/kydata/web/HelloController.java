package com.kydata.web;

import com.kydata.service.HelloService;
import com.kydata.service.SidecarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @author 吴松   song_wu
 * @date 2018/5/31 13:53
 * @updateRemark 修改备注：
 */
@RestController
public class HelloController {

    //@Autowired
    //HelloService helloService;

    @Autowired
    SidecarService sidecarService;

    //@RequestMapping(value = "/test",method = RequestMethod.GET)
    //public String test(@RequestParam String name){
    //    return helloService.testService(name);
    //}

    @RequestMapping(value = "/claGrade",method = RequestMethod.GET)
    public String claGrade(){
        return sidecarService.getClaGrade();
    }
}

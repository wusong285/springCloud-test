package com.kydata.action;

import com.kydata.server.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @author 吴松   song_wu
 * @date 2018/5/28 16:57
 * @updateRemark 修改备注：
 */
@RestController
public class HiController {

    @Autowired
    ScheduleServiceHi scheduleServiceHi;

    @RequestMapping(value = "/hi" , method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return scheduleServiceHi.sayHiFromClientOne(name);
    }
}

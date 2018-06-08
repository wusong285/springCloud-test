package com.kydata.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类描述：
 *
 * @author 吴松   song_wu
 * @date 2018/5/28 16:50
 * @updateRemark 修改备注：
 */
@Component
@FeignClient( value = "service-hi",fallback = ScheduleServiceHiHysteric.class)
public interface ScheduleServiceHi {

    @RequestMapping(value = "/hi" , method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}

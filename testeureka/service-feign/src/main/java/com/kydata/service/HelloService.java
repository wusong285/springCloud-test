package com.kydata.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类描述：
 *
 * @author 吴松   song_wu
 * @date 2018/5/31 13:56
 * @updateRemark 修改备注：
 */
@Component
@FeignClient(value = "service-test", fallback =HelloServiceImpl.class )
public interface HelloService {

    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    String testService(@RequestParam(value = "name") String name);
}

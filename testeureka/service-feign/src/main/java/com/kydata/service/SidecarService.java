package com.kydata.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 类描述：
 *
 * @author 吴松   song_wu
 * @date 2018/6/7 10:15
 * @updateRemark 修改备注：
 */
@Component
@FeignClient(value = "service-sidecar")
public interface SidecarService {

    @RequestMapping(value = "/zdkyw/server/sidecar_test.action" , method = RequestMethod.GET)
    String getClaGrade();
}

package com.kydata.server;

import org.springframework.stereotype.Component;

/**
 * 类描述：
 *
 * @author 吴松   song_wu
 * @date 2018/5/28 17:24
 * @updateRemark 修改备注：
 */
@Component
public class ScheduleServiceHiHysteric implements ScheduleServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "hi "+name+" , Sorry An Error occurred !";
    }
}

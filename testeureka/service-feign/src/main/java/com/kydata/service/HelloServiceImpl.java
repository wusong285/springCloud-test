package com.kydata.service;

import org.springframework.stereotype.Component;

/**
 * 类描述：
 *
 * @author 吴松   song_wu
 * @date 2018/5/31 16:08
 * @updateRemark 修改备注：
 */
@Component
public class HelloServiceImpl implements HelloService {


    @Override
    public String testService(String name) {
        return "sorry,  an error occurrence";
    }
}

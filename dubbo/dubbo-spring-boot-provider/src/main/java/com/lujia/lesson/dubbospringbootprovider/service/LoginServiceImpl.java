package com.lujia.lesson.dubbospringbootprovider.service;

import com.lujia.lesson.dubbo.ILoginService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author :lujia
 * @date :2021/2/21  19:00
 */
@DubboService
public class LoginServiceImpl implements ILoginService {
    @Override
    public String login(String userName, String password) {
        return "success";
    }
}

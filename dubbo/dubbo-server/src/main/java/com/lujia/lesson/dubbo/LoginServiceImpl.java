package com.lujia.lesson.dubbo;

/**
 * @author :lujia
 * @date :2021/2/20  18:53
 */
public class LoginServiceImpl implements ILoginService {
    @Override
    public String login(String userName, String password) {
        return "success";
    }
}

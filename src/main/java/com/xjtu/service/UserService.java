package com.xjtu.service;

import com.xjtu.bean.User;
import com.xjtu.common.CommonResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LeonTao on 2018/1/21.
 */
@Service
public interface UserService {
    public CommonResponse<List<User>> getUsers();

    public CommonResponse addUser(User user);

    public CommonResponse<User> getUserById(Integer id);

    public CommonResponse<User> updateUser(User user);
}

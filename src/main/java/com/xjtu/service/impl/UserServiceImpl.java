package com.xjtu.service.impl;

import com.google.common.collect.Lists;
import com.xjtu.Repository.UserRepository;
import com.xjtu.bean.User;
import com.xjtu.common.CommonResponse;
import com.xjtu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LeonTao on 2018/1/21.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    /**
     * 返回用户列表
     *
     * @return
     */
    @Override
    public CommonResponse<List<User>> getUsers() {

        return CommonResponse.getSuccessResponse(userRepository.findAll());

//        List<User> userList = Lists.newArrayList();
//        userList.add(new User(1, "abc", 12));
//        userList.add(new User(2, "bcd", 15));
//
//        CommonResponse<List<User>> commonResponse = CommonResponse.getSuccessResponse(userList);
//
//        return commonResponse;
    }

    /**
     * 增加
     * @param user
     * @return
     */
    @Override
    public CommonResponse addUser(User user) {
        userRepository.save(user);
        return CommonResponse.getSuccessResponse(null);
    }

    /**
     * id查找
     * @param id
     * @return
     */
    @Override
    public CommonResponse<User> getUserById(Integer id) {
        return CommonResponse.getSuccessResponse(userRepository.findOne(id));
    }

    /**
     * 更新
     *
     * @param user
     * @return
     */
    @Override
    public CommonResponse<User> updateUser(User user) {

        return CommonResponse.getSuccessResponse(userRepository.save(user));
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @Override
    public CommonResponse deleteUserById(Integer id) {
        userRepository.delete(id);
        return CommonResponse.getSuccessResponse(null);
    }
}

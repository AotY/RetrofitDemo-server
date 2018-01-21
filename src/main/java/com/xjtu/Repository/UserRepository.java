package com.xjtu.Repository;

import com.xjtu.bean.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by LeonTao on 2018/1/21.
 */
public interface UserRepository  extends CrudRepository<User, Integer>{

    List<User> findByAge(Integer age);
}

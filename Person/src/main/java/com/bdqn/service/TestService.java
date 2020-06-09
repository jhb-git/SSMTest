package com.bdqn.service;

import com.bdqn.pojo.test;

import java.util.List;

public interface TestService {
    /**
     * 使用List集合查询数据
     * @return
     */
    public List<test> findAll();

    public Integer TestAdd(test Test);

    public Integer TestDelete(Integer id);
}

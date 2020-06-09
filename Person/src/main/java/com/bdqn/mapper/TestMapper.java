package com.bdqn.mapper;

import com.bdqn.pojo.test;

import java.util.List;

public interface TestMapper {
    /**
     * 使用List集合查询数据
     * @return
     */
        public List<test> findAll();

    /**
     * 增加数据
     * @param Tset
     * @return 受影响行数
     */
    public Integer TestAdd(test Tset);

    public Integer TestDelete(Integer id);


}

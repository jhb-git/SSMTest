package com.bdqn.service;

import com.bdqn.mapper.TestMapper;
import com.bdqn.pojo.test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TestServiceImpl  implements TestService {
    @Resource
    private TestMapper mapper;
    @Override
    public List<test> findAll() {
        return mapper.findAll();
    }

    @Override
    public Integer TestAdd(test Test) {
        return mapper.TestAdd(Test);
    }

    @Override
    public Integer TestDelete(Integer id) {
        return mapper.TestDelete(id);
    }
}

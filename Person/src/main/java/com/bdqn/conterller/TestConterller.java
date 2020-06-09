package com.bdqn.conterller;

import com.bdqn.pojo.test;
import com.bdqn.service.TestService;
import com.sun.org.apache.bcel.internal.generic.IRETURN;
import com.sun.tools.corba.se.idl.IncludeGen;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TestConterller {
    @Resource
    private TestService testService;
    /*
        使用list集合查询数据
     */
    @RequestMapping("find")
    public String findAll(Model model){
        List<test> list=testService.findAll();
        model.addAttribute("list",list);
        return "findAll";
    }

    /**
     * 跳转到增加页面
     * @return 增加页面的逻辑名称
     */
    @RequestMapping("TestAll")
    public String TestAdd(){
        return "Add";
    }

    /**
     * 增加方法
     * @param session
     * @param tname 姓名
     * @param tsex 性别
     * @param tage 年龄
     * @param tclass 班级
     * @param tdate 入学时间
     * @param tadd 住址
     * @return 判断受影响行数，返回对应的页面
     */
    @RequestMapping("TestAdd")
    public String add(HttpSession session, @RequestParam(value = "tname") String tname,
                      @RequestParam(value = "tsex") String tsex,
                      @RequestParam(value = "tage") Integer tage,
                      @RequestParam(value = "tclass") String tclass,
                      @RequestParam(value = "tdate")String tdate,
                      @RequestParam (value = "tadd") String tadd){
        test test=new test();
        test.setTname(tname);
        test.setTsex(tsex);
        test.setTage(tage);
        test.setTclass(tclass);
        test.setTdate(tdate);
        test.setTadd(tadd);
        Integer result=testService.TestAdd(test);
        if (result>0){
            session.setAttribute("msg","添加成功");
            return "redirect:/find";
        }else{
            session.setAttribute("msg","添加失败");
            return "TestAll";
        }
    }
    @RequestMapping("TestDelete")
    public String delete(Integer id,HttpSession session){


            return "";
        }





}

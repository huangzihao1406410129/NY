package com.ks.ny.controller;

import com.ks.ny.dao.UserDao;
import com.ks.ny.entity.User;
import com.ks.ny.entity.vo.ResultDate;
import com.ks.ny.service.ExcelService;
import com.ks.ny.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping(value = "/ny")
public class IndexController {
    @Autowired
    UserDao userDao;
    @Autowired
    UserService userService;
    @Autowired
    ExcelService excelService;

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    /**
     * 登录页面
     * @return userPage/login.html
     */
    @RequestMapping(value = "/loginPage")
    public String loginPage(){
        return "userPage/login";
    }

    /**
     * 登录
     * @return
     */
    @PostMapping(value = "/login")
    @ResponseBody
    public ResultDate<User> login(String name,String password){
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        return ResultDate.success(user);
    }

    @PostMapping(value = "/inputExcel")
    @ResponseBody
    public ResultDate inputExcel(@RequestParam("file") MultipartFile file,
                                       HttpServletRequest res) throws IOException {
        if (file.isEmpty()){
            return ResultDate.success("空文件");
        }
        return ResultDate.success(excelService.excelParse(file));
    }


}

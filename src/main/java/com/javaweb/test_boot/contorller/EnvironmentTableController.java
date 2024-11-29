package com.javaweb.test_boot.contorller;


import com.javaweb.test_boot.serivce.EnvironmentTableService;
import com.javaweb.test_boot.utils.Result;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.security.interfaces.RSAKey;

@RestController
//@RequestMapping("/environmentTable")
public class EnvironmentTableController {

    @Autowired
    EnvironmentTableService environmentTableService;

    @RequestMapping("/getEnvironmentTable")     // 访问路径查询所有数据
    public Result getEnvironmentTable() {
        return Result.success(environmentTableService.getAll());
    }

    @RequestMapping("/FindEnvironmentTable/{id}")
    public Result FindEnvironmentTable(@PathVariable("id") int id) {
        return Result.success(environmentTableService.selectById(id));
    }




}

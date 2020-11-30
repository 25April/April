package cn.demo.controller;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <功能描述>
 *
 * @author xuli1294844209@qq.com
 * @createTime 2020/11/19
 **/
@RestController
public class DockerController {
    //21
    @GetMapping("/add")
    public String show(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Docker success");
        //new DataSourceProperties().
        return stringBuilder.toString();
    }
}

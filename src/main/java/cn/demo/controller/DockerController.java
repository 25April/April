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
//_-----123-------------123-___------
@RestController
public class DockerController {
    @GetMapping("/show")
    public String show(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Docker success");
        //new DataSourceProperties().
        return stringBuilder.toString();
    }
}

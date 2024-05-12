package com.example.orderserver.controller;

import com.example.orderserver.common.Result;
import com.example.orderserver.service.TbOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YG
 */
@RestController
@RequestMapping("/TbOrder")
public class TbOrderController {
    @Autowired
    private TbOrderService tbOrderService;

    //测试获取数据
    @GetMapping("/getOrder")
    public Result getOrder(@RequestParam Integer id) {
        return Result.success(tbOrderService.getOrder(id));
    }
}

package com.example.orderserver.service;

import com.example.orderserver.domain.TbOrder;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
* @author YG
* @description 针对表【tb_order】的数据库操作Service
* @createDate 2024-05-12 13:54:31
*/
public interface TbOrderService extends IService<TbOrder> {

    //测试获取数据
    Map<String, Object> getOrder(Integer id);
}

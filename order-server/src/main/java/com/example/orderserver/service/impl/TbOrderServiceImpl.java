package com.example.orderserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.orderserver.domain.TbOrder;
import com.example.orderserver.mapper.TbOrderMapper;
import com.example.orderserver.service.TbOrderService;
import com.example.userserver.domain.TbUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
* @author YG
* @description 针对表【tb_order】的数据库操作Service实现
* @createDate 2024-05-12 13:54:31
*/
@Service
@Slf4j
public class TbOrderServiceImpl extends ServiceImpl<TbOrderMapper, TbOrder>
    implements TbOrderService {

    @Autowired
    TbOrderMapper tbOrderMapper;
    @Autowired
    private RestTemplate restTemplate;

    //测试获取数据
    @Override
    public Map<String, Object> getOrder(Integer id) {
        TbOrder tbOrder = tbOrderMapper.selectById(id);
        log.info("tbOrder:{}",tbOrder);
        int userId = tbOrder.getUserId();
        String url = "http://" + "userserver" + "/TbUser/" + userId;
        log.info("url:{}",url);
        TbUser tbUser = restTemplate.getForObject(url, TbUser.class);
        log.info("tbUser:{}",tbUser);
        Map<String,Object> map = new HashMap<>();
        map.put("tbOrder",tbOrder);
        map.put("tbUser",tbUser);
        return map;
    }
}





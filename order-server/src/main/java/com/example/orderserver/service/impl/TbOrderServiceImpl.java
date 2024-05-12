package com.example.orderserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.orderserver.domain.TbOrder;
import com.example.orderserver.service.TbOrderService;
import com.example.orderserver.mapper.TbOrderMapper;
import jakarta.validation.constraints.Size;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


    //测试获取数据
    @Override
    public TbOrder getOrder(Integer id) {
        log.info(String.valueOf(id));
        TbOrder tbOrder = tbOrderMapper.selectById(id);
        log.info(String.valueOf(tbOrder));
        return tbOrder;
    }
}





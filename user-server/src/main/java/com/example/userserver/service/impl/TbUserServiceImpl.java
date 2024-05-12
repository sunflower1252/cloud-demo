package com.example.userserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.userserver.domain.TbUser;
import com.example.userserver.service.TbUserService;
import com.example.userserver.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author YG
* @description 针对表【tb_user】的数据库操作Service实现
* @createDate 2024-05-12 14:15:22
*/
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser>
    implements TbUserService {

    @Autowired
    TbUserMapper tbUserMapper;
    @Override
    public TbUser getTbUser(Integer userid) {
        return tbUserMapper.selectById(userid);
    }
}





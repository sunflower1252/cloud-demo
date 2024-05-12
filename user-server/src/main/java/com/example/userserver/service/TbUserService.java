package com.example.userserver.service;

import com.example.userserver.domain.TbUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author YG
* @description 针对表【tb_user】的数据库操作Service
* @createDate 2024-05-12 14:15:22
*/
public interface TbUserService extends IService<TbUser> {

    TbUser getTbUser(Integer userid);
}

package com.example.userserver.controller;

import com.example.userserver.common.Result;
import com.example.userserver.domain.TbUser;
import com.example.userserver.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author YG
 */
@RestController
@RequestMapping("/TbUser")
public class TbUserController {
    @Autowired
    TbUserService tbUserService;

    @GetMapping("/{userid}")
    public TbUser getTbUser(@PathVariable Integer userid){
        return tbUserService.getTbUser(userid);
    }

}

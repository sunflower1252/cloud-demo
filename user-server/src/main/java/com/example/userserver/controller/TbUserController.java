package com.example.userserver.controller;

import com.example.userserver.domain.TbUser;
import com.example.userserver.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YG
 */
@RestController
@RequestMapping("/TbUser")
public class TbUserController {
    @Autowired
    TbUserService tbUserService;

    @GetMapping("/{userid}")
    public TbUser getTbUser(@PathVariable("userid") Integer userid) {
        return tbUserService.getTbUser(userid);
    }

}

package com.shuai.controller;


import com.shuai.domain.LoginRecord;
import com.shuai.service.ILoginRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 登录信息记录表 前端控制器
 * </p>
 *
 * @author Shuai
 * @since 2025-01-01
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/login-record")
public class LoginRecordController {

    private final ILoginRecordService loginRecordService;

    @GetMapping
    public List<LoginRecord> queryLoginRecordList(){
        return loginRecordService.queryLoginRecordList();
    }

    @GetMapping("userId")
    public List<LoginRecord> queryLoginRecordByUserId(Long userId){
        return loginRecordService.queryLoginRecordByUserId(userId);
    }
}

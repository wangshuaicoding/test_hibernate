package com.shuai.service.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.shuai.dao.LoginRecordDao;
import com.shuai.domain.LoginRecord;
import com.shuai.service.ILoginRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 登录信息记录表 服务实现类
 * </p>
 *
 * @author Shuai
 * @since 2025-01-01
 */
@Service
@RequiredArgsConstructor
public class LoginRecordServiceImpl implements ILoginRecordService {

    private final LoginRecordDao loginRecordDao;
    private final JPAQueryFactory queryFactory;

    @Override
    public List<LoginRecord> queryLoginRecordList() {
        return loginRecordDao.findAll();
    }

    @Override
    public List<LoginRecord> queryLoginRecordByUserId(Long userId) {

        return loginRecordDao.queryLoginRecordByUserId(userId);
    }
}

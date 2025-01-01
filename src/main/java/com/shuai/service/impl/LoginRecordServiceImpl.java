package com.shuai.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.shuai.domain.po.LoginRecord;
import com.shuai.domain.po.QLoginRecord;
import com.shuai.domain.vo.LoginRecordVO;
import com.shuai.repository.LoginRecordRepository;
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

    private final LoginRecordRepository loginRecordRepository;
    private final JPAQueryFactory queryFactory;

    @Override
    public List<LoginRecord> queryLoginRecordList() {
        return loginRecordRepository.findAll();
    }

    @Override
    public List<LoginRecord> queryLoginRecordByUserId(Long userId) {
        // 方式一：调用jpa提供的方法
        // return loginRecordRepository.queryLoginRecordByUserId(userId);

        // 方式二：调用querydsl提供的方法
        QLoginRecord loginRecord = QLoginRecord.loginRecord;
        return queryFactory.select(loginRecord).from(loginRecord).where(loginRecord.userId.eq(userId)).fetch();
    }

    @Override
    public List<LoginRecordVO> queryLoginRecordByUserIdMp(Long userId) {
        List<LoginRecord> loginRecordList = loginRecordRepository.queryLoginRecordByUserId(userId);
        // 方式一：1.56s
        // return MpLoginRecordConvert.INSTANCE.convertList(loginRecordList);
        // 方式二：1.98s
        return BeanUtil.copyToList(loginRecordList, LoginRecordVO.class);
    }
}

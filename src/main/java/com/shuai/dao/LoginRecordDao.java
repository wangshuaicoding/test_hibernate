package com.shuai.dao;

import com.shuai.domain.LoginRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 登录信息记录表 Mapper 接口
 * </p>
 *
 * @author Shuai
 * @since 2025-01-01
 */
@Repository
public interface LoginRecordDao extends JpaRepository<LoginRecord, Long> {

    List<LoginRecord> queryLoginRecordByUserId(Long userId);
}

package com.shuai.repository;

import com.shuai.domain.po.LoginRecord;
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
public interface LoginRecordRepository extends JpaRepository<LoginRecord, Long> {

    List<LoginRecord> queryLoginRecordByUserId(Long userId);
}

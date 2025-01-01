package com.shuai.service;

import com.shuai.domain.po.LoginRecord;
import com.shuai.domain.vo.LoginRecordVO;

import java.util.List;

/**
 * <p>
 * 登录信息记录表 服务类
 * </p>
 *
 * @author Shuai
 * @since 2025-01-01
 */
public interface ILoginRecordService {

    List<LoginRecord> queryLoginRecordList();

    List<LoginRecord> queryLoginRecordByUserId(Long userId);

    List<LoginRecordVO> queryLoginRecordByUserIdMp(Long userId);
}

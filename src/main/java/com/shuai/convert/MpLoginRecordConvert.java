package com.shuai.convert;

import com.shuai.domain.po.LoginRecord;
import com.shuai.domain.vo.LoginRecordVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MpLoginRecordConvert {

    MpLoginRecordConvert INSTANCE = Mappers.getMapper(MpLoginRecordConvert.class);

    List<LoginRecordVO> convertList(List<LoginRecord> loginRecordList);
}

package com.ss.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ss.common.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * @Entity com.ss.api.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}





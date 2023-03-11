package com.ss.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ss.common.model.entity.InterfaceInfo;

/**
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}

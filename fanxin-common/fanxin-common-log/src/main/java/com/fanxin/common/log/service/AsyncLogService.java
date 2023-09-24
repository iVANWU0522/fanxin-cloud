package com.fanxin.common.log.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.fanxin.common.core.constant.SecurityConstants;
import com.fanxin.system.api.RemoteLogService;
import com.fanxin.system.api.domain.SysOperLog;

/**
 * 异步调用日志服务
 * 
 * @author fanxin
 */
@Service
public class AsyncLogService
{
    @Autowired
    private RemoteLogService remoteLogService;

    /**
     * 保存系统日志记录
     */
    @Async
    public void saveSysLog(SysOperLog sysOperLog) throws Exception
    {
        remoteLogService.saveLog(sysOperLog, SecurityConstants.INNER);
    }
}

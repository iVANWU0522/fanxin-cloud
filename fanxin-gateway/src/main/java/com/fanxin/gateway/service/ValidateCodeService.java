package com.fanxin.gateway.service;

import java.io.IOException;
import com.fanxin.common.core.exception.CaptchaException;
import com.fanxin.common.core.web.domain.AjaxResult;

/**
 * 验证码处理
 *
 * @author fanxin
 */
public interface ValidateCodeService
{
    /**
     * 生成验证码
     */
    public AjaxResult createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCaptcha(String key, String value) throws CaptchaException;
}

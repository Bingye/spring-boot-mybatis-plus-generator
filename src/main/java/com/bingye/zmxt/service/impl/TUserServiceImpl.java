package com.bingye.zmxt.service.impl;

import com.bingye.zmxt.entity.TUser;
import com.bingye.zmxt.mapper.TUserMapper;
import com.bingye.zmxt.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author bingye
 * @since 2021-03-02
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}

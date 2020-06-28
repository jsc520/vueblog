package com.kinhub.service.impl;

import com.kinhub.entity.Blog;
import com.kinhub.mapper.BlogMapper;
import com.kinhub.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注公众号：程序猿的月光宝盒
 * @since 2020-06-28
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}

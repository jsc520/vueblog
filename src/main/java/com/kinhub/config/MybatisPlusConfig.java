package com.kinhub.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *  通过@mapperScan注解指定要变成实现类的接口所在的包，
 *  然后包下面的所有接口在编译之后都会生成相应的实现类。
 * @ClassName: MybatisPlusConfig
 * @Date: 2020/6/28 10:52 
 * @Author: 金聖聰
 * @Version: 1.0
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.kinhub.mapper")
public class MybatisPlusConfig {
    /**
     * TODO
     *
     * @return: com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor 是一个分页插件
     * @Author: 金聖聰
     * @Email: jinshengcong@163.com
     * @Date: 2020/6/28 10:58
     **/
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}

package com.example.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @Description: mybatis配置
 * @Author: admin
 * @Date: 2020/9/24 17:58
 */
@Configuration
@EnableTransactionManagement
@Import(DruidDataSourceConfig.class)
@MapperScan("com.example.dao")
public class MybatisConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);//数据源
        sqlSessionFactoryBean.setMapperLocations(resourcePatternResolver.getResources("classpath:mappers/*.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("com.example.po");//别名，让*Mpper.xml实体类映射可以不加上具体包名
        return sqlSessionFactoryBean;
    }
}

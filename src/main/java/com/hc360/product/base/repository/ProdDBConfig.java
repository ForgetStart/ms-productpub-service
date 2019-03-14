package com.hc360.product.base.repository;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

//@Configuration
//@MapperScan(value = "com.hc360.my.dao.prod", sqlSessionTemplateRef = "prodSqlSessionTemplate")
public class ProdDBConfig {

//  @Bean
//  @ConfigurationProperties(prefix = "spring.datasource.proddb")
//  public DataSource prodDataSource() {
//	  return DataSourceBuilder.create().build();
//  }
//
//  @Bean
//  public SqlSessionFactory prodSqlSessionFactory(@Qualifier("prodDataSource") DataSource dataSource) throws Exception {
//    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//    bean.setDataSource(dataSource);
//    //���XMLĿ¼
//    ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//    try {
//      bean.setMapperLocations(resolver.getResources("classpath*:mybatis/mapper/prod/**/*.xml"));
//      return bean.getObject();
//    } catch (Exception e) {
//      e.printStackTrace();
//      throw new RuntimeException(e);
//    }
//  }
//
//  @Bean
//  public SqlSessionTemplate prodSqlSessionTemplate(@Qualifier("prodSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
//    SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory); // ʹ���������õ�Factory
//    return template;
//  }

}
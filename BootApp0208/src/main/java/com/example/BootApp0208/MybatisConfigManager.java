package com.example.BootApp0208;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//원래는 메인클래스에서 작성해도 되지만, 관리목적상 별도의 클래스로분리시켜본다
//스프링의 버전이 올라갈수록 XML-->자바코드에서의 설정
@Configuration
public class MybatisConfigManager {
   // 스프링의 빈을 관리하는 객체
   @Autowired
   private ApplicationContext applicationContext;

   // 레거시 시절 등록했던 mybatis spring에 대한 설정을 여기서 처리
   // SqlSessionFactory,SqlSessionTemplate
   @Bean
   public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
      SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();

      sqlSessionFactory.setDataSource(dataSource);
      // mybatis 설정파일의 위치
      sqlSessionFactory.setConfigLocation(applicationContext.getResource("classpath:com/example/BootApp0208/mybatis/config/config.xml"));
      return sqlSessionFactory.getObject();
   }

   @Bean
   public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
      return new SqlSessionTemplate(sqlSessionFactory);
   }

}
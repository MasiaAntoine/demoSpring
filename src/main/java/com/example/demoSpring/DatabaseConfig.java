package com.example.demoSpring;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.example.demoSpring.repository")
public class DatabaseConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("com.example.demoSpring.model");

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        ((HibernateJpaVendorAdapter) vendorAdapter).setDatabase(Database.POSTGRESQL);

        em.setJpaVendorAdapter(vendorAdapter);

        return em;
    }
}

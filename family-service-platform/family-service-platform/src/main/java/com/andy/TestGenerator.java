package com.andy;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class TestGenerator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();

        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setAuthor("andy-liu")//设置作者
                .setOutputDir("/Users/liuhaobo/CS/Project/family-service-platform/family-service-platform/src/main/java")//设置输出路径
                .setFileOverride(true)//设置文件覆盖
                .setIdType(IdType.AUTO)//设置主键生成策略
                .setServiceName("%sService")//service接口的名称
                .setBaseResultMap(true)//基本结果集合
                .setBaseColumnList(true)//设置基本的列
                .setControllerName("%sController");

        //配置数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver").setUrl("jdbc:mysql://127.0.0.1/family_service_platform?serverTimezone=UTC")
                .setUsername("root").setPassword("lhb280214");

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude()//设置要包含的表
                .setTablePrefix("tbl_")//设置表名的前缀
                .setNaming(NamingStrategy.underline_to_camel);//映射实体类的时候命名的策略

        //包名配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.andy").setMapper("mapper")
                .setService("service").setController("controller")
                .setEntity("bean").setXml("mapper");

        autoGenerator.setGlobalConfig(globalConfig).setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig).setPackageInfo(packageConfig);

        autoGenerator.execute();
    }
}

package com.hanson.mybatis.helper;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.PostgreSqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 代码生成器 ，指定表名自动生成dao层、service层，controller层
 * dao层包括mapper的java类、xml文件， servier包括接口类和空实现类，
 * controller包括对应的controller空实现 对应的模块响应修改包名 以及数据库连接信息即可，指定要生成的表名
 * Created by Hanson on 2019/10/18.
 */
public class AutoGeneratorHelper {

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Veloctiy
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 1.全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D:\\Repositories\\jbpm\\mybatis-poi\\src\\main\\java");//文件输出跟目录
        gc.setAuthor("hanson");
        gc.setFileOverride(true); //是否覆盖
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setSwagger2(true);//生成Swagger注解
        gc.setBaseColumnList(true);// XML columList

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sDao");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 2.数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new PostgreSqlTypeConvert());
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("!Sg2017");
        dsc.setUrl("jdbc:mysql://47.107.174.74:3306/vwork?useUnicode=true&amp&characterEncoding=utf8");//IP：数据库IP
        mpg.setDataSource(dsc);

        // 3.策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategy.setInclude(new String[] {"government", "contact"}); // 需要生成的表

        strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);

        // 4.包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.hanson");
        pc.setModuleName("mybatis");
        pc.setController("controller");
        pc.setEntity("bean");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        pc.setXml("mapper");

        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        mpg.setCfg(cfg);

        // 5.执行生成
        mpg.execute();
    }
}

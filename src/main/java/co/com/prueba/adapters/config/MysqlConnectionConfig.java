package co.com.prueba.adapters.config;

import dev.miku.r2dbc.mysql.MySqlConnectionConfiguration;
import io.r2dbc.pool.ConnectionPool;
import io.r2dbc.spi.ConnectionFactory;

public class MysqlConnectionConfig {


    ConnectionPool buildConnectionConfig(){
        MySqlConnectionConfiguration config = MySqlConnectionConfiguration.builder()
                .host("senior-skills.c1co8qgo0l6y.us-east-1.rds.amazonaws.com")
                .user("ias_dev3")
                .password("dev123456")
                .port(3306)
                .database("test_skillsv3")
                .build();
    }


}




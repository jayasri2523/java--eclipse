package jobiak.web.jsptutorial;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 项目启动类
 * */
@SpringBootApplication
@MapperScan("jobiak.web.jsptutorial.mapper")
public class MainApplication extends SpringBootServletInitializer {
    //SpringBootServletInitializer web启动
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MainApplication.class);
//        return super.configure(application);
    }
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
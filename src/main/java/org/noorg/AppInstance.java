package org.noorg;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StopWatch;

@SpringBootApplication
@Slf4j
public class AppInstance {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        log.info("项目开始启动");

        SpringApplication.run(AppInstance.class, args);

        stopWatch.stop();
        log.info("项目启动成功，耗时：{}ms", stopWatch.getTotalTimeMillis());
    }
}

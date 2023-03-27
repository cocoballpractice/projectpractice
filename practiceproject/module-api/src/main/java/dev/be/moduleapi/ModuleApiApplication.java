package dev.be.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {"dev.be.moduleapi", "dev.be.modulecommon"} // 컴포넌트 스캔 대상 패키지 지정
)
@EntityScan("dev.be.modulecommon.domain") // 엔티티 패키지 지정
@EnableJpaRepositories(basePackages = "dev.be.modulecommon.repositories") // 리포지토리 패키지 지정
public class ModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }

}

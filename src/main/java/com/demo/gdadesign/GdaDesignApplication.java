package com.demo.gdadesign;

import com.demo.gdadesign.gda.repository.GdaRepository;
import com.demo.gdadesign.gda.repository.TestRepository;
import com.demo.gdadesign.gda.repository.UserRepository;
import com.demo.gdadesign.gda.shard.SharedData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@EnableJpaAuditing
@SpringBootApplication
public class GdaDesignApplication implements CommandLineRunner {
    @Resource
    private TestRepository testRepository;
    @Resource
    private UserRepository userRepository;
    @Resource
    private GdaRepository gdaRepository;


    //创建线程池
    public static ExecutorService serverExecutorService = Executors.newFixedThreadPool(30);

    /**
     * 创建线程池
     * 程序启动时会加载里面的内容
     */
    @Override
    public void run(String... args) throws Exception {
        //初始化数据库
        this.initDataSource();
        serverExecutorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("test..");
            }
        });

        //初始化线程
//        serverExecutorService.execute(InitTimerService.New());
    }

    //初始化数据库
    private void initDataSource() {
        SharedData.getSharedData().setTestRepository(this.testRepository);
        SharedData.getSharedData().setUserRepository(this.userRepository);
        SharedData.getSharedData().setGdaRepository(this.gdaRepository);
    }


    public static void main(String[] args) {
        SpringApplication.run(GdaDesignApplication.class, args);
    }

}

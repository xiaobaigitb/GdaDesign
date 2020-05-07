package com.demo.gdadesign.gda.shard;

import com.demo.gdadesign.gda.repository.TestRepository;

public class SharedData {
    private static SharedData sharedData = new SharedData();

    private TestRepository testRepository;

    public static SharedData getSharedData() {
        return sharedData;
    }

    public static void setSharedData(SharedData sharedData) {
        SharedData.sharedData = sharedData;
    }

    public TestRepository getTestRepository() {
        return testRepository;
    }

    public void setTestRepository(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public SharedData() {
    }
}

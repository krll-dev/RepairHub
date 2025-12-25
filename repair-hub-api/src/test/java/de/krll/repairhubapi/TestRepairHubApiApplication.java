package de.krll.repairhubapi;

import org.springframework.boot.SpringApplication;

public class TestRepairHubApiApplication {

  public static void main(String[] args) {
    SpringApplication.from(RepairHubApiApplication::main).with(TestcontainersConfiguration.class).run(args);
  }

}

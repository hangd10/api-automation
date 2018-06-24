package test.java.steps.common;

public class EnvironmentConfig {
  private static APIcHostConfig APIC_DEV_1 = new APIcHostConfig("https://jsonplaceholder.typicode.com", "", "");
  private static APIcHostConfig APIC_DEV_2 = new APIcHostConfig("", "", "");

  public static APIcHostConfig getAPIcHostConfigs() {
    String environment = System.getProperty("env");
    
    if (environment != null) {
      switch (environment.toUpperCase()) {
        case "DEV1" : return APIC_DEV_1;
        case "DEV2" : return APIC_DEV_2;
      }
    } else {
      // look for environment variables for production here ? ? ?
    }
    
    System.out.println("No -Denv set, default to DEV1 environment");
    return APIC_DEV_1;
  }

  
}
package test.java.steps.common;

public class APIcHostConfig {
  private String clientId;
  private String clientSecret;
  private String host;

  public APIcHostConfig(String host, String clientId, String clientSecret) {
    this.host = host;
    this.clientId = clientId;
    this.clientSecret = clientSecret;
  }

  public String getClientId() { return this.clientId; }

  public String getClientSecret() { return this.clientSecret; }

  public String getHost() { return this.host; }
}

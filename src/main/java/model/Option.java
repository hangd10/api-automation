package main.java.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Option implements Serializable
{

  private String description;
  private String code;
  private String amount;
  private String atfault;
  private List<String> relatedQuestions = new ArrayList<String>();
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private final static long serialVersionUID = 3247976607628590466L;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getAtfault() {
    return atfault;
  }

  public void setAtfault(String atfault) {
    this.atfault = atfault;
  }

  public List<String> getRelatedQuestions() {
    return relatedQuestions;
  }

  public void setRelatedQuestions(List<String> relatedQuestions) {
    this.relatedQuestions = relatedQuestions;
  }

  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("description", description).append("code", code).append("amount", amount).append("atfault", atfault).append("relatedQuestions", relatedQuestions).append("additionalProperties", additionalProperties).toString();
  }

}
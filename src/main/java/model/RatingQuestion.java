package main.java.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class RatingQuestion implements Serializable
{

  private String identifier;
  private String objectId;
  private String category;
  private String isChildQuestion;
  private String fieldLabel;
  private String fieldType;
  private String fieldLength;
  private String required;
  private String tooltip;
  private String displayOrder;
  private String hasAdditional;
  private List<Option> options = new ArrayList<Option>();
  private String maxDate;
  private String minDate;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();
  private final static long serialVersionUID = -6145517856518566920L;

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getIsChildQuestion() {
    return isChildQuestion;
  }

  public void setIsChildQuestion(String isChildQuestion) {
    this.isChildQuestion = isChildQuestion;
  }

  public String getFieldLabel() {
    return fieldLabel;
  }

  public void setFieldLabel(String fieldLabel) {
    this.fieldLabel = fieldLabel;
  }

  public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public String getFieldLength() {
    return fieldLength;
  }

  public void setFieldLength(String fieldLength) {
    this.fieldLength = fieldLength;
  }

  public String getRequired() {
    return required;
  }

  public void setRequired(String required) {
    this.required = required;
  }

  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public String getDisplayOrder() {
    return displayOrder;
  }

  public void setDisplayOrder(String displayOrder) {
    this.displayOrder = displayOrder;
  }

  public String getHasAdditional() {
    return hasAdditional;
  }

  public void setHasAdditional(String hasAdditional) {
    this.hasAdditional = hasAdditional;
  }

  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }

  public String getMaxDate() {
    return maxDate;
  }

  public void setMaxDate(String maxDate) {
    this.maxDate = maxDate;
  }

  public String getMinDate() {
    return minDate;
  }

  public void setMinDate(String minDate) {
    this.minDate = minDate;
  }

  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("identifier", identifier).append("objectId", objectId).append("category", category).append("isChildQuestion", isChildQuestion).append("fieldLabel", fieldLabel).append("fieldType", fieldType).append("fieldLength", fieldLength).append("required", required).append("tooltip", tooltip).append("displayOrder", displayOrder).append("hasAdditional", hasAdditional).append("options", options).append("maxDate", maxDate).append("minDate", minDate).append("additionalProperties", additionalProperties).toString();
  }

}
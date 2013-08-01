/**
 *  Copyright 2012 GroupDocs.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.groupdocs.sdk.model;

/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class ConditionInfo {
  private String fieldId = null;
  private Integer pageId = null;
  private String answerId = null;
  private String action = null;
  private String operator = null;
  public String getFieldId() {
    return fieldId;
  }
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public Integer getPageId() {
    return pageId;
  }
  public void setPageId(Integer pageId) {
    this.pageId = pageId;
  }

  public String getAnswerId() {
    return answerId;
  }
  public void setAnswerId(String answerId) {
    this.answerId = answerId;
  }

  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  public String getOperator() {
    return operator;
  }
  public void setOperator(String operator) {
    this.operator = operator;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionInfo {\n");
    sb.append("  fieldId: ").append(fieldId).append("\n");
    sb.append("  pageId: ").append(pageId).append("\n");
    sb.append("  answerId: ").append(answerId).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  operator: ").append(operator).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


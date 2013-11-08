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

import java.util.*;
import com.groupdocs.sdk.model.SignatureDocumentFieldInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class PublicSignatureSignDocumentSignerSettingsInfo {
  private String waterMarkText = null;
  private String waterMarkImage = null;
  private String name = null;
  private Double top = null;
  private Double left = null;
  private Double width = null;
  private Double height = null;
  private String placeSignatureOn = null;
  private String data = null;
  private List<SignatureDocumentFieldInfo> fields = new ArrayList<SignatureDocumentFieldInfo>();
  public String getWaterMarkText() {
    return waterMarkText;
  }
  public void setWaterMarkText(String waterMarkText) {
    this.waterMarkText = waterMarkText;
  }

  public String getWaterMarkImage() {
    return waterMarkImage;
  }
  public void setWaterMarkImage(String waterMarkImage) {
    this.waterMarkImage = waterMarkImage;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Double getTop() {
    return top;
  }
  public void setTop(Double top) {
    this.top = top;
  }

  public Double getLeft() {
    return left;
  }
  public void setLeft(Double left) {
    this.left = left;
  }

  public Double getWidth() {
    return width;
  }
  public void setWidth(Double width) {
    this.width = width;
  }

  public Double getHeight() {
    return height;
  }
  public void setHeight(Double height) {
    this.height = height;
  }

  public String getPlaceSignatureOn() {
    return placeSignatureOn;
  }
  public void setPlaceSignatureOn(String placeSignatureOn) {
    this.placeSignatureOn = placeSignatureOn;
  }

  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  public List<SignatureDocumentFieldInfo> getFields() {
    return fields;
  }
  public void setFields(List<SignatureDocumentFieldInfo> fields) {
    this.fields = fields;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicSignatureSignDocumentSignerSettingsInfo {\n");
    sb.append("  waterMarkText: ").append(waterMarkText).append("\n");
    sb.append("  waterMarkImage: ").append(waterMarkImage).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  top: ").append(top).append("\n");
    sb.append("  left: ").append(left).append("\n");
    sb.append("  width: ").append(width).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("  placeSignatureOn: ").append(placeSignatureOn).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("  fields: ").append(fields).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


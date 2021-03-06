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
import com.groupdocs.sdk.model.JobErrorInfo;
import com.groupdocs.sdk.model.JobOutputDocument;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class JobInputDocument {
  private String status = null;
  private Long proc_date = null;
  private String output_formats = null;
  private List<JobOutputDocument> outputs = new ArrayList<JobOutputDocument>();
  private List<JobErrorInfo> job_errors = new ArrayList<JobErrorInfo>();
  private String actions = null;
  private List<String> supported_output_file_types = new ArrayList<String>();
  private String name = null;
  private Integer version = null;
  private Long size = null;
  private String type = null;
  private String type_str = null;
  private String file_type_str = null;
  private String document_path = null;
  private String access = null;
  private String url = null;
  private String file_type = null;
  private Double id = null;
  private String guid = null;
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  public Long getProc_date() {
    return proc_date;
  }
  public void setProc_date(Long proc_date) {
    this.proc_date = proc_date;
  }

  public String getOutput_formats() {
    return output_formats;
  }
  public void setOutput_formats(String output_formats) {
    this.output_formats = output_formats;
  }

  public List<JobOutputDocument> getOutputs() {
    return outputs;
  }
  public void setOutputs(List<JobOutputDocument> outputs) {
    this.outputs = outputs;
  }

  public List<JobErrorInfo> getJob_errors() {
    return job_errors;
  }
  public void setJob_errors(List<JobErrorInfo> job_errors) {
    this.job_errors = job_errors;
  }

  public String getActions() {
    return actions;
  }
  public void setActions(String actions) {
    this.actions = actions;
  }

  public List<String> getSupported_output_file_types() {
    return supported_output_file_types;
  }
  public void setSupported_output_file_types(List<String> supported_output_file_types) {
    this.supported_output_file_types = supported_output_file_types;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getType_str() {
    return type_str;
  }
  public void setType_str(String type_str) {
    this.type_str = type_str;
  }

  public String getFile_type_str() {
    return file_type_str;
  }
  public void setFile_type_str(String file_type_str) {
    this.file_type_str = file_type_str;
  }

  public String getDocument_path() {
    return document_path;
  }
  public void setDocument_path(String document_path) {
    this.document_path = document_path;
  }

  public String getAccess() {
    return access;
  }
  public void setAccess(String access) {
    this.access = access;
  }

  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  public String getFile_type() {
    return file_type;
  }
  public void setFile_type(String file_type) {
    this.file_type = file_type;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobInputDocument {\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  proc_date: ").append(proc_date).append("\n");
    sb.append("  output_formats: ").append(output_formats).append("\n");
    sb.append("  outputs: ").append(outputs).append("\n");
    sb.append("  job_errors: ").append(job_errors).append("\n");
    sb.append("  actions: ").append(actions).append("\n");
    sb.append("  supported_output_file_types: ").append(supported_output_file_types).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  type_str: ").append(type_str).append("\n");
    sb.append("  file_type_str: ").append(file_type_str).append("\n");
    sb.append("  document_path: ").append(document_path).append("\n");
    sb.append("  access: ").append(access).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  file_type: ").append(file_type).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  guid: ").append(guid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


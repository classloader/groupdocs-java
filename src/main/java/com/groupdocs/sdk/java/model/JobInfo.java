/**
 *  Copyright 2011 Wordnik, Inc.
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
 
package com.groupdocs.sdk.java.model;

import com.wordnik.swagger.runtime.annotations.*;
import java.util.List;


/**
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 * @author ramesh
 *
 */
public class JobInfo extends Object {


    /**
     * 
     */
	 private Double id ;

    /**
     * 
     */
	 private JobDocumentsEntry documents ;

    /**
     * 
     */
	 private String status ;

    /**
     * 
     */
	 private Boolean email_results ;

    /**
     * 
     */
	 private String out_formats ;

    /**
     * 
     */
	 private Long requested_time ;

    /**
     * 
     */
	 private Boolean url_only ;

    /**
     * 
     */
	 private String actions ;


	/**
	 * 
	 * 
	 * 
	 */
	 public Double getId() {
	 	return id;
	 }  
	 
	 public void setId(Double  id) {
	 	this.id = id;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public JobDocumentsEntry getDocuments() {
	 	return documents;
	 }  
	 
	 public void setDocuments(JobDocumentsEntry  documents) {
	 	this.documents = documents;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getStatus() {
	 	return status;
	 }  
	 
	 public void setStatus(String  status) {
	 	this.status = status;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Boolean getEmail_results() {
	 	return email_results;
	 }  
	 
	 public void setEmail_results(Boolean  email_results) {
	 	this.email_results = email_results;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getOut_formats() {
	 	return out_formats;
	 }  
	 
	 public void setOut_formats(String  out_formats) {
	 	this.out_formats = out_formats;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Long getRequested_time() {
	 	return requested_time;
	 }  
	 
	 public void setRequested_time(Long  requested_time) {
	 	this.requested_time = requested_time;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Boolean getUrl_only() {
	 	return url_only;
	 }  
	 
	 public void setUrl_only(Boolean  url_only) {
	 	this.url_only = url_only;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getActions() {
	 	return actions;
	 }  
	 
	 public void setActions(String  actions) {
	 	this.actions = actions;
	 }


}
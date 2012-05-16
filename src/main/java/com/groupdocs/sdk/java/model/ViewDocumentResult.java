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
public class ViewDocumentResult extends Object {


    /**
     * 
     */
	 private String guid ;

    /**
     * 
     */
	 private Double id ;

    /**
     * 
     */
	 private Dimension page_size ;

    /**
     * 
     */
	 private String name ;

    /**
     * 
     */
	 private String doc_type ;

    /**
     * 
     */
	 private String url ;

    /**
     * 
     */
	 private Integer page_count ;

    /**
     * 
     */
	 private Integer version ;


	/**
	 * 
	 * 
	 * 
	 */
	 public String getGuid() {
	 	return guid;
	 }  
	 
	 public void setGuid(String  guid) {
	 	this.guid = guid;
	 }

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
	 public Dimension getPage_size() {
	 	return page_size;
	 }  
	 
	 public void setPage_size(Dimension  page_size) {
	 	this.page_size = page_size;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getName() {
	 	return name;
	 }  
	 
	 public void setName(String  name) {
	 	this.name = name;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getDoc_type() {
	 	return doc_type;
	 }  
	 
	 public void setDoc_type(String  doc_type) {
	 	this.doc_type = doc_type;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getUrl() {
	 	return url;
	 }  
	 
	 public void setUrl(String  url) {
	 	this.url = url;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getPage_count() {
	 	return page_count;
	 }  
	 
	 public void setPage_count(Integer  page_count) {
	 	this.page_count = page_count;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getVersion() {
	 	return version;
	 }  
	 
	 public void setVersion(Integer  version) {
	 	this.version = version;
	 }


}
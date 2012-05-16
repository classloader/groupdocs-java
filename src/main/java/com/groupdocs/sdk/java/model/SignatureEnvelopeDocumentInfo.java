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
public class SignatureEnvelopeDocumentInfo extends Object {


    /**
     * 
     */
	 private Integer order ;

    /**
     * 
     */
	 private String name ;

    /**
     * 
     */
	 private String envelopeId ;

    /**
     * 
     */
	 private Integer originalDocumentPagesCount ;

    /**
     * 
     */
	 private String originalDocumentMD5 ;

    /**
     * 
     */
	 private String documentId ;


	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getOrder() {
	 	return order;
	 }  
	 
	 public void setOrder(Integer  order) {
	 	this.order = order;
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
	 public String getEnvelopeId() {
	 	return envelopeId;
	 }  
	 
	 public void setEnvelopeId(String  envelopeId) {
	 	this.envelopeId = envelopeId;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getOriginalDocumentPagesCount() {
	 	return originalDocumentPagesCount;
	 }  
	 
	 public void setOriginalDocumentPagesCount(Integer  originalDocumentPagesCount) {
	 	this.originalDocumentPagesCount = originalDocumentPagesCount;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getOriginalDocumentMD5() {
	 	return originalDocumentMD5;
	 }  
	 
	 public void setOriginalDocumentMD5(String  originalDocumentMD5) {
	 	this.originalDocumentMD5 = originalDocumentMD5;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getDocumentId() {
	 	return documentId;
	 }  
	 
	 public void setDocumentId(String  documentId) {
	 	this.documentId = documentId;
	 }


}
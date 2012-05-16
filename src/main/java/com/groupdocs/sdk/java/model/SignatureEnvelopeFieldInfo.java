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

import java.util.List;
import java.util.ArrayList;


/**
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 * @author ramesh
 *
 */
public class SignatureEnvelopeFieldInfo extends Object {


    /**
     * 
     */
	 private String check ;

    /**
     * 
     */
	 private Boolean mandatory ;

    /**
     * 
     */
	 private List<Integer> data  =  new ArrayList<Integer>();

    /**
     * 
     */
	 private Integer graphSizeH ;

    /**
     * 
     */
	 private Double textRows ;

    /**
     * 
     */
	 private String id ;

    /**
     * 
     */
	 private Double input ;

    /**
     * 
     */
	 private Double textColumns ;

    /**
     * 
     */
	 private String recipientId ;

    /**
     * 
     */
	 private Double order ;

    /**
     * 
     */
	 private List<SignatureEnvelopeFieldLocationInfo> locations  =  new ArrayList<SignatureEnvelopeFieldLocationInfo>();

    /**
     * 
     */
	 private Double signatureFieldId ;

    /**
     * 
     */
	 private String envelopeId ;

    /**
     * 
     */
	 private String name ;

    /**
     * 
     */
	 private String fillTimeStamp ;

    /**
     * 
     */
	 private String getDataFrom ;

    /**
     * 
     */
	 private Integer graphSizeW ;


	/**
	 * 
	 * 
	 * 
	 */
	 public String getCheck() {
	 	return check;
	 }  
	 
	 public void setCheck(String  check) {
	 	this.check = check;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Boolean getMandatory() {
	 	return mandatory;
	 }  
	 
	 public void setMandatory(Boolean  mandatory) {
	 	this.mandatory = mandatory;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public List<Integer> getData() {
	 	return data;
	 }  
	 
	 public void setData(List<Integer>  data) {
	 	this.data = data;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getGraphSizeH() {
	 	return graphSizeH;
	 }  
	 
	 public void setGraphSizeH(Integer  graphSizeH) {
	 	this.graphSizeH = graphSizeH;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Double getTextRows() {
	 	return textRows;
	 }  
	 
	 public void setTextRows(Double  textRows) {
	 	this.textRows = textRows;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getId() {
	 	return id;
	 }  
	 
	 public void setId(String  id) {
	 	this.id = id;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Double getInput() {
	 	return input;
	 }  
	 
	 public void setInput(Double  input) {
	 	this.input = input;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Double getTextColumns() {
	 	return textColumns;
	 }  
	 
	 public void setTextColumns(Double  textColumns) {
	 	this.textColumns = textColumns;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getRecipientId() {
	 	return recipientId;
	 }  
	 
	 public void setRecipientId(String  recipientId) {
	 	this.recipientId = recipientId;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Double getOrder() {
	 	return order;
	 }  
	 
	 public void setOrder(Double  order) {
	 	this.order = order;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public List<SignatureEnvelopeFieldLocationInfo> getLocations() {
	 	return locations;
	 }  
	 
	 public void setLocations(List<SignatureEnvelopeFieldLocationInfo>  locations) {
	 	this.locations = locations;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Double getSignatureFieldId() {
	 	return signatureFieldId;
	 }  
	 
	 public void setSignatureFieldId(Double  signatureFieldId) {
	 	this.signatureFieldId = signatureFieldId;
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
	 public String getFillTimeStamp() {
	 	return fillTimeStamp;
	 }  
	 
	 public void setFillTimeStamp(String  fillTimeStamp) {
	 	this.fillTimeStamp = fillTimeStamp;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getGetDataFrom() {
	 	return getDataFrom;
	 }  
	 
	 public void setGetDataFrom(String  getDataFrom) {
	 	this.getDataFrom = getDataFrom;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getGraphSizeW() {
	 	return graphSizeW;
	 }  
	 
	 public void setGraphSizeW(Integer  graphSizeW) {
	 	this.graphSizeW = graphSizeW;
	 }


}
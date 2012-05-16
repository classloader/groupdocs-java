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
public class StorageInfoResult extends Object {


    /**
     * 
     */
	 private Long total_space ;

    /**
     * 
     */
	 private Long avail_space ;

    /**
     * 
     */
	 private Integer avail_credits ;

    /**
     * 
     */
	 private Integer doc_credits ;


	/**
	 * 
	 * 
	 * 
	 */
	 public Long getTotal_space() {
	 	return total_space;
	 }  
	 
	 public void setTotal_space(Long  total_space) {
	 	this.total_space = total_space;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Long getAvail_space() {
	 	return avail_space;
	 }  
	 
	 public void setAvail_space(Long  avail_space) {
	 	this.avail_space = avail_space;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getAvail_credits() {
	 	return avail_credits;
	 }  
	 
	 public void setAvail_credits(Integer  avail_credits) {
	 	this.avail_credits = avail_credits;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getDoc_credits() {
	 	return doc_credits;
	 }  
	 
	 public void setDoc_credits(Integer  doc_credits) {
	 	this.doc_credits = doc_credits;
	 }


}
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
public class SignatureFieldsResult extends Object {


    /**
     * 
     */
	 private Integer count ;

    /**
     * 
     */
	 private List<SignatureFieldInfo> fields  =  new ArrayList<SignatureFieldInfo>();


	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getCount() {
	 	return count;
	 }  
	 
	 public void setCount(Integer  count) {
	 	this.count = count;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public List<SignatureFieldInfo> getFields() {
	 	return fields;
	 }  
	 
	 public void setFields(List<SignatureFieldInfo>  fields) {
	 	this.fields = fields;
	 }


}
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
public class DocDocInputSharesInput extends Object {


    /**
     * User GUID
     */
	 private String userId ;

    /**
     * Shares types
     */
	 private String sharesTypes ;

    /**
     * Page index
     */
	 private String pageIndex ;

    /**
     * Page size
     */
	 private String pageSize ;

    /**
     * Order by
     */
	 private String orderBy ;

    /**
     * Order asc
     */
	 private String orderAsc ;


	/**
	 * User GUID
	 * 
	 * 
	 */
	 public String getUserId() {
	 	return userId;
	 }  
	 
	 public void setUserId(String  userId) {
	 	this.userId = userId;
	 }

	/**
	 * Shares types
	 * 
	 * 
	 */
	 public String getSharesTypes() {
	 	return sharesTypes;
	 }  
	 
	 public void setSharesTypes(String  sharesTypes) {
	 	this.sharesTypes = sharesTypes;
	 }

	/**
	 * Page index
	 * 
	 * 
	 */
	 public String getPageIndex() {
	 	return pageIndex;
	 }  
	 
	 public void setPageIndex(String  pageIndex) {
	 	this.pageIndex = pageIndex;
	 }

	/**
	 * Page size
	 * 
	 * 
	 */
	 public String getPageSize() {
	 	return pageSize;
	 }  
	 
	 public void setPageSize(String  pageSize) {
	 	this.pageSize = pageSize;
	 }

	/**
	 * Order by
	 * 
	 * 
	 */
	 public String getOrderBy() {
	 	return orderBy;
	 }  
	 
	 public void setOrderBy(String  orderBy) {
	 	this.orderBy = orderBy;
	 }

	/**
	 * Order asc
	 * 
	 * 
	 */
	 public String getOrderAsc() {
	 	return orderAsc;
	 }  
	 
	 public void setOrderAsc(String  orderAsc) {
	 	this.orderAsc = orderAsc;
	 }


}
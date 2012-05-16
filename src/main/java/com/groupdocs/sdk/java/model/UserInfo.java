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
public class UserInfo extends Object {


    /**
     * 
     */
	 private String nickname ;

    /**
     * 
     */
	 private Long signedupOn ;

    /**
     * 
     */
	 private String pkey ;

    /**
     * 
     */
	 private String lastname ;

    /**
     * 
     */
	 private String firstname ;

    /**
     * 
     */
	 private Boolean news_eanbled ;

    /**
     * 
     */
	 private List<Integer> photo  =  new ArrayList<Integer>();

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
	 private String pswd_salt ;

    /**
     * 
     */
	 private String token ;

    /**
     * 
     */
	 private String primary_email ;

    /**
     * 
     */
	 private Boolean active ;

    /**
     * 
     */
	 private String claimed_id ;

    /**
     * 
     */
	 private Integer storage ;


	/**
	 * 
	 * 
	 * 
	 */
	 public String getNickname() {
	 	return nickname;
	 }  
	 
	 public void setNickname(String  nickname) {
	 	this.nickname = nickname;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Long getSignedupOn() {
	 	return signedupOn;
	 }  
	 
	 public void setSignedupOn(Long  signedupOn) {
	 	this.signedupOn = signedupOn;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getPkey() {
	 	return pkey;
	 }  
	 
	 public void setPkey(String  pkey) {
	 	this.pkey = pkey;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getLastname() {
	 	return lastname;
	 }  
	 
	 public void setLastname(String  lastname) {
	 	this.lastname = lastname;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getFirstname() {
	 	return firstname;
	 }  
	 
	 public void setFirstname(String  firstname) {
	 	this.firstname = firstname;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Boolean getNews_eanbled() {
	 	return news_eanbled;
	 }  
	 
	 public void setNews_eanbled(Boolean  news_eanbled) {
	 	this.news_eanbled = news_eanbled;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public List<Integer> getPhoto() {
	 	return photo;
	 }  
	 
	 public void setPhoto(List<Integer>  photo) {
	 	this.photo = photo;
	 }

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
	 public String getPswd_salt() {
	 	return pswd_salt;
	 }  
	 
	 public void setPswd_salt(String  pswd_salt) {
	 	this.pswd_salt = pswd_salt;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getToken() {
	 	return token;
	 }  
	 
	 public void setToken(String  token) {
	 	this.token = token;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getPrimary_email() {
	 	return primary_email;
	 }  
	 
	 public void setPrimary_email(String  primary_email) {
	 	this.primary_email = primary_email;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Boolean getActive() {
	 	return active;
	 }  
	 
	 public void setActive(Boolean  active) {
	 	this.active = active;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public String getClaimed_id() {
	 	return claimed_id;
	 }  
	 
	 public void setClaimed_id(String  claimed_id) {
	 	this.claimed_id = claimed_id;
	 }

	/**
	 * 
	 * 
	 * 
	 */
	 public Integer getStorage() {
	 	return storage;
	 }  
	 
	 public void setStorage(Integer  storage) {
	 	this.storage = storage;
	 }


}
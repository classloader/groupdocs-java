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

 package com.groupdocs.sdk.java.api;


import com.groupdocs.sdk.java.model.*;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.wordnik.swagger.runtime.annotations.*;
import com.wordnik.swagger.runtime.common.*;
import com.wordnik.swagger.runtime.exception.*;

import java.util.*;
import java.lang.Long;
import java.io.IOException;


/**
 *
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 * @author ramesh
 *
 */
public class PostAPI extends Object {

    private static APIInvoker apiInvoker = null;

	/**
	 * Rename by post
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param fileId  File GUID
     *  @param newName  New name
     *  
	 * @return RenameResponse {@link RenameResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, fileId, newName") 
	 public static RenameResponse RenameByPost(String userId, String fileId, String newName) throws APIException {

		//parse inputs
		String  resourcePath = "/post/file.rename?user_id={userId}&file_id={fileId}&new_name={newName}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "POST";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", APIInvoker.toPathValue(userId));
		}
		if( fileId != null) {
			resourcePath = resourcePath.replace("{fileId}", APIInvoker.toPathValue(fileId));
		}
		if( newName != null) {
			resourcePath = resourcePath.replace("{newName}", APIInvoker.toPathValue(newName));
		}

		
	
		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		RenameResponse responseObject = (RenameResponse) getApiInvoker().deserialize(response, RenameResponse.class);
		return responseObject;		
				
	 }

	/**
	 * Delete by post
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param fileId  File GUID
     *  
	 * @return DeleteResponse {@link DeleteResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, fileId") 
	 public static DeleteResponse DeleteByPost(String userId, String fileId) throws APIException {

		//parse inputs
		String  resourcePath = "/post/file.delete?user_id={userId}&file_id={fileId}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "POST";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", APIInvoker.toPathValue(userId));
		}
		if( fileId != null) {
			resourcePath = resourcePath.replace("{fileId}", APIInvoker.toPathValue(fileId));
		}

		
	
		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		DeleteResponse responseObject = (DeleteResponse) getApiInvoker().deserialize(response, DeleteResponse.class);
		return responseObject;		
				
	 }

	/**
	 * Delete from folder by post
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param path  Path
     *  
	 * @return DeleteResponse {@link DeleteResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, path") 
	 public static DeleteResponse DeleteFromFolderByPost(String userId, String path) throws APIException {

		//parse inputs
		String  resourcePath = "/post/file.delete.in?user_id={userId}&path={path}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "POST";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", APIInvoker.toPathValue(userId));
		}
		if( path != null) {
			resourcePath = resourcePath.replace("{path}", APIInvoker.toPathValue(path));
		}

		
	
		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		DeleteResponse responseObject = (DeleteResponse) getApiInvoker().deserialize(response, DeleteResponse.class);
		return responseObject;		
				
	 }

	/**
	 * Compress by post
	 *
	 * 
	 * 
     * @param userId  User GUID
     *  @param fileId  File GUID
     *  @param archiveType  Archive Type
     *  
	 * @return CompressResponse {@link CompressResponse} 
	 * @throws APIException 
	 */
	 @MethodArgumentNames(value="userId, fileId, archiveType") 
	 public static CompressResponse CompressByPost(String userId, String fileId, String archiveType) throws APIException {

		//parse inputs
		String  resourcePath = "/post/file.compress?user_id={userId}&file_id={fileId}&archive_type={archiveType}";
		resourcePath = resourcePath.replace("{format}","json").replaceAll("\\*", "");
		String method = "POST";
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		if( userId != null) {
			resourcePath = resourcePath.replace("{userId}", APIInvoker.toPathValue(userId));
		}
		if( fileId != null) {
			resourcePath = resourcePath.replace("{fileId}", APIInvoker.toPathValue(fileId));
		}
		if( archiveType != null) {
			resourcePath = resourcePath.replace("{archiveType}", APIInvoker.toPathValue(archiveType));
		}

		
	
		//make the API Call
		String response = getApiInvoker().invokeAPI(resourcePath, method, queryParams, null, headerParams);
        if(response == null || response.length() == 0){
            return null;
        }
		//create output objects if the response has more than one object
		CompressResponse responseObject = (CompressResponse) getApiInvoker().deserialize(response, CompressResponse.class);
		return responseObject;		
				
	 }



    public static APIInvoker getApiInvoker() {
        if(apiInvoker == null){
            apiInvoker = APIInvoker.getApiInvoker();
        }
        return apiInvoker;
    }

    public static void setApiInvoker(APIInvoker invoker) {
        apiInvoker = invoker;
    }

}
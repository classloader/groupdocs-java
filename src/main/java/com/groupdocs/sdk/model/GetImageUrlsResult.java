package com.groupdocs.sdk.model;

import java.util.*;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetImageUrlsResult {
  private List<String> url = new ArrayList<String>();
  public List<String> getUrl() {
    return url;
  }
  public void setUrl(List<String> url) {
    this.url = url;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImageUrlsResult {\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

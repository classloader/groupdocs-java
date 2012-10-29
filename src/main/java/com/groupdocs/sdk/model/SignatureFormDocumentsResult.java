package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.SignatureFormDocumentInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureFormDocumentsResult {
  private List<SignatureFormDocumentInfo> documents = new ArrayList<SignatureFormDocumentInfo>();
  private String formId = null;
  public List<SignatureFormDocumentInfo> getDocuments() {
    return documents;
  }
  public void setDocuments(List<SignatureFormDocumentInfo> documents) {
    this.documents = documents;
  }

  public String getFormId() {
    return formId;
  }
  public void setFormId(String formId) {
    this.formId = formId;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureFormDocumentsResult {\n");
    sb.append("  documents: ").append(documents).append("\n");
    sb.append("  formId: ").append(formId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

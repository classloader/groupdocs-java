package com.groupdocs.sdk.model;

import com.groupdocs.sdk.model.QuestionnaireInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class GetQuestionnaireResult {
  private QuestionnaireInfo questionnaire = null;
  public QuestionnaireInfo getQuestionnaire() {
    return questionnaire;
  }
  public void setQuestionnaire(QuestionnaireInfo questionnaire) {
    this.questionnaire = questionnaire;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetQuestionnaireResult {\n");
    sb.append("  questionnaire: ").append(questionnaire).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

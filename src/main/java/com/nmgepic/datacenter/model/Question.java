package com.nmgepic.datacenter.model;

import java.io.Serializable;

public class Question implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 标题
     *
     * @mbg.generated
     */
    private String title;

    /**
     * A选项
     *
     * @mbg.generated
     */
    private String optionA;

    /**
     * B选项
     *
     * @mbg.generated
     */
    private String optionB;

    /**
     * C选项
     *
     * @mbg.generated
     */
    private String optionC;

    /**
     * D选项
     *
     * @mbg.generated
     */
    private String optionD;

    /**
     * A选项释义
     *
     * @mbg.generated
     */
    private String explainA;

    /**
     * B选项释义
     *
     * @mbg.generated
     */
    private String explainB;

    /**
     * C选项释义
     *
     * @mbg.generated
     */
    private String explainC;

    /**
     * D选项释义
     *
     * @mbg.generated
     */
    private String explainD;

    /**
     * 正确答案
     *
     * @mbg.generated
     */
    private String answer;

    /**
     * 所属工种（workType表外键）
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     * 当前题目所属类型（1：单选题、2：多选题、3：判断题）
     *
     * @mbg.generated
     */
    private Integer topicType;

    /**
     * 所属等级（1：中级、2：高级）
     *
     * @mbg.generated
     */
    private Integer grade;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getExplainA() {
        return explainA;
    }

    public void setExplainA(String explainA) {
        this.explainA = explainA;
    }

    public String getExplainB() {
        return explainB;
    }

    public void setExplainB(String explainB) {
        this.explainB = explainB;
    }

    public String getExplainC() {
        return explainC;
    }

    public void setExplainC(String explainC) {
        this.explainC = explainC;
    }

    public String getExplainD() {
        return explainD;
    }

    public void setExplainD(String explainD) {
        this.explainD = explainD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTopicType() {
        return topicType;
    }

    public void setTopicType(Integer topicType) {
        this.topicType = topicType;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", optionA=").append(optionA);
        sb.append(", optionB=").append(optionB);
        sb.append(", optionC=").append(optionC);
        sb.append(", optionD=").append(optionD);
        sb.append(", explainA=").append(explainA);
        sb.append(", explainB=").append(explainB);
        sb.append(", explainC=").append(explainC);
        sb.append(", explainD=").append(explainD);
        sb.append(", answer=").append(answer);
        sb.append(", type=").append(type);
        sb.append(", topicType=").append(topicType);
        sb.append(", grade=").append(grade);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
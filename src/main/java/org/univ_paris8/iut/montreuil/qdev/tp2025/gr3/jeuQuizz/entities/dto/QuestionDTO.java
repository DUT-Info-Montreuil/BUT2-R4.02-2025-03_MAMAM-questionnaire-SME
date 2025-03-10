package org.univ_paris8.iut.montreuil.qdev.tp2025.gr3.jeuQuizz.entities.dto;

import java.util.Objects;

public class QuestionDTO {

    private String question;
    private String reponse;

    public QuestionDTO() {
    }

    public String getReponse() {
        return reponse;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "question='" + question + '\'' +
                ", reponse='" + reponse + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuestionDTO that)) return false;
        return Objects.equals(question, that.question) && Objects.equals(reponse, that.reponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, reponse);
    }
}

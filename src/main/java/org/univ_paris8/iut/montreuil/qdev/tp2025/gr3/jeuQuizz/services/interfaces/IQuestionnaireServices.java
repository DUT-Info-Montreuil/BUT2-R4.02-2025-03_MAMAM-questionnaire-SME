package org.univ_paris8.iut.montreuil.qdev.tp2025.gr3.jeuQuizz.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2025.gr3.jeuQuizz.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2025.gr3.jeuQuizz.utils.exceptions.ChargementFichierException;

import java.util.List;

public interface IQuestionnaireServices {

    List<QuestionnaireDTO> fournirListeQuestionnaires(String path) throws ChargementFichierException;

}

package org.iatoki.judgels.sandalphon.models.daos;

import org.iatoki.judgels.play.models.daos.JudgelsDao;
import org.iatoki.judgels.sandalphon.models.entities.AbstractBundleGradingModel;

import java.util.List;
import java.util.Map;

public interface BaseBundleGradingDao<M extends AbstractBundleGradingModel> extends JudgelsDao<M> {

    M createGradingModel();

    Map<String, List<M>> getBySubmissionJids(List<String> submissionJids);
}

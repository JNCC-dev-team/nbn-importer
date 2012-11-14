package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Dataset;
import uk.org.nbn.nbnv.jpa.nbncore.Resolution;
import uk.org.nbn.nbnv.jpa.nbncore.Survey;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationDownloadStatistics;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationFilterElement;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonDataset.class)
public class TaxonDataset_ { 

    public static volatile CollectionAttribute<TaxonDataset, TaxonObservationDownloadStatistics> taxonObservationDownloadStatisticsCollection;
    public static volatile CollectionAttribute<TaxonDataset, Survey> surveyCollection;
    public static volatile SingularAttribute<TaxonDataset, Dataset> dataset;
    public static volatile SingularAttribute<TaxonDataset, String> datasetKey;
    public static volatile SingularAttribute<TaxonDataset, Boolean> allowRecordValidation;
    public static volatile CollectionAttribute<TaxonDataset, TaxonObservationFilterElement> taxonObservationFilterElementCollection;
    public static volatile SingularAttribute<TaxonDataset, Resolution> resolution;
    public static volatile SingularAttribute<TaxonDataset, Boolean> publicAttribute;

}
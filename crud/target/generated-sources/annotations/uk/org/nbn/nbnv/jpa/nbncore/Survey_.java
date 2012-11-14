package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Sample;
import uk.org.nbn.nbnv.jpa.nbncore.SurveyAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonDataset;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Survey.class)
public class Survey_ { 

    public static volatile SingularAttribute<Survey, Integer> id;
    public static volatile SingularAttribute<Survey, String> title;
    public static volatile CollectionAttribute<Survey, SurveyAttribute> surveyAttributeCollection;
    public static volatile SingularAttribute<Survey, String> geographicalCoverage;
    public static volatile SingularAttribute<Survey, TaxonDataset> taxonDataset;
    public static volatile SingularAttribute<Survey, String> providerKey;
    public static volatile SingularAttribute<Survey, String> description;
    public static volatile SingularAttribute<Survey, String> temporalCoverage;
    public static volatile CollectionAttribute<Survey, Sample> sampleCollection;

}
package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.SampleAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.Survey;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservation;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Sample.class)
public class Sample_ { 

    public static volatile SingularAttribute<Sample, Integer> id;
    public static volatile SingularAttribute<Sample, String> title;
    public static volatile CollectionAttribute<Sample, TaxonObservation> taxonObservationCollection;
    public static volatile SingularAttribute<Sample, String> geographicalCoverage;
    public static volatile SingularAttribute<Sample, String> providerKey;
    public static volatile SingularAttribute<Sample, String> description;
    public static volatile SingularAttribute<Sample, String> temporalCoverage;
    public static volatile SingularAttribute<Sample, Survey> survey;
    public static volatile CollectionAttribute<Sample, SampleAttribute> sampleAttributeCollection;

}
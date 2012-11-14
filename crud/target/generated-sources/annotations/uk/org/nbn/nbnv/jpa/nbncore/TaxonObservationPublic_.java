package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Feature;
import uk.org.nbn.nbnv.jpa.nbncore.Recorder;
import uk.org.nbn.nbnv.jpa.nbncore.Site;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservation;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonObservationPublic.class)
public class TaxonObservationPublic_ { 

    public static volatile SingularAttribute<TaxonObservationPublic, Site> site;
    public static volatile SingularAttribute<TaxonObservationPublic, TaxonObservation> taxonObservation;
    public static volatile SingularAttribute<TaxonObservationPublic, Integer> taxonObservationID;
    public static volatile SingularAttribute<TaxonObservationPublic, Recorder> recorder;
    public static volatile SingularAttribute<TaxonObservationPublic, Recorder> recorder1;
    public static volatile SingularAttribute<TaxonObservationPublic, Feature> feature;

}
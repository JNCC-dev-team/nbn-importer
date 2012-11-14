package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservation;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationPublic;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Recorder.class)
public class Recorder_ { 

    public static volatile SingularAttribute<Recorder, Integer> id;
    public static volatile CollectionAttribute<Recorder, TaxonObservation> taxonObservationCollection1;
    public static volatile CollectionAttribute<Recorder, TaxonObservationPublic> taxonObservationPublicCollection;
    public static volatile CollectionAttribute<Recorder, TaxonObservation> taxonObservationCollection;
    public static volatile SingularAttribute<Recorder, String> name;
    public static volatile CollectionAttribute<Recorder, TaxonObservationPublic> taxonObservationPublicCollection1;

}
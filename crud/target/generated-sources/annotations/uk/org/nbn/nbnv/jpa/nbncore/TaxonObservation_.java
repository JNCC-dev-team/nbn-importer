package uk.org.nbn.nbnv.jpa.nbncore;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.DateType;
import uk.org.nbn.nbnv.jpa.nbncore.Feature;
import uk.org.nbn.nbnv.jpa.nbncore.Organisation;
import uk.org.nbn.nbnv.jpa.nbncore.Recorder;
import uk.org.nbn.nbnv.jpa.nbncore.Sample;
import uk.org.nbn.nbnv.jpa.nbncore.Site;
import uk.org.nbn.nbnv.jpa.nbncore.Taxon;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationPublic;
import uk.org.nbn.nbnv.jpa.nbncore.User;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonObservation.class)
public class TaxonObservation_ { 

    public static volatile SingularAttribute<TaxonObservation, Site> site;
    public static volatile SingularAttribute<TaxonObservation, Boolean> sensitiveRecord;
    public static volatile SingularAttribute<TaxonObservation, String> providerKey;
    public static volatile SingularAttribute<TaxonObservation, Recorder> recorder1;
    public static volatile SingularAttribute<TaxonObservation, Date> dateEnd;
    public static volatile CollectionAttribute<TaxonObservation, TaxonObservationAttribute> taxonObservationAttributeCollection;
    public static volatile SingularAttribute<TaxonObservation, DateType> dateType;
    public static volatile SingularAttribute<TaxonObservation, Date> dateStart;
    public static volatile SingularAttribute<TaxonObservation, TaxonObservationPublic> taxonObservationPublic;
    public static volatile CollectionAttribute<TaxonObservation, Organisation> organisationCollection;
    public static volatile CollectionAttribute<TaxonObservation, User> userCollection;
    public static volatile SingularAttribute<TaxonObservation, Integer> id;
    public static volatile SingularAttribute<TaxonObservation, Recorder> recorder;
    public static volatile SingularAttribute<TaxonObservation, Boolean> absenceRecord;
    public static volatile SingularAttribute<TaxonObservation, Feature> feature;
    public static volatile SingularAttribute<TaxonObservation, Taxon> taxon;
    public static volatile SingularAttribute<TaxonObservation, Sample> sample;

}
package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Attribute;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservation;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationAttributePK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonObservationAttribute.class)
public class TaxonObservationAttribute_ { 

    public static volatile SingularAttribute<TaxonObservationAttribute, TaxonObservation> taxonObservation;
    public static volatile SingularAttribute<TaxonObservationAttribute, TaxonObservationAttributePK> taxonObservationAttributePK;
    public static volatile SingularAttribute<TaxonObservationAttribute, Attribute> attribute;
    public static volatile SingularAttribute<TaxonObservationAttribute, Integer> enumValue;
    public static volatile SingularAttribute<TaxonObservationAttribute, Long> decimalValue;
    public static volatile SingularAttribute<TaxonObservationAttribute, String> textValue;

}
package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Attribute;
import uk.org.nbn.nbnv.jpa.nbncore.Taxon;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonAttributePK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonAttribute.class)
public class TaxonAttribute_ { 

    public static volatile SingularAttribute<TaxonAttribute, Attribute> attribute;
    public static volatile SingularAttribute<TaxonAttribute, TaxonAttributePK> taxonAttributePK;
    public static volatile SingularAttribute<TaxonAttribute, Integer> enumValue;
    public static volatile SingularAttribute<TaxonAttribute, Long> decimalValue;
    public static volatile SingularAttribute<TaxonAttribute, String> textValue;
    public static volatile SingularAttribute<TaxonAttribute, Taxon> taxon;

}
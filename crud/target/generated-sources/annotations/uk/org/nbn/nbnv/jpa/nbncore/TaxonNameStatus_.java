package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Taxon;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonNameStatus.class)
public class TaxonNameStatus_ { 

    public static volatile SingularAttribute<TaxonNameStatus, String> description;
    public static volatile CollectionAttribute<TaxonNameStatus, Taxon> taxonCollection;
    public static volatile SingularAttribute<TaxonNameStatus, Character> key;

}
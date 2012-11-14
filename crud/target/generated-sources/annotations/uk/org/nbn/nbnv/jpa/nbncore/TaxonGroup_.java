package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Taxon;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonGroup;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonGroup.class)
public class TaxonGroup_ { 

    public static volatile CollectionAttribute<TaxonGroup, TaxonGroup> taxonGroupCollection;
    public static volatile SingularAttribute<TaxonGroup, String> description;
    public static volatile SingularAttribute<TaxonGroup, Integer> sortOrder;
    public static volatile SingularAttribute<TaxonGroup, String> name;
    public static volatile SingularAttribute<TaxonGroup, Boolean> outputFlag;
    public static volatile CollectionAttribute<TaxonGroup, Taxon> taxonCollection;
    public static volatile CollectionAttribute<TaxonGroup, Taxon> taxonCollection1;
    public static volatile SingularAttribute<TaxonGroup, TaxonGroup> taxonGroup;
    public static volatile SingularAttribute<TaxonGroup, String> key;

}
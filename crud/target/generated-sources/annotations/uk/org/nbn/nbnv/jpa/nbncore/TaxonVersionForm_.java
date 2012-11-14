package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Taxon;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonVersionForm.class)
public class TaxonVersionForm_ { 

    public static volatile SingularAttribute<TaxonVersionForm, String> description;
    public static volatile SingularAttribute<TaxonVersionForm, Integer> sortOrder;
    public static volatile CollectionAttribute<TaxonVersionForm, Taxon> taxonCollection;
    public static volatile SingularAttribute<TaxonVersionForm, Character> key;

}
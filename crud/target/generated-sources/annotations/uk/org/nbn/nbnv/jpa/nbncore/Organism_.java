package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Organism;
import uk.org.nbn.nbnv.jpa.nbncore.Taxon;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Organism.class)
public class Organism_ { 

    public static volatile CollectionAttribute<Organism, Organism> organismCollection;
    public static volatile CollectionAttribute<Organism, Taxon> taxonCollection;
    public static volatile SingularAttribute<Organism, String> key;
    public static volatile SingularAttribute<Organism, Organism> organism;

}
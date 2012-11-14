package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.GridSquare;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonDataset;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Resolution.class)
public class Resolution_ { 

    public static volatile SingularAttribute<Resolution, Integer> id;
    public static volatile CollectionAttribute<Resolution, TaxonDataset> taxonDatasetCollection;
    public static volatile SingularAttribute<Resolution, Integer> area;
    public static volatile SingularAttribute<Resolution, String> label;
    public static volatile SingularAttribute<Resolution, Integer> accuracy;
    public static volatile CollectionAttribute<Resolution, GridSquare> gridSquareCollection;

}
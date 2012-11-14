package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Designation;
import uk.org.nbn.nbnv.jpa.nbncore.GridSquare;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundary;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservation;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationPublic;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Feature.class)
public class Feature_ { 

    public static volatile SingularAttribute<Feature, Integer> id;
    public static volatile CollectionAttribute<Feature, TaxonObservationPublic> taxonObservationPublicCollection;
    public static volatile CollectionAttribute<Feature, TaxonObservation> taxonObservationCollection;
    public static volatile CollectionAttribute<Feature, Designation> designationCollection;
    public static volatile SingularAttribute<Feature, byte[]> geom;
    public static volatile SingularAttribute<Feature, SiteBoundary> siteBoundary;
    public static volatile CollectionAttribute<Feature, GridSquare> gridSquareCollection;

}
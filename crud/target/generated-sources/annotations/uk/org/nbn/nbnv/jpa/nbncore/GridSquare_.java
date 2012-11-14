package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Feature;
import uk.org.nbn.nbnv.jpa.nbncore.GridSquare;
import uk.org.nbn.nbnv.jpa.nbncore.Projection;
import uk.org.nbn.nbnv.jpa.nbncore.Resolution;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(GridSquare.class)
public class GridSquare_ { 

    public static volatile SingularAttribute<GridSquare, GridSquare> gridSquare;
    public static volatile SingularAttribute<GridSquare, byte[]> originalGeom;
    public static volatile SingularAttribute<GridSquare, Projection> projection;
    public static volatile SingularAttribute<GridSquare, String> gridRef;
    public static volatile SingularAttribute<GridSquare, Feature> feature;
    public static volatile SingularAttribute<GridSquare, Resolution> resolution;
    public static volatile CollectionAttribute<GridSquare, GridSquare> gridSquareCollection;

}
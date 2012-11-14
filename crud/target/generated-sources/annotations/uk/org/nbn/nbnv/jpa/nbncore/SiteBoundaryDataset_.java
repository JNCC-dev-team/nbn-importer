package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Dataset;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundary;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundaryCategory;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundaryType;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(SiteBoundaryDataset.class)
public class SiteBoundaryDataset_ { 

    public static volatile SingularAttribute<SiteBoundaryDataset, Dataset> dataset;
    public static volatile SingularAttribute<SiteBoundaryDataset, String> datasetKey;
    public static volatile SingularAttribute<SiteBoundaryDataset, String> nameField;
    public static volatile CollectionAttribute<SiteBoundaryDataset, SiteBoundary> siteBoundaryCollection;
    public static volatile SingularAttribute<SiteBoundaryDataset, SiteBoundaryType> siteBoundaryType;
    public static volatile SingularAttribute<SiteBoundaryDataset, SiteBoundaryCategory> siteBoundaryCategory;

}
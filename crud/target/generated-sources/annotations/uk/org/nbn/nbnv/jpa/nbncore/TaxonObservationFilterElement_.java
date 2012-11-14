package uk.org.nbn.nbnv.jpa.nbncore;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.SiteBoundary;
import uk.org.nbn.nbnv.jpa.nbncore.Taxon;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonDataset;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationFilter;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationFilterElementType;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonObservationFilterElement.class)
public class TaxonObservationFilterElement_ { 

    public static volatile SingularAttribute<TaxonObservationFilterElement, Integer> id;
    public static volatile SingularAttribute<TaxonObservationFilterElement, Date> filterDateStart;
    public static volatile SingularAttribute<TaxonObservationFilterElement, Integer> filterSensitive;
    public static volatile SingularAttribute<TaxonObservationFilterElement, TaxonDataset> taxonDataset;
    public static volatile SingularAttribute<TaxonObservationFilterElement, TaxonObservationFilterElementType> taxonObservationFilterElementType;
    public static volatile SingularAttribute<TaxonObservationFilterElement, Date> filterDateEnd;
    public static volatile SingularAttribute<TaxonObservationFilterElement, SiteBoundary> siteBoundary;
    public static volatile SingularAttribute<TaxonObservationFilterElement, Integer> filterSiteBoundaryMatch;
    public static volatile SingularAttribute<TaxonObservationFilterElement, TaxonObservationFilter> taxonObservationFilter;
    public static volatile SingularAttribute<TaxonObservationFilterElement, Taxon> taxon;

}
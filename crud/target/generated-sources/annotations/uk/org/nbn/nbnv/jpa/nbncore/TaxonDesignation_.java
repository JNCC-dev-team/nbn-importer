package uk.org.nbn.nbnv.jpa.nbncore;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Designation;
import uk.org.nbn.nbnv.jpa.nbncore.Taxon;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonDesignationPK;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(TaxonDesignation.class)
public class TaxonDesignation_ { 

    public static volatile SingularAttribute<TaxonDesignation, Date> startDate;
    public static volatile SingularAttribute<TaxonDesignation, String> statusConstraint;
    public static volatile SingularAttribute<TaxonDesignation, String> source;
    public static volatile SingularAttribute<TaxonDesignation, TaxonDesignationPK> taxonDesignationPK;
    public static volatile SingularAttribute<TaxonDesignation, Designation> designation;
    public static volatile SingularAttribute<TaxonDesignation, Date> endDate;
    public static volatile SingularAttribute<TaxonDesignation, Taxon> taxon;

}
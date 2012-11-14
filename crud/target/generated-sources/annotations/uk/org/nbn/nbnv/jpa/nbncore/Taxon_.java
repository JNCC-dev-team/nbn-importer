package uk.org.nbn.nbnv.jpa.nbncore;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.org.nbn.nbnv.jpa.nbncore.Language;
import uk.org.nbn.nbnv.jpa.nbncore.Organism;
import uk.org.nbn.nbnv.jpa.nbncore.RecordingEntity;
import uk.org.nbn.nbnv.jpa.nbncore.Taxon;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonAttribute;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonDesignation;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonGroup;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonNameStatus;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservation;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonObservationFilterElement;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonRank;
import uk.org.nbn.nbnv.jpa.nbncore.TaxonVersionForm;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-11-05T12:01:58")
@StaticMetamodel(Taxon.class)
public class Taxon_ { 

    public static volatile CollectionAttribute<Taxon, TaxonAttribute> taxonAttributeCollection;
    public static volatile CollectionAttribute<Taxon, TaxonObservation> taxonObservationCollection;
    public static volatile CollectionAttribute<Taxon, TaxonObservationFilterElement> taxonObservationFilterElementCollection;
    public static volatile SingularAttribute<Taxon, String> taxonCode;
    public static volatile CollectionAttribute<Taxon, RecordingEntity> recordingEntityCollection;
    public static volatile SingularAttribute<Taxon, Organism> organism;
    public static volatile SingularAttribute<Taxon, String> taxonVersionKey;
    public static volatile SingularAttribute<Taxon, Taxon> pTaxonVersionKey;
    public static volatile CollectionAttribute<Taxon, TaxonGroup> taxonGroupCollection;
    public static volatile SingularAttribute<Taxon, String> authority;
    public static volatile SingularAttribute<Taxon, Taxon> commonNameTaxonVersionKey;
    public static volatile SingularAttribute<Taxon, String> name;
    public static volatile CollectionAttribute<Taxon, Taxon> taxonCollection1;
    public static volatile CollectionAttribute<Taxon, Taxon> taxonCollection;
    public static volatile CollectionAttribute<Taxon, Taxon> taxonCollection3;
    public static volatile SingularAttribute<Taxon, TaxonGroup> taxonGroup;
    public static volatile CollectionAttribute<Taxon, Taxon> taxonCollection2;
    public static volatile SingularAttribute<Taxon, Language> language;
    public static volatile SingularAttribute<Taxon, TaxonVersionForm> taxonVersionForm;
    public static volatile SingularAttribute<Taxon, TaxonNameStatus> taxonNameStatus;
    public static volatile SingularAttribute<Taxon, TaxonRank> taxonRank;
    public static volatile CollectionAttribute<Taxon, TaxonDesignation> taxonDesignationCollection;

}
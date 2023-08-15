package com.example.judupdater.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.Arrays;
@SolrDocument(collection = "dosare")
@Data
@AllArgsConstructor
@Getter
@Setter
public class DosareSolr {
    @Id
    @Field
    private String id;
    @Field
    private String data;
    @Field
    private String datamodificarii;
    @Field
    private String numardosar;
    @Field
    private String numardosarvechi;
    @Field
    private String iddosar;
    @Field
    private String institutie;
    @Field
    private String stadiu;
    @Field
    private String sectie;
    @Field
    private String obiect;
    @Field
    private String[] calitateparte;
    @Field
    private String[] numeparte;
    @Field
    private String materie;
    @Field
    private String ora;
    @Field
    private String datadocument;
    @Field
    private String solutie;
    @Field
    private String solutiesumar;
    @Field
    private String numardocument;
    @Field
    private String datapronuntare;
    @Field
    private String documentsedinta;
    @Field
    private String datasedinta;
    @Field
    private String complet;
    @Field
    private String tipcaleatac;
    @Field
    private String datadeclarare;
    @Field
    private String partedeclaratoare;
    @Field
    private String numardosarexact;
    @Field
    private String version;

    @Override
    public String toString() {
        return "docs: [{" +
                "\"id\": " + id + ", " +
                "\"data\": \"" + data + "\", " +
                "\"datamodificarii\": \"" + datamodificarii + "\", " +
                "\"numardosar\": \"" + numardosar + "\", " +
                "\"numardosarvechi\": \"" + numardosarvechi + "\", " +
                "\"iddosar\": " + iddosar + ", " +
                "\"institutie\": \"" + institutie + "\", " +
                "\"stadiu\": \"" + stadiu + "\", " +
                "\"sectie\": \"" + sectie + "\", " +
                "\"obiect\": \"" + obiect + "\", " +
                "\"calitateparte\": " + Arrays.toString(calitateparte) + ", " +
                "\"numeparte\": " + Arrays.toString(numeparte) + ", " +
                "\"materie\": \"" + materie + "\", " +
                "\"ora\": " + ora + ", " +
                "\"datadocument\": " + datadocument + ", " +
                "\"solutie\": " + solutie + ", " +
                "\"solutiesumar\": " + solutiesumar + ", " +
                "\"numardocument\": " + numardocument + ", " +
                "\"datapronuntare\": " + datapronuntare + ", " +
                "\"documentsedinta\": " + documentsedinta + ", " +
                "\"datasedinta\": " + datasedinta + ", " +
                "\"complet\": " + complet + ", " +
                "\"tipcaleatac\": " + tipcaleatac +", " +
                "\"datadeclarare\": [\""+datadeclarare+"\"], " +
                "\"partedeclaratoare\": ["+partedeclaratoare+"], " +
                "\"numardosarexact\": \"" + numardosarexact +"\", " +
                "\"_version_\": " + version +
                "}]";
    }

}
package com.example.judupdater.Entities;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.Indexed;

import java.util.Arrays;

public class DosareSolr {
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

    public DosareSolr(String id, String data, String datamodificarii, String numardosar, String numardosarvechi, String iddosar, String institutie, String stadiu, String sectie, String obiect, String[] calitateparte, String[] numeparte, String materie, String ora, String datadocument, String solutie, String solutiesumar, String numardocument, String datapronuntare, String documentsedinta, String datasedinta, String complet, String tipcaleatac, String datadeclarare, String partedeclaratoare, String numardosarexact,String version) {
        this.id = id;
        this.data = data;
        this.datamodificarii = datamodificarii;
        this.numardosar = numardosar;
        this.numardosarvechi = numardosarvechi;
        this.iddosar = iddosar;
        this.institutie = institutie;
        this.stadiu = stadiu;
        this.sectie = sectie;
        this.obiect = obiect;
        this.calitateparte = calitateparte;
        this.numeparte = numeparte;
        this.materie = materie;
        this.ora = ora;
        this.datadocument = datadocument;
        this.solutie = solutie;
        this.solutiesumar = solutiesumar;
        this.numardocument = numardocument;
        this.datapronuntare = datapronuntare;
        this.documentsedinta = documentsedinta;
        this.datasedinta = datasedinta;
        this.complet = complet;
        this.tipcaleatac = tipcaleatac;
        this.datadeclarare = datadeclarare;
        this.partedeclaratoare = partedeclaratoare;
        this.numardosarexact = numardosarexact;
        this.version = version;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDatamodificarii() {
        return datamodificarii;
    }

    public void setDatamodificarii(String datamodificarii) {
        this.datamodificarii = datamodificarii;
    }

    public String getInstitutie() {
        return institutie;
    }

    public void setInstitutie(String institutie) {
        this.institutie = institutie;
    }

    public String getStadiu() {
        return stadiu;
    }

    public void setStadiu(String stadiu) {
        this.stadiu = stadiu;
    }

    public String getSectie() {
        return sectie;
    }

    public void setSectie(String sectie) {
        this.sectie = sectie;
    }

    public String getObiect() {
        return obiect;
    }

    public void setObiect(String obiect) {
        this.obiect = obiect;
    }

    public String[] getCalitateparte() {
        return calitateparte;
    }

    public void setCalitateparte(String[] calitateparte) {
        this.calitateparte = calitateparte;
    }

    public String[] getNumeparte() {
        return numeparte;
    }

    public void setNumeparte(String[] numeparte) {
        this.numeparte = numeparte;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public String getOra() {
        return ora;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public String getDatadocument() {
        return datadocument;
    }

    public void setDatadocument(String datadocument) {
        this.datadocument = datadocument;
    }

    public String getSolutie() {
        return solutie;
    }

    public void setSolutie(String solutie) {
        this.solutie = solutie;
    }

    public String getSolutiesumar() {
        return solutiesumar;
    }

    public void setSolutiesumar(String solutiesumar) {
        this.solutiesumar = solutiesumar;
    }

    public String getNumardocument() {
        return numardocument;
    }

    public void setNumardocument(String numardocument) {
        this.numardocument = numardocument;
    }

    public String getDatapronuntare() {
        return datapronuntare;
    }

    public void setDatapronuntare(String datapronuntare) {
        this.datapronuntare = datapronuntare;
    }

    public String getDocumentsedinta() {
        return documentsedinta;
    }

    public void setDocumentsedinta(String documentsedinta) {
        this.documentsedinta = documentsedinta;
    }

    public String getDatasedinta() {
        return datasedinta;
    }

    public void setDatasedinta(String datasedinta) {
        this.datasedinta = datasedinta;
    }

    public String getComplet() {
        return complet;
    }

    public void setComplet(String complet) {
        this.complet = complet;
    }

    public String getTipcaleatac() {
        return tipcaleatac;
    }

    public void setTipcaleatac(String tipcaleatac) {
        this.tipcaleatac = tipcaleatac;
    }

    public String getDatadeclarare() {
        return datadeclarare;
    }

    public void setDatadeclarare(String datadeclarare) {
        this.datadeclarare = datadeclarare;
    }

    public String getPartedeclaratoare() {
        return partedeclaratoare;
    }

    public void setPartedeclaratoare(String partedeclaratoare) {
        this.partedeclaratoare = partedeclaratoare;
    }

    public String getNumardosarexact() {
        return numardosarexact;
    }

    public void setNumardosarexact(String numardosarexact) {
        this.numardosarexact = numardosarexact;
    }

    public String getNumardosar() {
        return numardosar;
    }

    public void setNumardosar(String numardosar) {
        this.numardosar = numardosar;
    }

    public String getNumardosarvechi() {
        return numardosarvechi;
    }

    public void setNumardosarvechi(String numardosarvechi) {
        this.numardosarvechi = numardosarvechi;
    }

    public String getIddosar() {
        return iddosar;
    }

    public void setIddosar(String iddosar) {
        this.iddosar = iddosar;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

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
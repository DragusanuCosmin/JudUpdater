package com.example.judupdater.Entities;

import org.springframework.data.solr.core.mapping.Indexed;

public class DosareSolr {
    @Indexed(name = "id", type = "FieldType.TrieIntField")
    private String id;
    @Indexed(name = "data", type = "FieldType.TrieDateField")
    private String data;
    @Indexed(name = "datamodificarii", type = "FieldType.TrieDateField")
    private String datamodificarii;
    @Indexed(name = "numardosar", type = "FieldType.TextField")
    private String numarDosar;
    @Indexed(name = "numardosarvechi", type = "FieldType.TextField")
    private String numarDosarVechi;
    @Indexed(name = "iddosar", type = "FieldType.TrieIntField")
    private String idDosar;
    @Indexed(name = "institutie", type = "FieldType.TextField")
    private String institutie;
    @Indexed(name = "stadiu", type = "FieldType.TextField")
    private String stadiu;
    @Indexed(name = "sectie", type = "FieldType.TextField")
    private String sectie;
    @Indexed(name = "obiect", type = "FieldType.TextField")
    private String obiect;
    @Indexed(name = "calitateparte", type = "FieldType.TextField")
    private String[] calitateparte;
    @Indexed(name = "numeparte", type = "FieldType.TextField")
    private String[] numeparte;
    @Indexed(name = "materie", type = "FieldType.TextField")
    private String materie;
    @Indexed(name = "ora", type = "FieldType.TextField")
    private String ora;
    @Indexed(name = "datadocument", type = "FieldType.TrieDateField")
    private String datadocument;
    @Indexed(name = "solutie", type = "FieldType.TextField")
    private String solutie;
    @Indexed(name = "solutiesumar", type = "FieldType.TextField")
    private String solutiesumar;
    @Indexed(name = "numardocument", type = "FieldType.TextField")
    private String numardocument;
    @Indexed(name = "datapronuntare", type = "FieldType.TrieDateField")
    private String datapronuntare;
    @Indexed(name = "documentsedinta", type = "FieldType.TextField")
    private String documentsedinta;
    @Indexed(name = "datasedinta", type = "FieldType.TrieDateField")
    private String datasedinta;
    @Indexed(name = "complet", type = "FieldType.TextField")
    private String complet;
    @Indexed(name = "tipcaleatac", type = "FieldType.TextField")
    private String tipcaleatac;
    @Indexed(name = "datadeclarare", type = "FieldType.TrieDateField")
    private String datadeclarare;
    @Indexed(name = "partedeclaratoare", type = "FieldType.TextField")
    private String partedeclaratoare;
    @Indexed(name = "numardosarexact", type = "FieldType.TextField")
    private String numardosarexact;

    public DosareSolr(String id, String data, String datamodificarii, String numarDosar, String numarDosarVechi, String idDosar, String institutie, String stadiu, String sectie, String obiect, String[] calitateparte, String[] numeparte, String materie, String ora, String datadocument, String solutie, String solutiesumar, String numardocument, String datapronuntare, String documentsedinta, String datasedinta, String complet, String tipcaleatac, String datadeclarare, String partedeclaratoare, String numardosarexact) {
        this.id = id;
        this.data = data;
        this.datamodificarii = datamodificarii;
        this.numarDosar = numarDosar;
        this.numarDosarVechi = numarDosarVechi;
        this.idDosar = idDosar;
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

    public String getNumarDosar() {
        return numarDosar;
    }

    public void setNumarDosar(String numarDosar) {
        this.numarDosar = numarDosar;
    }

    public String getNumarDosarVechi() {
        return numarDosarVechi;
    }

    public void setNumarDosarVechi(String numarDosarVechi) {
        this.numarDosarVechi = numarDosarVechi;
    }

    public String getIdDosar() {
        return idDosar;
    }

    public void setIdDosar(String idDosar) {
        this.idDosar = idDosar;
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
}
//package com.example.judupdater.Config;
//
//import org.apache.solr.client.solrj.SolrClient;
//import org.apache.solr.client.solrj.impl.HttpSolrClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.solr.core.SolrTemplate;
//import org.springframework.data.solr.repository.config.EnableSolrRepositories;
//
//@Configuration
//@EnableSolrRepositories(
//        basePackages = "com.example.judupdater.Repository.Solr")
//public class SolrConfig {
//    String solrURL="http://192.168.3.39:8984/solr";
//
//    @Bean
//    @Deprecated
//    public SolrClient solrClient() {
//        return new HttpSolrClient.Builder(solrURL).build();
//    }
//    @Bean
//    public SolrTemplate solrTemplate(SolrClient client) {
//        return new SolrTemplate(client);
//    }
//}
package com.TranscriptAnalyzer.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Transcript;;

public interface TranscriptRepository extends MongoRepository<Transcript, String> {

    public Transcript findByIntent(String intent );
    public List<Transcript> findByContent(String content);

}
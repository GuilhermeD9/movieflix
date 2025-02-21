package com.movieflix.service;

import com.movieflix.entity.Streaming;
import com.movieflix.repository.StreamingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StreamingService {
    private final StreamingRepository repository;

    public StreamingService(StreamingRepository repository) {
        this.repository = repository;
    }

    public List<Streaming> findAll() {
        return repository.findAll();
    }

    public Streaming saveStreaming(Streaming streaming) {
        return repository.save(streaming);
    }

    public Optional<Streaming> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteStreaming(Long id) {
        repository.deleteById(id);
    }
}

package com.ehsan.pollrest.repository.implementation;

import com.ehsan.pollrest.domain.Vote;
import com.ehsan.pollrest.repository.VoteRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class VoteRepoImpl implements VoteRepository {
    @Override
    public <S extends Vote> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Vote> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Vote> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Vote> findAll() {
        return null;
    }

    @Override
    public Iterable<Vote> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Vote entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Vote> entities) {

    }

    @Override
    public void deleteAll() {

    }
}

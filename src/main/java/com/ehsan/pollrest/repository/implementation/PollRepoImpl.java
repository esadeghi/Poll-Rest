package com.ehsan.pollrest.repository.implementation;

import com.ehsan.pollrest.domain.Poll;
import com.ehsan.pollrest.repository.PollRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PollRepoImpl implements PollRepository {
    @Override
    public <S extends Poll> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Poll> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Poll> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<Poll> findAll() {
        return null;
    }

    @Override
    public Iterable<Poll> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Poll entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Poll> entities) {

    }

    @Override
    public void deleteAll() {

    }
}

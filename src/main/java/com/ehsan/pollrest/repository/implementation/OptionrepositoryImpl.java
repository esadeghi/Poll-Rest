package com.ehsan.pollrest.repository.implementation;

import com.ehsan.pollrest.domain.Option;
import com.ehsan.pollrest.repository.OptionRepository;

import java.util.Optional;

public class OptionrepositoryImpl implements OptionRepository {
    @Override
    public <S extends Option> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Option> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Option> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Option> findAll() {
        return null;
    }

    @Override
    public Iterable<Option> findAllById(Iterable<Long> longs) {
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
    public void delete(Option entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Option> entities) {

    }

    @Override
    public void deleteAll() {

    }
}

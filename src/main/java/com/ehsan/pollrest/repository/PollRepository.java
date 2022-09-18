package com.ehsan.pollrest.repository;

import com.ehsan.pollrest.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Integer> {
}

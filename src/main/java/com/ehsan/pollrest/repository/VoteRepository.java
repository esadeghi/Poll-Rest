package com.ehsan.pollrest.repository;

import com.ehsan.pollrest.domain.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote,Long> {
}

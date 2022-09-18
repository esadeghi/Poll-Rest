package com.ehsan.pollrest.controller;


import com.ehsan.pollrest.domain.Poll;
import com.ehsan.pollrest.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {

    PollRepository _pollRepository;

    @Autowired
    PollController(PollRepository pollRepository) {
        _pollRepository = pollRepository;
    }

    @GetMapping("/polls")
    public ResponseEntity<Iterable<Poll>> getAllPolls() {
        Iterable<Poll> allPolls = _pollRepository.findAll();
        return new ResponseEntity<>(allPolls, HttpStatus.OK);
    }
}

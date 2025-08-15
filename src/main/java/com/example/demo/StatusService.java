package com.example.demo;


import org.springframework.stereotype.Service;

@Service
public class StatusService {

    public String processStatus(boolean arriving) {
        if (arriving){
            return "spring/hello";
        } else {
            return "spring/goodbye";
        }
    }
}

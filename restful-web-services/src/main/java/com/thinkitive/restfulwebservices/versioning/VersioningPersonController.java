package com.thinkitive.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    @GetMapping("/v1/person")
    public PersonV1  getFirstVersionOfPerson(){
        return new PersonV1("Krish Patil");
    }

    @GetMapping("/v2/person")
    public PersonV2 getSecondVersionOfPerson(){
        return new PersonV2(new Name("Krish", "Patil"));
    }

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getSecondVersionOfPersonRequestParameter(){
        return new PersonV1("Krish Patil");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestPerson(){
        return new PersonV2(new Name("Krish", "Patil"));
    }

    @GetMapping(value = "/person/header", headers = "X_API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader(){
        return new PersonV1("Krish Patil");
    }

    @GetMapping(value = "/person/header", headers = "X_API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader(){
        return new PersonV2(new Name("Krish", "Patil"));
    }

    @GetMapping(value = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getFirstdVersionOfPersonAcceptHeader(){
        return new PersonV1("Krish Patil");
    }

    @GetMapping(value = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSeconddVersionOfPersonAcceptHeader(){
        return new PersonV2(new Name("Krish", "Patil"));
    }
}

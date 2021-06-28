package com.swagger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Movierepository extends CrudRepository <Movie,Integer >{

}

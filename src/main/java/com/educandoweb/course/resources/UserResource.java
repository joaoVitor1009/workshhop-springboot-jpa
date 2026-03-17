package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;

import com.educandoweb.course.entities.User;

public class UserResource {

	public ResponseEntity<User> findAll(){
		User u = new User(null, null, null, null, null);
		return ResponseEntity.ok().body(u);
	}
}

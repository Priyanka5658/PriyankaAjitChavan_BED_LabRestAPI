package com.greatlearning.studentmanagement.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role {
         @Id
         @GeneratedValue (strategy = GenerationType.IDENTITY) 
         @Column(name = "role_id")
          private int id;
          @Column(name = "name")
          private String name;
		public String getName11() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getName1() {
			// TODO Auto-generated method stub
			return null;
		}
		public String getName() {
			// TODO Auto-generated method stub
			return null;
		} 
          
}

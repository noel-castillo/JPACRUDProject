package com.skilldistillery.mlbb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Hero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int health;
	
	private int mana;
	
	private String backstory;
	
	private byte[] image;

	public Hero() {
		super();
	}

	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + ", health=" + health + ", mana=" + mana + ", backstory="
				+ backstory + ", image=" + image + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public String getBackstory() {
		return backstory;
	}

	public void setBackstory(String backstory) {
		this.backstory = backstory;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((backstory == null) ? 0 : backstory.hashCode());
		result = prime * result + health;
		result = prime * result + id;
		result = prime * result + mana;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		if (backstory == null) {
			if (other.backstory != null)
				return false;
		} else if (!backstory.equals(other.backstory))
			return false;
		if (health != other.health)
			return false;
		if (id != other.id)
			return false;
		if (mana != other.mana)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

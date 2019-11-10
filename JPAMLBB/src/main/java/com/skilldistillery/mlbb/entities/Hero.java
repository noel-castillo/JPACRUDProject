package com.skilldistillery.mlbb.entities;

import java.util.Date;

import javax.persistence.Column;
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

	private String title;

	private int hp;

	private int mana;

	private String backstory;

	private String roles;

	private String specialties;

//	private byte[] image;

	@Column(name = "last_update")
	private Date lastUpdate;

	@Column(name = "movement_speed")
	private int movementSpeed;

	@Column(name = "physical_attack")
	private int physicalAttack;

	@Column(name = "magic_power")
	private int magicPower;

	private int armor;

	@Column(name = "magic_resistance")
	private int magicResistance;

	@Column(name = "attack_speed")
	private double attackSpeed;

	@Column(name = "hp_regen")
	private int hpRegen;

	@Column(name = "mana_regen")
	private int manaRegen;

	@Column(name = "basic_attack_crit_rate")
	private int basicAttackCritRate;

	@Column(name = "ability_crit_rate")
	private int abilityCritRate;

	public Hero() {
		super();
	}

	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + ", title=" + title + ", hp=" + hp + ", mana=" + mana
				+ ", backstory=" + backstory + ", roles=" + roles + ", specialties=" + specialties + ", lastUpdate="
				+ lastUpdate + ", movementSpeed=" + movementSpeed + ", physicalAttack=" + physicalAttack
				+ ", magicPower=" + magicPower + ", armor=" + armor + ", magicResistance=" + magicResistance
				+ ", attackSpeed=" + attackSpeed + ", hpRegen=" + hpRegen + ", manaRegen=" + manaRegen
				+ ", basicAttackCritRate=" + basicAttackCritRate + ", abilityCritRate=" + abilityCritRate + "]";
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
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

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getSpecialties() {
		return specialties;
	}

	public void setSpecialties(String specialties) {
		this.specialties = specialties;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getMovementSpeed() {
		return movementSpeed;
	}

	public void setMovementSpeed(int movementSpeed) {
		this.movementSpeed = movementSpeed;
	}

	public int getPhysicalAttack() {
		return physicalAttack;
	}

	public void setPhysicalAttack(int physicalAttack) {
		this.physicalAttack = physicalAttack;
	}

	public int getMagicPower() {
		return magicPower;
	}

	public void setMagicPower(int magicPower) {
		this.magicPower = magicPower;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getMagicResistance() {
		return magicResistance;
	}

	public void setMagicResistance(int magicResistance) {
		this.magicResistance = magicResistance;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public int getHpRegen() {
		return hpRegen;
	}

	public void setHpRegen(int hpRegen) {
		this.hpRegen = hpRegen;
	}

	public int getManaRegen() {
		return manaRegen;
	}

	public void setManaRegen(int manaRegen) {
		this.manaRegen = manaRegen;
	}

	public int getBasicAttackCritRate() {
		return basicAttackCritRate;
	}

	public void setBasicAttackCritRate(int basicAttackCritRate) {
		this.basicAttackCritRate = basicAttackCritRate;
	}

	public int getAbilityCritRate() {
		return abilityCritRate;
	}

	public void setAbilityCritRate(int abilityCritRate) {
		this.abilityCritRate = abilityCritRate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + abilityCritRate;
		result = prime * result + armor;
		long temp;
		temp = Double.doubleToLongBits(attackSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((backstory == null) ? 0 : backstory.hashCode());
		result = prime * result + basicAttackCritRate;
		result = prime * result + hp;
		result = prime * result + hpRegen;
		result = prime * result + id;
		result = prime * result + magicPower;
		result = prime * result + magicResistance;
		result = prime * result + mana;
		result = prime * result + manaRegen;
		result = prime * result + movementSpeed;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + physicalAttack;
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((specialties == null) ? 0 : specialties.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		if (abilityCritRate != other.abilityCritRate)
			return false;
		if (armor != other.armor)
			return false;
		if (Double.doubleToLongBits(attackSpeed) != Double.doubleToLongBits(other.attackSpeed))
			return false;
		if (backstory == null) {
			if (other.backstory != null)
				return false;
		} else if (!backstory.equals(other.backstory))
			return false;
		if (basicAttackCritRate != other.basicAttackCritRate)
			return false;
		if (hp != other.hp)
			return false;
		if (hpRegen != other.hpRegen)
			return false;
		if (id != other.id)
			return false;
		if (magicPower != other.magicPower)
			return false;
		if (magicResistance != other.magicResistance)
			return false;
		if (mana != other.mana)
			return false;
		if (manaRegen != other.manaRegen)
			return false;
		if (movementSpeed != other.movementSpeed)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (physicalAttack != other.physicalAttack)
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (specialties == null) {
			if (other.specialties != null)
				return false;
		} else if (!specialties.equals(other.specialties))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


}

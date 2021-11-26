package com.example.h2file;

import com.example.h2file.model.FireSpell;
import com.example.h2file.model.FrostSpell;
import com.example.h2file.model.Spell;
import com.example.h2file.repository.FireSpellRepository;
import com.example.h2file.repository.FrostSpellRepository;
import com.example.h2file.repository.SpellRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class H2FileApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(H2FileApplication.class, args);
		SpellRepository spellRepository = configurableApplicationContext.getBean(SpellRepository.class);
		SpellRepository frostSpellRepository = configurableApplicationContext.getBean(FrostSpellRepository.class);
		SpellRepository fireSpellRepository = configurableApplicationContext.getBean(FireSpellRepository.class);

		Spell arcaneSpark = new Spell("Arcane Spark",50,60);
		Spell fireBall = new FireSpell("Fireball",100,100,100,2000);
		Spell meteorShower = new FireSpell("Meteor Shower",400,300,300,3000);
		Spell frostBolt = new FrostSpell("Frost Bolt",80,80,true,300);

		spellRepository.save(arcaneSpark);
		fireSpellRepository.save(fireBall);
		fireSpellRepository.save(meteorShower);
		frostSpellRepository.save(frostBolt);

	}

}

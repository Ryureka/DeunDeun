package com.deun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.deun.model.MemberEntity;
import com.deun.model.MemberRole;
import com.deun.repository.MemberJpaRepository;

@SpringBootApplication
public class DeunApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DeunApplication.class, args);

		MemberJpaRepository memberJpaRepository = context.getBean(MemberJpaRepository.class);
//		memberJpaRepository.save(new MemberEntity("김선생", "3대700", "dd209@naver.com", "1", "010", MemberRole.ADMIN));
		MemberEntity member = memberJpaRepository.findByName("김선생");
		System.out.println(member.toString());
	}

}

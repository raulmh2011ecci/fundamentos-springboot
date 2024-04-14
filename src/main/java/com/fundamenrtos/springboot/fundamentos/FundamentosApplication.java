package com.fundamenrtos.springboot.fundamentos;

import com.fundamenrtos.springboot.fundamentos.bean.MyBean;
import com.fundamenrtos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamenrtos.springboot.fundamentos.bean.MyBeanWithProperties;
import com.fundamenrtos.springboot.fundamentos.bean.MyBeanWithPropertiesImplement;
import com.fundamenrtos.springboot.fundamentos.component.ComponentDependency;
import com.fundamenrtos.springboot.fundamentos.pojo.UserPojo;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {


	private final Log LOGGER = LogFactory.getLog(FundamentosApplication.class);

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;
	private MyBeanWithProperties myBeanWithProperties;
	private UserPojo userPojo;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency,
								  MyBean myBean, MyBeanWithDependency myBeanWithDependenc
			,MyBeanWithProperties myBeanWithProperties,UserPojo userPojo ){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependenc;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userPojo = userPojo;


	}


	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		System.out.println(userPojo.getAge()
				+"-"+ userPojo.getPasssword()+"+"+userPojo.getEmail());
		myBeanWithProperties.function();
		System.out.println(myBeanWithProperties.function());

		try{
			int value = (10/0);
			LOGGER.debug("mi error"+ value);
		}catch (Exception e){
			LOGGER.error("esto es un error " +e.getMessage());

					}

		LOGGER.error("esto es un error");
	}
}

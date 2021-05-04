package org.engine.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "skyshop-mail-service")
public interface EmailClient {

    @RequestMapping(method = RequestMethod.POST, value = "/engine/email/register")
    void setUserRegistration(RegisterUserDTO registerUserDTO);
}

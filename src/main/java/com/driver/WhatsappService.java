package com.driver;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WhatsappService {

    WhatsappRepository whatsappRepository = new WhatsappRepository();

    public String createUser(String name, String mobile)throws Exception {
        return whatsappRepository.createUser(name, mobile);
    }

    public Group createGroup(List<User> users) {
        return whatsappRepository.createGroup(users);
    }

    public int createMessage(String content) {
        return whatsappRepository.createMessage(content);
    }

    public int sendMessage(Message msg, User sender, Group group) throws Exception{
        return whatsappRepository.sendMessage(msg, sender, group);
    }

    public String changeAdmin(User approver, User user, Group group) throws Exception{
        return whatsappRepository.changeAdmin(approver, user, group);
    }
}
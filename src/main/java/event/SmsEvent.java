package event;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class SmsEvent {
    public void sendSms(@Observes Sms sms)
    {
        if (sms == null){
            return;
        }

        System.out.println("Phone To Send: " + sms.getPhone());
        System.out.println("Message To Send: " + sms.getMessage());
    }

}

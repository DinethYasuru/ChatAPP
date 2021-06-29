/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import DnetMessage.Message;
import Services.Talk;
import java.rmi.RemoteException;

/**
 *
 * @author dinet
 */
public class TrunncateChat {
Talk talk;
    public void truncate() throws RemoteException {
        Message msg = new Message();
        msg.setMsgid(msg.hashCode());
        msg.setName("");
        msg.setMessage("");
        msg.setDate_time("");
        msg.setAvatar(null);
        talk.send_message(msg, "No chat");
    }
}

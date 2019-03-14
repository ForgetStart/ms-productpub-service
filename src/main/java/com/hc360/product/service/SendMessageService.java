package com.hc360.product.service;

import com.hc360.jms.JMSProducer;
import com.hc360.jms.activemq.ActiveMQ;
import org.apache.activemq.command.ActiveMQDestination;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * jms消息服务
 * Created by hk on 2019/2/27.
 */
public class SendMessageService {

    private static final Log log =  LogFactory.getLog("SendMessageService");

    /**
     * 发送拒审消息
     * @param message
     * @return
     * @throws Exception
     */

    public static boolean sendRefuseMessage(String message) throws Exception{
        JMSProducer jpq;
        boolean isSend = false;
        try {
            jpq = ActiveMQ.createProducer("manage","MMT.BusinRefuseQueue", ActiveMQDestination.TOPIC_TYPE);
            isSend = jpq.synchSend(message);
        } catch ( Exception e ) {
            e.printStackTrace();
            isSend=false;
            log.error("调用jms发送商机拒审信息失败，商机号为："+message, e);
        }
        return isSend;
    }

    /**
     * 发送修改商机消息
     * @param message
     * @return
     * @throws Exception
     */
    public static boolean sendEditMessage(String message) throws Exception{
        JMSProducer jpq;
        boolean isSend = false;
        try {
            jpq = ActiveMQ.createProducer("manage","MMT.BusinEditQueue", ActiveMQDestination.TOPIC_TYPE);
            isSend = jpq.synchSend(message);
        } catch ( Exception e ) {
            e.printStackTrace();
            isSend=false;
            log.error("调用jms发送商机修改信息失败，商机号为："+message, e);
        }
        return isSend;
    }


    /**
     * 发送计算星级的jms消息
     * @param message
     * @return
     * @throws Exception
     */
    public static boolean sendStarMessage(String message) throws Exception{
        boolean isSend = false;
        try {
            JMSProducer jmsProducer = ActiveMQ.createProducer("CalculateScoreConsumer","storm.business.queue",
                    ActiveMQDestination.QUEUE_TYPE);

            isSend = jmsProducer.synchSend(message);
        }catch (Exception e){
            e.printStackTrace();
            log.error("****调用jms发送商机算分信息异常， 发送信息为***" + message, e);
        }

        return isSend;
    }
}

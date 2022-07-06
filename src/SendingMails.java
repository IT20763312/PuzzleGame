import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;


public class SendingMails {

    public void email(String[] to,String from,String pass,String subject,int l1clicks,int l1time,int l2clicks,int l2time,int l3clicks,int l3time
            ,int l4clicks,int l4time,int l5clicks,int l5time,int l6clicks,int l6time){

        Properties props = new Properties();
        props.put("mail.smtp.socketFactory.fallback", "false");
        props.put("mail.smtp.quit-wait", "false");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.host", "smtp.gmail.com");

        props.setProperty("mail.transport.protocol", "smtp");

        props.setProperty("mail.smtp.port", "587");
        props.setProperty("mail.smtp.ssl.trust", "*");
        props.setProperty("mail.smtp.starttls.enable", "true");//True or False
        props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        props.setProperty("mail.smtp.timeout", "300000");
        props.setProperty("mail.smtp.connection-timeout", "300000");
        props.setProperty("mail.smtp.write timeout", "300000");

        //Properties properties = new Properties();
        //String host = "smtp.gmail.com";
        //properties.put("mail.smtp.starttls.enable", "true");
        //properties.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
       // properties.put("mail.smtp.port", "587");
       // properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            for( int i = 0; i < to.length; i++ ) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for( int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }
            message.setSubject(subject);

            String msg ="<b style='color:red;'>Puzzle Game Scores</b><br><br><b> Level 1: </b>     You have completed Level 1 in<b style='color:blue;'> "+l1clicks+"</b> Clicks in<b style='color:blue;'> "+l1time+"</b> Seconds<br>" +
                    "<b> Level 2: </b>     You have completed Level 2 in<b style='color:blue;'> "+l2clicks+"</b> Clicks in<b style='color:blue;'> "+l2time+"</b> Seconds<br>" +
                    "<b> Level 3: </b>     You have completed Level 3 in<b style='color:blue;'> "+l3clicks+"</b> Clicks in<b style='color:blue;'> "+l3time+"</b> Seconds<br>" +
                    "<b> Level 4: </b>     You have completed Level 4 in<b style='color:blue;'> "+l4clicks+"</b> Clicks in<b style='color:blue;'> "+l4time+"</b> Seconds<br>" +
                    "<b> Level 5: </b>     You have completed Level 5 in<b style='color:blue;'> "+l5clicks+"</b> Clicks in<b style='color:blue;'> "+l5time+"</b> Seconds<br>" +
                    "<b> Level 6: </b>     You have completed Level 6 in<b style='color:blue;'> "+l6clicks+"</b> Clicks in<b style='color:blue;'> "+l6time+"</b> Seconds";

            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg,"text/html; charset=utf-8");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            message.setContent(multipart);

            //message.setText(body);
            //message.setText("<b style='color:red;'>Puzzle Game Scores</b>");
            Transport transport = session.getTransport("smtp");
            transport.connect("smtp.gmail.com", from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();

        }catch (AddressException ae){
            ae.printStackTrace();
        }catch (MessagingException me){
            me.printStackTrace();
        }

    }

}

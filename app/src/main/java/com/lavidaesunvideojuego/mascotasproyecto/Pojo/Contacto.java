package com.lavidaesunvideojuego.mascotasproyecto.Pojo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.lavidaesunvideojuego.mascotasproyecto.Mascotas;
import com.lavidaesunvideojuego.mascotasproyecto.R;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Contacto extends AppCompatActivity {

    EditText nombre;
    EditText correo;
    EditText mensaje;
    FloatingActionButton enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        nombre = (EditText) findViewById(R.id.ETnombre);
        correo = (EditText) findViewById(R.id.ETcorreo);
        mensaje = (EditText) findViewById(R.id.ETmensaje);
        enviar = (FloatingActionButton) findViewById(R.id.FBEnviar);


        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MimeMultipart multipart = new MimeMultipart();

                Properties properties = new Properties();

                properties.put("mail.smtp.host", "smtp.googlemail.com");
                Session session = Session.getDefaultInstance(properties, null);

                try {
                    MimeMessage msg = new MimeMessage(session);
                    msg.setFrom(new InternetAddress(correo.toString()));
                    msg.setRecipients(Message.RecipientType.TO, "pruebasprogramacionsebastian@gmail.com");
                    msg.setSubject("contacto");
                    msg.setSentDate(new Date());

                    // BODY
                    MimeBodyPart mbp = new MimeBodyPart();
                    mbp.setText(mensaje.toString());

                    multipart.addBodyPart(mbp);

                    msg.setContent(multipart);
                    Transport.send(msg);
                } catch (Exception mex) {
                    System.out.println(">> MailSender.send() error = " + mex);

                }


                Toast.makeText(Contacto.this, "Mensaje enviado", Toast.LENGTH_LONG).show();
                Intent e = new Intent(Contacto.this, Mascotas.class);
                startActivity(e);


            }



        });
    }
}






package ar.edu.utn.frba.dds.testMedioComunicacion;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import ar.edu.utn.frba.dds.domain.Comunidad.Comunidad;
import ar.edu.utn.frba.dds.domain.establecimiento.Establecimiento;
import ar.edu.utn.frba.dds.domain.medioComunicacion.MedioEmail;
import ar.edu.utn.frba.dds.domain.servicio.Incidente;
import ar.edu.utn.frba.dds.domain.servicio.Servicio;
import ar.edu.utn.frba.dds.domain.servicio.TipoServicio;
import ar.edu.utn.frba.dds.domain.usuario.RangoHorario;
import ar.edu.utn.frba.dds.domain.usuario.Usuario;

public class MedioComunicacionTest {

  MedioEmail medioEmail;
  RangoHorario horario;
  Establecimiento est1;
  Comunidad com1;
  Incidente inc1;
  Servicio serv1;
  Usuario luki;

//  @BeforeEach
//  public void setUp() {
//    medioEmail = new MedioEmail();
//    WhatsApp medioWhatsapp = new WhatsApp();
//    est1 = new Establecimiento();
//    horario = new RangoHorario(00,24);
//  }

//  @Test
//  public void seEncuentraServiciosCErcanosYMandaEmail() {
//    MedioComunicacion servicioMock = Mockito.mock(MedioComunicacion.class);
//
//    luki.setMedioComunicacion(medioEmail);
//    luki.agregarHorarioNotificacion(horario);
//
//
//    Mockito
//        .when(servicioMock.notificarServicioCercano(luki, new ArrayList<Servicio>()))
//        .thenReturn("OK");
//    Assertions.assertNotNull(establecimientos.get(0).estaCerca(luki));
//
//  }


}


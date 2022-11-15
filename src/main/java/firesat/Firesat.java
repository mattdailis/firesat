package firesat;

import firesat.models.gnc.GncControlMode;
import gov.nasa.jpl.aerie.contrib.models.Register;
import gov.nasa.jpl.aerie.contrib.serialization.mappers.EnumValueMapper;
import gov.nasa.jpl.aerie.merlin.framework.Registrar;

public final class Firesat {
  public final Register<GncControlMode> gncControlMode = Register.forImmutable(GncControlMode.THRUSTERS);

  public Firesat(final Registrar registrar, final Configuration config) {
    registrar.discrete("/gncControlMode", this.gncControlMode, new EnumValueMapper<>(GncControlMode.class));
  }
}

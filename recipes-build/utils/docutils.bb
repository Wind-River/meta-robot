
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "PD"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=35a23d42b615470583563132872c97d6"


PV = "0.14"

inherit pypi setuptools3
SRC_URI[md5sum] = "c53768d63db3873b7d452833553469de"
PYPI_PACKAGE = "docutils"

do_configure_prepend(){
  touch ${S}/tools/editors/emacs
  rm -r ${S}/tools/editors/emacs
  bbwarn "removing emacs script"
}


BBCLASSEXTEND = "native"

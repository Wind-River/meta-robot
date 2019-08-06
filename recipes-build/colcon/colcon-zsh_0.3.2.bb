
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=6ed202a6deb7601a46e990a7784e936b"


PV = "0.3.2"

inherit pypi setuptools3
SRC_URI[md5sum] = "42ca461c1a2d50a60a4831ce467dd4bc"
PYPI_PACKAGE = "colcon-zsh"



BBCLASSEXTEND = "native"

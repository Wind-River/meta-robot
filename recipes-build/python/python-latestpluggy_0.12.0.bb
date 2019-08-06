
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1c8206d16fd5cc02fa9b0bb98955e5c2"


PV = "0.12.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "e986647f5d786c0cc1bd065cf9bac658"

PYPI_PACKAGE = "pluggy"
DEPENDS = " python3 python3-setuptools-native python3-setuptools-scm-native "


BBCLASSEXTEND = "native"

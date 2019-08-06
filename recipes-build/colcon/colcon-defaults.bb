
DESCRIPTION = "Colcon Build Tool"

SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=735d9dd960d860bd266638d28fd2b42e"


PV = "0.2.2"

inherit pypi setuptools3
SRC_URI[md5sum] = "f8dfbd1b20044aafe3bad2842e8f04d1"

PYPI_PACKAGE = "colcon-defaults"


BBCLASSEXTEND = "native"

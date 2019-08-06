
LICENSE = "Apache-2.0"

LIC_FILES_CHKSUM = "file://PKG-INFO;md5=8fcfaa7873e92a1d6a25dde14180c544"

DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

PV = "0.2.11"

inherit pypi setuptools3
SRC_URI[md5sum] = "81a3b97066c259197db8dabb4b7a8292"
PYPI_PACKAGE = "colcon-cmake"



BBCLASSEXTEND = "native"

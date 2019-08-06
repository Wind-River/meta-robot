
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.APACHE;md5=a832eda17114b48ae16cda6a500941c2"



PV = "19.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "dd118dc389f8e90840d44240292bf3d9"

PYPI_PACKAGE = "packaging"


BBCLASSEXTEND = "native"

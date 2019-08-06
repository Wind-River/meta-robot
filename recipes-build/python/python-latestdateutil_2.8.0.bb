
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0 | BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3155c7bdc71f66e02678411d2abf996"


PV = "2.8.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "354db28843d949f1bc3e49e8458e22df"
DEPENDS = " python3 python3-setuptools-native python3-setuptools-scm-native "

PYPI_PACKAGE = "python-dateutil"


BBCLASSEXTEND = "native"

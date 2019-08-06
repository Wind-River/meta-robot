
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a0bb0f2949a8babbc1df9a81a569b25"



PV = "0.8.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "8301c6be12215654bdbd635b53e72d78"
PYPI_PACKAGE = "pytest-repeat"
DEPENDS += " python-latestpytest python3-setuptools-native python3-setuptools-scm-native"



BBCLASSEXTEND = "native"

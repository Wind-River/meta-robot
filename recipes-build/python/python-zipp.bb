
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a33f38bbf47d48c70fe0d40e5f77498e"


PV = "0.5.1"

inherit pypi setuptools3
SRC_URI[md5sum] = "45286cd2f2e0c3423b4e18a863d3b84d"

PYPI_PACKAGE = "zipp"
DEPENDS = " python3 python3-setuptools-native python3-setuptools-scm-native "


BBCLASSEXTEND = "native"

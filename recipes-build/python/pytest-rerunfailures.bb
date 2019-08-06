
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d425c8f3157dbf212db2ec53d9e5132"


PV = "7.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "898c15d1c99f85d9c48005dd380fa3fe"

PYPI_PACKAGE = "pytest-rerunfailures"


BBCLASSEXTEND = "native"

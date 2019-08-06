
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=91cc36cfafeefb7863673bcfcb1d4da4"


PV = "1.3.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "ce11f780a4ce0fce8a55d64494a88178"

PYPI_PACKAGE = "atomicwrites"


BBCLASSEXTEND = "native"

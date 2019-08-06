
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3396ea30f9d21389d7857719816f83b5"


PV = "7.0.0"

inherit pypi setuptools3
SRC_URI[md5sum] = "c5a9cf0d9c3cfe952a4ed9b3175dae0d"

PYPI_PACKAGE = "more-itertools"


BBCLASSEXTEND = "native"

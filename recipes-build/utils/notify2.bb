
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=71a2cbec11611051cab37ac4f58ff05b"


PV = "0.3.1"

inherit pypi setuptools3
SRC_URI[md5sum] = "ffccaed9330787c7442b453f6520a474"
PYPI_PACKAGE = "notify2"


BBCLASSEXTEND = "native"

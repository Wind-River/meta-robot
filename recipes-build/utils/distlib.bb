
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "Python-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f6a11430d5cd6e2cd3832ee94f22ddfc"



PV = "0.2.9.post0"
inherit pypi setuptools3

SRC_URI[md5sum] = "b3c6bbbf07677bda9495fb694e8a7551"
PYPI_PACKAGE = "distlib"
PYPI_PACKAGE_EXT = "zip"


BBCLASSEXTEND = "native"


DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=b4936429a56a652b84c5c01280dcaa26"


PV = "0.4.1"

inherit pypi setuptools3
SRC_URI[md5sum] = "f927529cd1735f6f50ee2c61628e9c1f"

PYPI_PACKAGE = "colorama"


BBCLASSEXTEND = "native"

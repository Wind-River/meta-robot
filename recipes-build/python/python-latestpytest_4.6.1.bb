
DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=640061b8cee64b308a4d2f9f556c12f2"


PV = "4.6.1"

inherit pypi setuptools3
SRC_URI[md5sum] = "adaf9d508493355d733afd94a359b05e"
PYPI_PACKAGE = "pytest"

DEPENDS = " python3 python3-setuptools-native python3-setuptools-scm-native "

RDEPENDS_${PN} += " python-latestpluggy python3-six python3-attrs python-packaging python-more-itertools python-atomicwrites python-funcsigs python-pathlib2 python-colorama python-importlib-metadata python3-wcwidth"
BBCLASSEXTEND = "native"

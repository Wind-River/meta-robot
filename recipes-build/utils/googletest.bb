
DESCRIPTION = "Google Test Library"
SECTION = "turtlebot3_ws"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cbbd27594afd089daa160d3a16dd515a"
SRC_URI = "git://github.com/ament/googletest.git;branch=crystal"

SRCREV = "8d97cc0bbe8a67743d48594c18c1ce5a40f16bb9"
inherit cmake
SRC_URI[md5sum] = "ffccaed9330787c7442b453f6520a474"

S = "${WORKDIR}/git/googletest"
FILES_${PN} += " /usr/* "

BBCLASSEXTEND = "native"

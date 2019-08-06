
#inherit ros_distro_${ROS_DISTRO}

DESCRIPTION = "DDS-XCRE agent implementation"
AUTHOR = "Borja Outerelo <borjaouterelo@eprosima.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8489f3831fc7b75264c1d5e346251a74"



ROS_CN = "cli11"
ROS_BPN = "cli11"

ROS_BUILD_DEPENDS = " \
    asio \
    gtest \
    fastcdr \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fastcdr \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = " gtest ${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += " gtest ${ROS_EXEC_DEPENDS}"
SRCREV = "49ac989a9527ee9bb496de9ded7b4872c2e0e5ca"
SRC_URI = "git://github.com/CLIUtils/CLI11.git"
SRC_URI[md5sum] = "9f2e3d608310e05268a4478f55bfb31e"
#SRC_URI[sha256sum] = "2527ae37b394541a98465ecdfbf05b9de141c0b66a1675ccf19f7e149d7ff765"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
#ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('micro-xrce-dds-agent', d)}"
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/micro-xrce-dds-agent_common.inc
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/micro-xrce-dds-agent-${PV}_common.inc
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/${BPN}.inc
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/${BPN}-${PV}.inc

inherit ros2_component
inherit ros_${ROS_BUILD_TYPE}


#INHIBIT_PACKAGE_STRIP = "1"
#INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

FILES_${PN} += " /usr/ "

EXTRA_OECMAKE += " -DCLI11_TESTING=OFF "

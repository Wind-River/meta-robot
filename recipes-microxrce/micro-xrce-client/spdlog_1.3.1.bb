
inherit ros_distro_${ROS_DISTRO}

DESCRIPTION = "DDS-XCRE agent implementation"
AUTHOR = "Borja Outerelo <borjaouterelo@eprosima.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6e5242b8f24d08c5e948675102937cc9"



ROS_CN = "spdlog"
ROS_BPN = "spdlog"

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
SRC_URI = "https://github.com/gabime/spdlog/archive/v1.3.1.tar.gz"
SRC_URI[md5sum] = "3c17dd6983de2a66eca8b5a0b213d29f"
#SRC_URI[sha256sum] = "2527ae37b394541a98465ecdfbf05b9de141c0b66a1675ccf19f7e149d7ff765"
S = "${WORKDIR}/spdlog-1.3.1"

ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
#ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('micro-xrce-dds-agent', d)}"
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/micro-xrce-dds-agent_common.inc
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/micro-xrce-dds-agent-${PV}_common.inc
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/${BPN}.inc
#include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/micro-xrce-dds-agent/${BPN}-${PV}.inc

inherit ros2_component
inherit ros_${ROS_BUILD_TYPE}

EXTRA_OECMAKE += " -DCLI11_TESTING=OFF -DSPDLOG_BUILD_BENCH=OFF -DSPDLOG_BUILD_BENCH=OFF "
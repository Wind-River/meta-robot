# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

DESCRIPTION = "Colcon Build Tool"
SECTION = "turtlebot3_ws"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

inherit packagegroup

RDEPENDS_${PN} += " tinyxml2-vendor-dev libtinyxml2-dev osrf-testing-tools-cpp-dev googletest googletest-dev gtest-vendor-dev gtest-dev gtest console-bridge-vendor-dev ament-cmake-flake8-dev ament-cmake-gmock-dev ament-cmake-gtest-dev ament-cmake-include-directories-dev ament-cmake-libraries-dev ament-cmake-lint-cmake-dev ament-cmake-pep257-dev ament-cmake-pytest-dev ament-cmake-python-dev ament-cmake-ros-dev ament-cmake-target-dependencies-dev ament-cmake-test-dev ament-cmake-uncrustify-dev ament-cmake-xmllint-dev ament-cmake-export-link-flags-dev ament-cmake-export-libraries-dev ament-cmake-export-interfaces-dev ament-cmake-export-include-directories-dev ament-cmake-dev rclcpp-dev std-msgs-dev rclpy-dev libyaml-vendor-dev ament-cmake-libraries-dev ament-cmake-export-definitions-dev ament-index-cpp-dev ament-lint-auto-dev ament-lint-common-dev angles-dev builtin-interfaces-dev class-loader-dev common-interfaces-dev behaviortree-cpp-dev composition-dev compressed-depth-image-transport-dev console-bridge-vendor-dev cv-bridge-dev depthimage-to-laserscan-dev diagnostic-msgs-dev dummy-map-server-dev dummy-robot-bringup-dev dummy-sensors-dev example-interfaces-dev examples-rclcpp-minimal-action-client-dev examples-rclcpp-minimal-action-server-dev examples-rclcpp-minimal-client-dev examples-rclcpp-minimal-composition-dev examples-rclcpp-minimal-publisher-dev examples-rclcpp-minimal-service-dev examples-rclcpp-minimal-subscriber-dev examples-rclcpp-minimal-timer-dev examples-rclpy-executors-dev examples-rclpy-minimal-client-dev examples-rclpy-minimal-publisher-dev examples-rclpy-minimal-service-dev examples-rclpy-minimal-subscriber-dev fastcdr-dev fastrtps-dev fastrtps-cmake-module-dev geometry-msgs-dev gmock-vendor-dev gtest-vendor-dev image-geometry-dev image-tools-dev image-transport-dev intra-process-demo-dev joy-dev kdl-parser-dev laser-geometry-dev libcurl-vendor-dev libyaml-vendor-dev lifecycle-dev lifecycle-msgs-dev logging-demo-dev map-msgs-dev message-filters-dev nav-msgs-dev orocos-kdl-dev pcl-conversions-dev pendulum-control-dev pendulum-msgs-dev pluginlib-dev poco-vendor-dev python-cmake-module-dev rcl-dev rcl-action-dev rclcpp-dev rclcpp-action-dev rclcpp-lifecycle-dev rcl-interfaces-dev rcl-lifecycle-dev rcl-logging-noop-dev rclpy-dev rcl-yaml-param-parser-dev rcutils-dev resource-retriever-dev rmw-dev rmw-fastrtps-cpp-dev rmw-fastrtps-shared-cpp-dev rmw-implementation-dev rmw-implementation-cmake-dev robot-state-publisher-dev ros2cli-dev ros-base-dev ros-core-dev ros-environment-dev rosgraph-msgs-dev ros-workspace-dev rttest-dev sensor-msgs-dev shape-msgs-dev std-msgs-dev std-srvs-dev stereo-msgs-dev teleop-twist-joy-dev teleop-twist-keyboard-dev tf2-dev tf2-eigen-dev tf2-geometry-msgs-dev tf2-msgs-dev tf2-ros-dev tlsf-dev tlsf-cpp-dev topic-monitor-dev trajectory-msgs-dev uncrustify-vendor-dev unique-identifier-msgs-dev urdf-dev visualization-msgs-dev rosidl-typesupport-cpp-dev rosidl-typesupport-fastrtps-c-dev rosidl-typesupport-fastrtps-cpp-dev rosidl-typesupport-interface-dev rosidl-typesupport-introspection-c-dev rosidl-typesupport-introspection-cpp-dev"

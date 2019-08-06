# Copyright (c) 2019 Wind River Systems, Inc. 
# Licensed under the Apache License, Version 2.0 (the "License"); 
# you may not use this file except in compliance with the License. 
# You may obtain a copy of the License at: 
#       http://www.apache.org/licenses/LICENSE-2.0 
# Unless required by applicable law or agreed to in writing, software  distributed 
# under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES 
# OR CONDITIONS OF ANY KIND, either express or implied.

EXTRA_OECMAKE += " -DCONFIG_UDP_TRANSPORT_MTU=8192 -DCONFIG_SERIAL_TRANSPORT_MTU=8192 "
SRC_URI[md5sum] = "e5f71403b107d9a06d8232fc835a15bd"
SRC_URI[sha256sum] = "7e9ac037a8a10740e8b5a6f8d82989abe922b94ddc402d25a461a34976cb78c7"

S = "${WORKDIR}/microxrcedds_agent-release-release-crystal-micro-xrce-dds-agent-1.0.3-1"
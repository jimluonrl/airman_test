/*
 * Copyright 2021-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nrl.test;

import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.onosproject.cli.AbstractShellCommand;

import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.commands.Option;
import org.apache.karaf.shell.api.action.lifecycle.Service;

import org.onosproject.cli.AbstractShellCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.onosproject.cli.AbstractChoicesCompleter;
import org.slf4j.helpers.MessageFormatter;
import com.google.common.collect.Sets;
import org.onlab.util.Tools;
import org.onosproject.net.Device;
import org.onosproject.net.Host;
import org.onosproject.net.host.HostService;
import org.onosproject.net.Link;
import org.onosproject.net.config.NetworkConfigService;
import org.onosproject.net.device.DeviceAdminService;
import org.onosproject.net.flow.FlowRuleService;
import org.onosproject.net.group.GroupService;
import org.onosproject.net.host.HostAdminService;
import org.onosproject.net.intent.Intent;
import org.onosproject.net.intent.IntentEvent;
import org.onosproject.net.intent.IntentListener;
import org.onosproject.net.intent.IntentService;
import org.onosproject.net.intent.Key;
import org.onosproject.net.link.LinkAdminService;
import org.onosproject.net.meter.MeterService;
import org.onosproject.net.packet.PacketService;
import org.onosproject.net.packet.PacketRequest;
import org.onosproject.net.region.RegionAdminService;
import org.onosproject.ui.UiExtensionService;
import org.onosproject.ui.UiTopoLayoutService;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

import static org.onosproject.net.intent.IntentState.WITHDRAWN;
import static com.google.common.collect.Lists.newArrayList;

/**
 * Sample Apache Karaf CLI command.
 */
@Service
@Command(scope = "onos", name = "airman_test",
         description = "Sample Apache Karaf CLI command")
public class AppCommand extends AbstractShellCommand {

 	public static final String CMD_FLOOD_FLOW_TABLE = "flood_flow_table";

	public static final String CMD_CANCEL = "cancel";
	public static final String CMD_HELP = "help";


	@Argument(name = "cmd", description = "command")
    String cmd = null;
    
	@Argument(index = 1, name = "param...", required = false, multiValued = true,
    description = "param(s) required by commands")
  	private List<String> paramList = new ArrayList<>();



    @Override
    protected void doExecute() {
      
        print("Hello %s", "World " + cmd);
        
    	cmd = Optional.ofNullable(cmd).orElse("Error");

		switch (cmd) {
      		case CMD_FLOOD_FLOW_TABLE: {
				print("in here");

        		break;
      		}
      			case CMD_HELP: {
        		break;
			}
      		default: {
        		print("Unknown command %s", cmd);
        		break;
      		}
    	}
    }
}

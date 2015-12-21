/**
 *  DSC Panel
 *
 *  Copyright 2015 Nate House
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
	definition (name: "DSC Panel", namespace: "naterh", author: "Nate House") {
		capability "Alarm"
		capability "Battery"
		capability "Configuration"
		capability "Indicator"
		capability "Notification"
		capability "Polling"
		capability "Tamper Alert"
	}

	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'alarm' attribute
	// TODO: handle 'battery' attribute
	// TODO: handle 'contact' attribute
	// TODO: handle 'indicatorStatus' attribute
	// TODO: handle 'presence' attribute
	// TODO: handle 'switch' attribute
	// TODO: handle 'tamper' attribute

}

// handle commands
def strobe() {
	log.debug "Executing 'strobe'"
	// TODO: handle 'strobe' command
}

def siren() {
	log.debug "Executing 'siren'"
	// TODO: handle 'siren' command
}

def both() {
	log.debug "Executing 'both'"
	// TODO: handle 'both' command
}

def configure() {
	log.debug "Executing 'configure'"
	// TODO: handle 'configure' command
}

def indicatorWhenOn() {
	log.debug "Executing 'indicatorWhenOn'"
	// TODO: handle 'indicatorWhenOn' command
}

def indicatorWhenOff() {
	log.debug "Executing 'indicatorWhenOff'"
	// TODO: handle 'indicatorWhenOff' command
}

def indicatorNever() {
	log.debug "Executing 'indicatorNever'"
	// TODO: handle 'indicatorNever' command
}

def deviceNotification() {
	log.debug "Executing 'deviceNotification'"
	// TODO: handle 'deviceNotification' command
}

def poll() {
	log.debug "Executing 'poll'"
	// TODO: handle 'poll' command
}

def on() {
	log.debug "Executing 'on'"
	// TODO: handle 'on' command
}

def off() {
	log.debug "Executing 'off'"
	// TODO: handle 'off' command
}



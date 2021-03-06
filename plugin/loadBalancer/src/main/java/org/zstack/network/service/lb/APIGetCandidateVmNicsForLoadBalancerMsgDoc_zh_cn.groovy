package org.zstack.network.service.lb

import org.zstack.network.service.lb.APIGetCandidateVmNicsForLoadBalancerReply

doc {
    title "GetCandidateVmNicsForLoadBalancer"

    category "loadBalancer"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/load-balancers/listeners/{listenerUuid}/vm-instances/candidate-nics"


            header (OAuth: 'the-session-uuid')

            clz APIGetCandidateVmNicsForLoadBalancerMsg.class

            desc ""
            
			params {

				column {
					name "listenerUuid"
					enclosedIn ""
					desc ""
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc "系统标签"
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc "用户标签"
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIGetCandidateVmNicsForLoadBalancerReply.class
        }
    }
}
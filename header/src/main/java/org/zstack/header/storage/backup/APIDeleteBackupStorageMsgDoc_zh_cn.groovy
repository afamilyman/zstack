package org.zstack.header.storage.backup

import org.zstack.header.storage.backup.APIDeleteBackupStorageEvent

doc {
    title "DeleteBackupStorage"

    category "storage.backup"

    desc "在这里填写API描述"

    rest {
        request {
			url "DELETE /v1/backup-storage/{uuid}"


            header (OAuth: 'the-session-uuid')

            clz APIDeleteBackupStorageMsg.class

            desc ""
            
			params {

				column {
					name "uuid"
					enclosedIn ""
					desc "资源的UUID，唯一标示该资源"
					location "url"
					type "String"
					optional false
					since "0.6"
					
				}
				column {
					name "deleteMode"
 					enclosedIn ""
 					desc ""
					location "body"
					type "String"
					optional true
					since "0.6"
					
				}
				column {
					name "systemTags"
					enclosedIn ""
					desc "系统标签"
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc "用户标签"
					location "body"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIDeleteBackupStorageEvent.class
        }
    }
}
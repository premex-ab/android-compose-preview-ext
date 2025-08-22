package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WOXTER device specifications for Android Compose previews.
 *
 * This extension provides WOXTER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WOXTER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WOXTER: Any
  get() = object {
      /** WOXTER X100v3 */
      val X100V3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WOXTER X100_PRO */
      val X100_PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WOXTER X200 */
      val X200 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WOXTER X200_PRO_v2 */
      val X200_PRO_V2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** WOXTER X70v2 */
      val X70V2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** WOXTER X70_PRO */
      val X70_PRO = "spec:width=600,height=1024,unit=px,dpi=160"

  }

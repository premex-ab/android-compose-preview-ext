package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DCODE device specifications for Android Compose previews.
 *
 * This extension provides DCODE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DCODE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DCODE: Any
  get() = object {
      /** DCODE DS_BD1 */
      val DS_BD1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DCODE DS_BD2 */
      val DS_BD2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DCODE DS_CL1 */
      val DS_CL1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DCODE DS_CL2_Lite */
      val DS_CL2_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DCODE DS_CL2_Pro */
      val DS_CL2_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DCODE DS_CL4 */
      val DS_CL4 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DCODE DS_CL4_Lite */
      val DS_CL4_LITE = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DCODE DS_CL4_Pro */
      val DS_CL4_PRO = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DCODE DS-X1 */
      val DS_X1 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }

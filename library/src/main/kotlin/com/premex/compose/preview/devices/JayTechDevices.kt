package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JAY-tech device specifications for Android Compose previews.
 *
 * This extension provides JAY-tech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JayTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JayTech: Any
  get() = object {
      /** JAY-tech TPC-G1010_EEA */
      val TPC_G1010_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** JAY-tech TPC-G1011LTE */
      val TPC_G1011LTE = "spec:width=800,height=1280,unit=px,dpi=213"

      /** JAY-tech TPC-G109 */
      val TPC_G109 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

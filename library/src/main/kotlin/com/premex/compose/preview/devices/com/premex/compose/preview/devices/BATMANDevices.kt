package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BATMAN device specifications for Android Compose previews.
 *
 * This extension provides BATMAN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BATMAN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BATMAN: Any
  get() = object {
      /** DeviceSpec(manufacturer=BATMAN, code=TM-MID1065BT, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BATMAN, code=TM-MID1065BT,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TM_MID1065BT = "spec:width=800,height=1280,unit=px,dpi=160"

  }

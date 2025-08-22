package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAIKO device specifications for Android Compose previews.
 *
 * This extension provides DAIKO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DAIKO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DAIKO: Any
  get() = object {
      /** DeviceSpec(manufacturer=DAIKO, code=OD0M_EA_T32, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DAIKO, code=OD0M_EA_T32,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val OD0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

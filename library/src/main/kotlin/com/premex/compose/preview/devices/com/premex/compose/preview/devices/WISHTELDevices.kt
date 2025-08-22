package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WISHTEL device specifications for Android Compose previews.
 *
 * This extension provides WISHTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WISHTEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WISHTEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=WISHTEL, code=IRA_S1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WISHTEL, code=IRA_S1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val IRA_S1 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

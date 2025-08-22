package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SMARTAB device specifications for Android Compose previews.
 *
 * This extension provides SMARTAB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SMARTAB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SMARTAB: Any
  get() = object {
      /** DeviceSpec(manufacturer=SMARTAB, code=ST1020, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SMARTAB, code=ST1020, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ST1020 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

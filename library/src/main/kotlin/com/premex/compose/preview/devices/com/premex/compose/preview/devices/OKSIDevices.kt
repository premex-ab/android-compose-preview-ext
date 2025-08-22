package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OKSI device specifications for Android Compose previews.
 *
 * This extension provides OKSI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OKSI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OKSI: Any
  get() = object {
      /** DeviceSpec(manufacturer=OKSI, code=GT1001, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OKSI, code=GT1001, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val GT1001 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PATTERS device specifications for Android Compose previews.
 *
 * This extension provides PATTERS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PATTERS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PATTERS: Any
  get() = object {
      /** DeviceSpec(manufacturer=PATTERS, code=P7, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PATTERS, code=P7, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P7 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PATTERS, code=P9, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PATTERS, code=P9, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val P9 = "spec:width=480,height=960,unit=px,dpi=240"

  }

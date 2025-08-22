package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STUDYNLEARN device specifications for Android Compose previews.
 *
 * This extension provides STUDYNLEARN device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STUDYNLEARN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STUDYNLEARN: Any
  get() = object {
      /** DeviceSpec(manufacturer=STUDYNLEARN, code=mensa_an64, width=2160, height=3840, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STUDYNLEARN, code=mensa_an64,
      width=2160, height=3840, dpi=480, isGoogleDevice=false).code */
      val MENSA_AN64 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }

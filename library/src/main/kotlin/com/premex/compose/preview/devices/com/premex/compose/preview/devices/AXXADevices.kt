package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AXXA device specifications for Android Compose previews.
 *
 * This extension provides AXXA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AXXA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AXXA: Any
  get() = object {
      /** DeviceSpec(manufacturer=AXXA, code=AXXA_S45_PLUS, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AXXA, code=AXXA_S45_PLUS,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val AXXA_S45_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

  }

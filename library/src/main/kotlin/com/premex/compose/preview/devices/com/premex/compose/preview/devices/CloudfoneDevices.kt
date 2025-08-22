package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cloudfone device specifications for Android Compose previews.
 *
 * This extension provides Cloudfone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cloudfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cloudfone: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cloudfone, code=Go_SP_2, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cloudfone, code=Go_SP_2, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val GO_SP_2 = "spec:width=480,height=854,unit=px,dpi=240"

  }

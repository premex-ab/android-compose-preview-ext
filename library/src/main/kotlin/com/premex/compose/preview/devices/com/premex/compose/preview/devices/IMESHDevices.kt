package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iMESH device specifications for Android Compose previews.
 *
 * This extension provides iMESH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IMESH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IMESH: Any
  get() = object {
      /** DeviceSpec(manufacturer=iMESH, code=IM-560, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iMESH, code=IM-560, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val IM_560 = "spec:width=480,height=800,unit=px,dpi=200"

  }

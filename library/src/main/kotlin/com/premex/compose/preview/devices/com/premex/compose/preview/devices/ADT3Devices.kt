package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ADT-3 device specifications for Android Compose previews.
 *
 * This extension provides ADT-3 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ADT3.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ADT3: Any
  get() = object {
      /** DeviceSpec(manufacturer=ADT-3, code=adt3, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADT-3, code=adt3, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val ADT3 = "spec:width=720,height=1280,unit=px,dpi=240"

  }

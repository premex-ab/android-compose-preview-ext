package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EGOTEK device specifications for Android Compose previews.
 *
 * This extension provides EGOTEK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EGOTEK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EGOTEK: Any
  get() = object {
      /** DeviceSpec(manufacturer=EGOTEK, code=EGO1003, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EGOTEK, code=EGO1003, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val EGO1003 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

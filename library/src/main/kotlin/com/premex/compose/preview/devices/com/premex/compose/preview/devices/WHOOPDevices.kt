package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WHOOP device specifications for Android Compose previews.
 *
 * This extension provides WHOOP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WHOOP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WHOOP: Any
  get() = object {
      /** DeviceSpec(manufacturer=WHOOP, code=TAB-8US2, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WHOOP, code=TAB-8US2, width=800,
      height=1280, dpi=220, isGoogleDevice=false).code */
      val TAB_8US2 = "spec:width=800,height=1280,unit=px,dpi=220"

  }

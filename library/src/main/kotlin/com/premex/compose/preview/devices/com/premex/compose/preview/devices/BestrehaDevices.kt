package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bestreha device specifications for Android Compose previews.
 *
 * This extension provides Bestreha device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bestreha.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bestreha: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bestreha, code=BRN01, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bestreha, code=BRN01, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BRN01 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

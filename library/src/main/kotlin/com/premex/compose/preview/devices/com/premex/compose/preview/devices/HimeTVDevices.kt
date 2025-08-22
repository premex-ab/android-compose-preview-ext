package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HimeTV device specifications for Android Compose previews.
 *
 * This extension provides HimeTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HimeTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HimeTV: Any
  get() = object {
      /** DeviceSpec(manufacturer=HimeTV, code=HIME_B866V2FAS, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HimeTV, code=HIME_B866V2FAS,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val HIME_B866V2FAS = "spec:width=720,height=1280,unit=px,dpi=213"

  }

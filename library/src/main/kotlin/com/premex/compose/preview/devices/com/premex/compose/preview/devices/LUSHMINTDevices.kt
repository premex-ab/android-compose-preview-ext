package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LUSH_MINT device specifications for Android Compose previews.
 *
 * This extension provides LUSH_MINT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LUSHMINT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LUSHMINT: Any
  get() = object {
      /** DeviceSpec(manufacturer=LUSH_MINT, code=LM5314G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUSH_MINT, code=LM5314G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LM5314G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LUSH_MINT, code=LM5514G, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUSH_MINT, code=LM5514G, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val LM5514G = "spec:width=480,height=960,unit=px,dpi=213"

  }

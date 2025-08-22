package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAWLANCE device specifications for Android Compose previews.
 *
 * This extension provides DAWLANCE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DAWLANCE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DAWLANCE: Any
  get() = object {
      /** DeviceSpec(manufacturer=DAWLANCE, code=SW6H, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DAWLANCE, code=SW6H, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DAWLANCE, code=umeda, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DAWLANCE, code=umeda, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }

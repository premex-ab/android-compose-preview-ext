package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HANASIS device specifications for Android Compose previews.
 *
 * This extension provides HANASIS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HANASIS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HANASIS: Any
  get() = object {
      /** DeviceSpec(manufacturer=HANASIS, code=BLAZE, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HANASIS, code=BLAZE, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val BLAZE = "spec:width=1080,height=1920,unit=px,dpi=160"

  }

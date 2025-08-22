package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TAGITAL device specifications for Android Compose previews.
 *
 * This extension provides TAGITAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TAGITAL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TAGITAL: Any
  get() = object {
      /** DeviceSpec(manufacturer=TAGITAL, code=K88, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TAGITAL, code=K88, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K88 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=TAGITAL, code=T7K-PLUS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TAGITAL, code=T7K-PLUS, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T7K_PLUS = "spec:width=600,height=1024,unit=px,dpi=160"

  }

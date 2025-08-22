package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CAPTIVA device specifications for Android Compose previews.
 *
 * This extension provides CAPTIVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CAPTIVA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CAPTIVA: Any
  get() = object {
      /** DeviceSpec(manufacturer=CAPTIVA, code=Pad_10_2_in_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CAPTIVA, code=Pad_10_2_in_1,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PAD_10_2_IN_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CAPTIVA, code=Pad_10_3G_Plus, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CAPTIVA, code=Pad_10_3G_Plus,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val PAD_10_3G_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

  }

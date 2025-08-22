package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOMI device specifications for Android Compose previews.
 *
 * This extension provides NOMI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOMI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOMI: Any
  get() = object {
      /** DeviceSpec(manufacturer=NOMI, code=Nomi_i5532, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOMI, code=Nomi_i5532, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val NOMI_I5532 = "spec:width=720,height=1280,unit=px,dpi=320"

  }

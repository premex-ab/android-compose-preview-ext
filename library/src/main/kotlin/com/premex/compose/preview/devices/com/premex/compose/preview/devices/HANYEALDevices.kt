package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HANYEAL device specifications for Android Compose previews.
 *
 * This extension provides HANYEAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HANYEAL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HANYEAL: Any
  get() = object {
      /** DeviceSpec(manufacturer=HANYEAL, code=E101GC, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HANYEAL, code=E101GC, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E101GC = "spec:width=800,height=1280,unit=px,dpi=160"

  }

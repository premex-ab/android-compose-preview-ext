package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FIVAHIVA device specifications for Android Compose previews.
 *
 * This extension provides FIVAHIVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FIVAHIVA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FIVAHIVA: Any
  get() = object {
      /** DeviceSpec(manufacturer=FIVAHIVA, code=FF1010, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIVAHIVA, code=FF1010, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val FF1010 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FIVAHIVA, code=YY_766, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIVAHIVA, code=YY_766, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val YY_766 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FIVAHIVA, code=YY_766_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIVAHIVA, code=YY_766_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val YY_766_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }

package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MTN device specifications for Android Compose previews.
 *
 * This extension provides MTN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MTN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MTN: Any
  get() = object {
      /** DeviceSpec(manufacturer=MTN, code=Alola_Max, width=576, height=1152, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTN, code=Alola_Max, width=576,
      height=1152, dpi=220, isGoogleDevice=false).code */
      val ALOLA_MAX = "spec:width=576,height=1152,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=MTN, code=G56, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MTN, code=G56, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val G56 = "spec:width=720,height=1560,unit=px,dpi=320"

  }

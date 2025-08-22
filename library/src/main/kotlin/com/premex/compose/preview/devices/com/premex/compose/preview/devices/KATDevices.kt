package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KAT device specifications for Android Compose previews.
 *
 * This extension provides KAT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KAT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KAT: Any
  get() = object {
      /** DeviceSpec(manufacturer=KAT, code=SM1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAT, code=SM1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SM1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KAT, code=SM1_Tablet, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAT, code=SM1_Tablet, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SM1_TABLET = "spec:width=800,height=1280,unit=px,dpi=160"

  }

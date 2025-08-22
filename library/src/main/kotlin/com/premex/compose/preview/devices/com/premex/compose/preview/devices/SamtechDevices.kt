package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Samtech device specifications for Android Compose previews.
 *
 * This extension provides Samtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Samtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Samtech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Samtech, code=T3G_04, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Samtech, code=T3G_04, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T3G_04 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Samtech, code=TWIFI-07, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Samtech, code=TWIFI-07, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TWIFI_07 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Samtech, code=TWIFI_Q07, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Samtech, code=TWIFI_Q07, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TWIFI_Q07 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

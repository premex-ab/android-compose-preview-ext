package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fossil device specifications for Android Compose previews.
 *
 * This extension provides Fossil device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fossil.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fossil: Any
  get() = object {
      /** DeviceSpec(manufacturer=Fossil, code=gila, width=416, height=416, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fossil, code=gila, width=416,
      height=416, dpi=320, isGoogleDevice=false).code */
      val GILA = "spec:width=416,height=416,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Fossil, code=hoki, width=416, height=416, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fossil, code=hoki, width=416,
      height=416, dpi=320, isGoogleDevice=false).code */
      val HOKI = "spec:width=416,height=416,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Fossil, code=sole, width=390, height=390, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Fossil, code=sole, width=390,
      height=390, dpi=320, isGoogleDevice=false).code */
      val SOLE = "spec:width=390,height=390,unit=px,dpi=320"

  }

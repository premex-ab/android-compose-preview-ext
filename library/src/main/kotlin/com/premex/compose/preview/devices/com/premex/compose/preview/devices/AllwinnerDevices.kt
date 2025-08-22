package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Allwinner device specifications for Android Compose previews.
 *
 * This extension provides Allwinner device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Allwinner.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Allwinner: Any
  get() = object {
      /** DeviceSpec(manufacturer=Allwinner, code=apollo-p7, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Allwinner, code=apollo-p7,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val APOLLO_P7 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Allwinner, code=t3-k2001-nwd, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Allwinner, code=t3-k2001-nwd,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val T3_K2001_NWD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Allwinner, code=t3-p1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Allwinner, code=t3-p1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T3_P1 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

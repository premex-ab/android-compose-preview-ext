package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * 2E device specifications for Android Compose previews.
 *
 * This extension provides 2E device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._2E.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._2E: Any
  get() = object {
      /** DeviceSpec(manufacturer=2E, code=capitolhill, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=2E, code=capitolhill, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=2E, code=E450A2018, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=2E, code=E450A2018, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val E450A2018 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=2E, code=F534L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=2E, code=F534L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val F534L = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=2E, code=F572L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=2E, code=F572L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val F572L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=2E, code=keoneae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=2E, code=keoneae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

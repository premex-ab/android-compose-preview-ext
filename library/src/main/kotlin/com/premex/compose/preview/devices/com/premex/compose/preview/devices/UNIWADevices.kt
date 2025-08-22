package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNIWA device specifications for Android Compose previews.
 *
 * This extension provides UNIWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UNIWA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UNIWA: Any
  get() = object {
      /** DeviceSpec(manufacturer=UNIWA, code=K626, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNIWA, code=K626, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val K626 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UNIWA, code=M101, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNIWA, code=M101, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M101 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=UNIWA, code=UNIWA_W888, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNIWA, code=UNIWA_W888, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val UNIWA_W888 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UNIWA, code=UNIWA_W999, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNIWA, code=UNIWA_W999, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val UNIWA_W999 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=UNIWA, code=W555, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNIWA, code=W555, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val W555 = "spec:width=720,height=1520,unit=px,dpi=320"

  }

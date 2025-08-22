package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIWA device specifications for Android Compose previews.
 *
 * This extension provides VIWA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIWA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIWA: Any
  get() = object {
      /** DeviceSpec(manufacturer=VIWA, code=VIWA_LIGHT_ONE, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIWA, code=VIWA_LIGHT_ONE,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val VIWA_LIGHT_ONE = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VIWA, code=VIWA_LIGHT_PLUS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIWA, code=VIWA_LIGHT_PLUS,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val VIWA_LIGHT_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIWA, code=VIWA_V10, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIWA, code=VIWA_V10, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VIWA_V10 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

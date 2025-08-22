package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VIRZO device specifications for Android Compose previews.
 *
 * This extension provides VIRZO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VIRZO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VIRZO: Any
  get() = object {
      /** DeviceSpec(manufacturer=VIRZO, code=V511, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIRZO, code=V511, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V511 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIRZO, code=V608_C, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIRZO, code=V608_C, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val V608_C = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=VIRZO, code=VT1001, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIRZO, code=VT1001, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VT1001 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=VIRZO, code=VT701, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VIRZO, code=VT701, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val VT701 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
